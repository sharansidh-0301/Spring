package com.todoapi.todoapi;
import com.todoapi.todoapi.models.Todo;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/v1/todo")
public class TodoapiController {

    @Autowired
    private TodoapiService todoapiService;

    @ApiResponses(value ={
            @ApiResponse(responseCode = "200", description = "Todo Created Successfully..."),
                @ApiResponse(responseCode = "404", description = "Todo Was Not Found!...")
    })

    @GetMapping("/{id}")
    ResponseEntity<Todo> getById(@PathVariable long id){
        try{
            Todo getTodobyId = todoapiService.getUser(id);
            return new ResponseEntity<>(getTodobyId, HttpStatus.OK);
        }
        catch (RuntimeException e){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

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

    @GetMapping("/page")
    ResponseEntity<Page<Todo>> getTodoByPage(@RequestParam int page, @RequestParam int size){
        return new ResponseEntity<>(todoapiService.getTodoPage(page, size), HttpStatus.OK);
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
