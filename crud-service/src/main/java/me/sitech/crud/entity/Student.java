package me.sitech.crud.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name = "Student")
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @NotBlank(message = "Name is mandatory")
    @Column(name = "name",length = 100)
    private String name;
    
    @NotBlank(message = "Email is mandatory")
    @Column(name = "email",length = 150, unique = true)
    private String email;

    @Column(name = "phone_no", length = 16, unique = true)
    private Long phoneNo;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

}