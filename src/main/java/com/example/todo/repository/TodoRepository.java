// Write your code here
package com.example.todo.repository;

import java.util.ArrayList;

import com.example.todo.model.Todo;

public interface TodoRepository {

	ArrayList<Todo> getTodoList();

	Todo addTodo(Todo todo);

	Todo getTodoById(int todoId);

	Todo updateTodo(int todoId, Todo todo);

	void deleteTodo(int todoId);

}
