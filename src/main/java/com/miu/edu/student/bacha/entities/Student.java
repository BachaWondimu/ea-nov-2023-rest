package com.miu.edu.student.bacha.entities;

import lombok.Getter;
import lombok.Setter;


import java.util.List;
@Getter
@Setter
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private double  gpa;
    private List<Course> coursesTaken;
    private boolean deleted;

}
