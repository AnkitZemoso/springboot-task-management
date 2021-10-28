package com.ankit.spring.demo.service;

import com.ankit.spring.demo.dao.TaskRepository;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;

@ExtendWith(MockitoExtension.class)
class TaskServiceTest {

    @MockBean
    private TaskRepository taskRepository;

    @InjectMocks
    private TaskService taskService;




}
