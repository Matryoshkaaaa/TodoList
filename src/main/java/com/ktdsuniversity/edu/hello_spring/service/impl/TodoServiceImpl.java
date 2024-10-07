package com.ktdsuniversity.edu.hello_spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktdsuniversity.edu.hello_spring.dao.TodoDao;
import com.ktdsuniversity.edu.hello_spring.service.TodoService;
import com.ktdsuniversity.edu.hello_spring.vo.TodoListVO;
import com.ktdsuniversity.edu.hello_spring.vo.TodoVO;
import com.ktdsuniversity.edu.hello_spring.vo.TodoWriteVO;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoDao todoDao;

	@Override
	public TodoListVO getAllTodo() {

		List<TodoVO> TodoList = this.todoDao.selectAllTodo(); // todolist 목록 조회
		TodoListVO todoListVO = new TodoListVO(); // TodoListVO를 만든다
		todoListVO.setTodolist(TodoList); // 목록 할당
		return todoListVO;

	}

	@Override
	public boolean completeTodo(int id) {
		TodoVO todoVO = this.todoDao.selectOneTodo(id);
		if (todoVO != null) {
			todoVO.setStatus("Done"); 
			return todoDao.updateTodo(todoVO) > 0; 
		}
		return false;
	}

	@Override
	public boolean addTodo(TodoWriteVO todoWriteVO) {
		return todoDao.insertTodo(todoWriteVO) > 0;
	}

	@Override
	public boolean updateTodo(TodoVO todoVO) {
		return todoDao.updateTodo(todoVO) > 0;
	}

	@Override
	public boolean deleteTodo(int id) {
		return todoDao.deleteTodo(id) > 0;
	}
}
