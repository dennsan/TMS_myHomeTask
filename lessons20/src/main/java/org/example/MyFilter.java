package org.example;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = "/home")
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig)  {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse)response;
        Cookie[] cookies = req.getCookies();
        for (Cookie c : cookies
        ) {
            if (c.getName().equals("key")) {
                chain.doFilter(request, response);
            }else {
                resp.getWriter().println("Error");
            }
        }
    }

    @Override
    public void destroy() {

    }
}
