package com.ankit.spring.demo.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class Note {

    private int id;

    private String description;
    private Date createdAt;
    private Date modifiedAt;
    private int taskId;
}
