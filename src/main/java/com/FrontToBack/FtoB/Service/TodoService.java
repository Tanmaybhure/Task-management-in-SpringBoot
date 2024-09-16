package com.FrontToBack.FtoB.Service;
import com.FrontToBack.FtoB.Model.Todo;

import java.util.*;
public interface TodoService {

    public List<Todo> getallTodos();
    public Todo createTodo(Todo todo);
    public void deleteTodo(Long todoId);
}
