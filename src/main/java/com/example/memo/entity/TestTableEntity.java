package com.example.memo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Table(name = "testTable")
@Entity
public class TestTableEntity {


    @Id
    private Integer id;

    private String name;

    private String ouccupation;

    private Integer height;

    private String profile;

    private LocalDate date;

}
