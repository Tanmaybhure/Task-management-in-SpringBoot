package com.FrontToBack.FtoB.Service;

import com.FrontToBack.FtoB.Repository.TodoRepo;
import com.FrontToBack.FtoB.Model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService{
    @Autowired
    private TodoRepo Todoobj;
    @Override
    public List<Todo> getallTodos() {
        return Todoobj.findAll();
    }

    @Override
    public Todo createTodo(Todo obj) {
        return Todoobj.save(obj);
    }

    @Override
    public void deleteTodo(Long todoId) {
        Todoobj.deleteById(todoId);
    }
}
