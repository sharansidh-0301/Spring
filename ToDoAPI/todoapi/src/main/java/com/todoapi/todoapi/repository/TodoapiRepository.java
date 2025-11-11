package com.todoapi.todoapi.repository;

import com.todoapi.todoapi.models.Todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoapiRepository extends JpaRepository<Todo, Long>{
}
