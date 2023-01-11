package com.groupeisi.scolarite.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Data
public class Student {
    @Id
    @GeneratedValue
    private int id;
    private String fullName;
    private String grade;

    public Student(String fullName, String grade) {
        this.fullName = fullName;
        this.grade = grade;
    }
}
