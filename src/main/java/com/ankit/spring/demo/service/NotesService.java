package com.ankit.spring.demo.service;


import com.ankit.spring.demo.dto.Note;

public interface NotesService {

    public Note findById(int id);

    public void deleteById(int id);


}
