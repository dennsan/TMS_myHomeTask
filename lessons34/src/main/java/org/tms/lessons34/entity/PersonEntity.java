package org.tms.lessons34.entity;

import lombok.*;
import org.tms.lessons34.Department;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "persons")
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 1024)
    private String name;
    private boolean work;
    @Temporal(TemporalType.DATE)
    private Date dateWork;
    @Enumerated(EnumType.STRING)
    private Department department;
    @ManyToOne
    @ToString.Exclude
    private PhoneEntity phone;
}
