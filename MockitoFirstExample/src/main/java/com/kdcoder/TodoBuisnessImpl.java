package com.kdcoder;

import java.util.ArrayList;
import java.util.List;

public class TodoBuisnessImpl {
	private TodoService todoService;

	public TodoBuisnessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	public List<String> retriveTodosReleatedToSpring(String user){
		List<String> filterdTodo = new ArrayList<String>();
		List<String> todos = todoService.retriveTodos(user);
		
		for(String todo: todos) {
			if(todo.contains("Spring")) {
				filterdTodo.add(todo);
			}
		}
		return filterdTodo;
	}
}
