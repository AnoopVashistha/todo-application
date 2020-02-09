/**
 * 
 */
package com.todo.service;

import org.springframework.stereotype.Service;

import com.todo.response.TodoDTO;

/**
 * @author Anoop
 *
 */
@Service
public class TodoServiceImpl implements TodoService {

	@Override
	public TodoDTO retrieveTodoList() {
		TodoDTO todoDTOObject = new TodoDTO();
		todoDTOObject.setTaskId(1);
		todoDTOObject.setTaskName("jogging");

		// get data from databse
		// fill in object
		// return that object
		return todoDTOObject;
	}

	@Override
	public TodoDTO retireveTodoListById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createTodoList(TodoDTO todoDto) {
		System.out.println(todoDto.getTaskId() + "" + todoDto.getTaskName());
		// save data to database
	}
}