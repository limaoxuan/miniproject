package com.max.miniproject.domin;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;


@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "mini_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long id;
    @Column(name = "first_name")
    private String first;
    @Column(name = "last_name")
    private String last;
    @Column(name = "gpa")
    private Double gap;

    @JsonIgnore
    @Transient
    private Integer age;
    @Column(name = "dob")
    private Date dob;
//    private Date dob;


    public Student(Student stu) {
    }

    public Student(String first, String last, Double gap, Integer age) {
        this.first = first;
        this.last = last;
        this.gap = gap;
        this.age = age;
        this.transfer();
    }


    public void transfer() {
        this.dob = new Date();
        this.dob.setYear(this.dob.getYear() - age);
        this.dob.setMonth(0);
        this.dob.setDate(1);
    }


}
