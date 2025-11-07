package com.todoapi.todoapi;


import com.todoapi.todoapi.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoapiService {

    @Autowired
    private TodoapiRepository todoapiRepository;

    public Todo getUser(Long id){
        return todoapiRepository.findById(id).orElseThrow(()-> new RuntimeException("Todo Not Found"));
    }

    public Todo createTodo(Todo todo){
        return todoapiRepository.save(todo);
    }

    public List<Todo> getAllTodo() {
        return todoapiRepository.findAll();
    }

    public Todo updateTodo(Todo todo){
        return todoapiRepository.save(todo);
    }

    public void deleteTodo(Long id){
        todoapiRepository.delete(getUser(id));
    }
}
