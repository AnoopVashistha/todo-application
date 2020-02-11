/**
 * 
 */
package com.todo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.repo.TodoRepo;
import com.todo.repo.TodoRepository;
import com.todo.response.TodoDTO;

/**
 * @author Anoop
 *
 */
@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	TodoRepository repository;

	@Override
	public TodoDTO retrieveTodoList() {
		//repository.findAll();

		// get data from databse
		// fill in object
		// return that object
		return null;
	}

	@Override
	public TodoDTO retireveTodoListById(int taskId) {
		Optional<TodoRepo> repo = repository.findById(taskId);
		
		TodoDTO dto = null;
		if (repo.isPresent()) {
			dto = new TodoDTO();
			dto.setTaskId(repo.get().getTaskId());
			dto.setTaskName(repo.get().getTaskName());
		}
		return dto;
	}

	@Override
	public void createTodoList(TodoDTO todoDto) {
		// System.out.println(todoDto.getTaskId() + "" + todoDto.getTaskName());
		TodoRepo todoTable = new TodoRepo();
		todoTable.setTaskId(todoDto.getTaskId());
		todoTable.setTaskName(todoDto.getTaskName());

		repository.save(todoTable);
	}
}