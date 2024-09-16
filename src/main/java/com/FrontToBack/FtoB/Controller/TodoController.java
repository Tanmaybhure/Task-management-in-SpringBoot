package com.FrontToBack.FtoB.Controller;

import com.FrontToBack.FtoB.Model.ApiResponse;
import com.FrontToBack.FtoB.Service.TodoService;
import com.FrontToBack.FtoB.Model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class TodoController {
    @Autowired
    private TodoService todo;

    @GetMapping("/api")
    public ApiResponse homeControl(){
        ApiResponse res= new ApiResponse();
        res.setStatus(true);
        res.setMessage("welcome");
        return res;
    }
    @GetMapping("/api/todos")
    public List<Todo> getallTodos(){
        return todo.getallTodos();
    }
    @PostMapping("/api/todos")
    public Todo createTodo(@RequestBody Todo obj){
        return todo.createTodo(obj);
    }

    @DeleteMapping("/api/todos/{id}")
    public ApiResponse deleteTodo(@PathVariable Long id){
        todo.deleteTodo(id);
        ApiResponse api= new ApiResponse();
        api.setMessage("Todo Delete Successfully");
        api.setStatus(true);
        return api;
    }
}
