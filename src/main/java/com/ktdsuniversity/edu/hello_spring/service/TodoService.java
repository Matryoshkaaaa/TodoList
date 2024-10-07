package com.ktdsuniversity.edu.hello_spring.service;

import com.ktdsuniversity.edu.hello_spring.vo.TodoListVO;
import com.ktdsuniversity.edu.hello_spring.vo.TodoVO;
import com.ktdsuniversity.edu.hello_spring.vo.TodoWriteVO;

public interface TodoService {

	public TodoListVO getAllTodo();
	
	public boolean completeTodo(int id);
	
	public boolean addTodo(TodoWriteVO todoWriteVO);
	
	public boolean updateTodo(TodoVO todoVO);
	
	public boolean deleteTodo(int id);
	
}
