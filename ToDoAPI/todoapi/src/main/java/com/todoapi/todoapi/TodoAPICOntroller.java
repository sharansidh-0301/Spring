package com.todoapi.todoapi;
import com.todoapi.todoapi.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/v1/todo")
public class TodoapiController {

    @Autowired
    private TodoapiService todoapiService;

    @GetMapping("/{id}")
    ResponseEntity<Todo> getById(@PathVariable long id){
        return new ResponseEntity<>(todoapiService.getUser(id), HttpStatus.OK);
    }
    @PostMapping("/create")
    ResponseEntity<Todo> postTodo(@RequestBody Todo todo){
        Todo createdtodo = todoapiService.createTodo(todo);
        return new ResponseEntity<>(createdtodo,  HttpStatus.CREATED);
    }

    @GetMapping
    ResponseEntity<List<Todo>> getAll(){
        return new ResponseEntity<List<Todo>>(todoapiService.getAllTodo(), HttpStatus.OK);
    }

    @PutMapping
    ResponseEntity<Todo> putTodo(@RequestBody Todo todo){
        return new ResponseEntity<>(todoapiService.updateTodo(todo), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    void deleteTodo(@PathVariable long id){
        todoapiService.deleteTodo(id);
    }
}
