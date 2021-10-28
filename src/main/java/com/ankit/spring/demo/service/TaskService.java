package com.ankit.spring.demo.service;


import com.ankit.spring.demo.dto.Note;
import com.ankit.spring.demo.dto.Task;

import java.util.List;

public interface TaskService {

    public List<Task> findAll();

    public Task findById(int id);

    public int save(Task task, Note note);

    public void deleteById(int id);


}
