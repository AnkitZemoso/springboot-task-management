package com.ankit.spring.demo.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.util.List;

@Data
public class Task {

    private int id;

    @NotNull
    private String title;
    @NotNull
    private String status;

    @NotNull
    private Date startDate;
    @NotNull
    private Date endDate;

    private List<Note> taskNotes;
}
