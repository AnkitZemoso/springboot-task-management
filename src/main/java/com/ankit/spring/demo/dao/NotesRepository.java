package com.ankit.spring.demo.dao;


import com.ankit.spring.demo.entity.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<NoteEntity, Integer> {

}
