package org.tms.lessons36.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tms.lessons36.enumerated.Role;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name ="users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String sex;
    @Enumerated(EnumType.STRING)
    private Role role;
//    @Temporal(TemporalType.DATE)
    private LocalDate birthday;
    @OneToMany(mappedBy = "user")
    private List<TaskEntity> tasks;

    public void addTask(TaskEntity task){
        if(tasks == null){
            tasks= new ArrayList<>();
        }
        tasks.add(task);
        task.setUser(this);
    }
}
