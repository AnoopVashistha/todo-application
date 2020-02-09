/**
 * 
 */
package com.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParser;
import com.todo.response.TodoDTO;
import com.todo.service.TodoService;

/**
 * @author Anoop
 *
 */
@RestController
public class TodoController {

	@Autowired
	TodoService todoService;

	@RequestMapping(value = "api/v1/todoApps", method = RequestMethod.POST)
	public String createTodoList( @RequestBody TodoDTO todoDTO ) {
		todoService.createTodoList(todoDTO);
		return "task created";
	}

	@RequestMapping(value = "api/v1/todoApps/list", method = RequestMethod.GET)
	public TodoDTO retrieveTodoList() {
		return todoService.retrieveTodoList();
	}

}
