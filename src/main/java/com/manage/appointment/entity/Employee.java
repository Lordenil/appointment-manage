package com.manage.appointment.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Schedule> schedule;
}
