package org.example.todo.service;

import org.example.todo.model.Todo;


import java.util.List;

public interface TodoService {

    public List<Todo> getAllTodos();


    public Todo createTodo( Todo todo) ;


    public Todo getTodoById( Long id) ;


    public Todo updateTodoById( Long id,  Todo todo) ;


    public void deleteTodoById( Long id) ;

}
