package com.todoapi.todoapi;

import com.todoapi.todoapi.models.Todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoapiRepository extends JpaRepository<Todo, Long>{
}
