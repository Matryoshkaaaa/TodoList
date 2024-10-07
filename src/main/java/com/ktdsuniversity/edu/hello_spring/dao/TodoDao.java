package com.ktdsuniversity.edu.hello_spring.dao;

import java.util.List;

import com.ktdsuniversity.edu.hello_spring.vo.TodoVO;
import com.ktdsuniversity.edu.hello_spring.vo.TodoWriteVO;

public interface TodoDao {
	
	public List<TodoVO> selectAllTodo();
	
	public TodoVO selectOneTodo(int id);
	
	public int insertTodo(TodoWriteVO todoWriteVO);
	
	public int deleteTodo(int id);
	
	public int updateTodo(TodoVO todoVO);
}
