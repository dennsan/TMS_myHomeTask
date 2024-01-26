package com.tms.lessons49.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class TokenService {
    @Value("hghgjhgjhgjhgljsdghaflgdfvuyrajdsvcaudvukvjhvudv")
    private String secret;

    private SecretKey secretKey;
    @PostConstruct
    public void init(){
        byte[] bytes = secret.getBytes();
        secretKey = Keys.hmacShaKeyFor(bytes);
    }
    public String createToken(UserDetails userDetails){

        String username = userDetails.getUsername();
        var authorities = userDetails.getAuthorities();
        var roles = authorities.stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.joining(","));

        return Jwts.builder()
                .setSubject(username)
                .claim("login", username)
                .claim("roles", roles)
                .claim("tms", "TMS_C_23")
                .signWith(secretKey)
                .compact();
    }
    public Authentication fromToken(String token){
        JwtParser build = Jwts.parser()
                .setSigningKey(secretKey)
                .build();
        Claims payload = build.parseClaimsJws(token).getPayload();
        Object login = payload.get("login");
        String roles = (String)payload.get("roles");
        List<SimpleGrantedAuthority> collect = Arrays.stream(roles.split(","))
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
        return new UsernamePasswordAuthenticationToken(login,null,collect);
    }
}
