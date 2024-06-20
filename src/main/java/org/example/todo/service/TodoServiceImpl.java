package org.example.todo.service;

import jakarta.validation.Valid;
import org.example.todo.exception.ResourceNotFoundException;
import org.example.todo.model.Todo;
import org.example.todo.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    private final TodoRepo todoRepo;

    @Autowired
    public TodoServiceImpl(TodoRepo todoRepo) {
        this.todoRepo = todoRepo;
    }

    public List<Todo> getAllTodos() {
        return todoRepo.findAll();
    }


    public Todo createTodo(@Valid Todo todo) {
        return todoRepo.save(todo);
    }


    public Todo getTodoById( Long id) {
        return todoRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Todo not found with id: " + id));
    }


    public Todo updateTodoById( Long id,@Valid  Todo todo) {
        Todo existingTodo = todoRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Todo not found with id: " + id));
        existingTodo.setTitle(todo.getTitle());
        existingTodo.setDescription(todo.getDescription());
        existingTodo.setCompleted(todo.isCompleted());
        return todoRepo.save(existingTodo);
    }


    public void deleteTodoById( Long id) {
        Todo todo = todoRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Todo not found with id: " + id));
        todoRepo.delete(todo);
    }

}
