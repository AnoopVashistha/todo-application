/**
 * 
 */
package com.todo.service;

import com.todo.response.TodoDTO;

/**
 * @author Anoop
 *
 */
public interface TodoService {

	void createTodoList(TodoDTO todoDto);

	TodoDTO retrieveTodoList();
	
	TodoDTO retireveTodoListById(int id);
}
