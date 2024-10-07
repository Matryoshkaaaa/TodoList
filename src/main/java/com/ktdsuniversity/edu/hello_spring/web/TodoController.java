package com.ktdsuniversity.edu.hello_spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ktdsuniversity.edu.hello_spring.service.TodoService;
import com.ktdsuniversity.edu.hello_spring.vo.TodoListVO;
import com.ktdsuniversity.edu.hello_spring.vo.TodoWriteVO;

@Controller
public class TodoController {

	@Autowired
	private TodoService todoService;

	@GetMapping("/todo/list")
	public String viewTodoList(Model model) {
		
		TodoListVO todoListVO = this.todoService.getAllTodo();

		model.addAttribute("todoListVO", todoListVO);

		return "todo/todolist";
	}
	
	@GetMapping("/todo/write")
	public String viewTodoWrite() {
		return "todo/todowrite";
	}
	
	@PostMapping("/todo/write")
	public String doCreateNewTodo(TodoWriteVO todoWriteVO) {
		this.todoService.addTodo(todoWriteVO);
		return "redirect:/todo/list";
	}
	
	@GetMapping("/todo/complete/{id}")
	public String completeTodo(@PathVariable int id) {
		this.todoService.completeTodo(id);
		return "redirect:/todo/list";
	}
	
	@GetMapping("/todo/delete/{id}")
	public String doDeleteOneTodo(@PathVariable int id) {
		this.todoService.deleteTodo(id);
		
	
		return "redirect:/todo/list";
	}
	
}
