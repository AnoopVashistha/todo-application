/**
 * 
 */
package com.todo.repo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Anoop
 *
 */
@Entity
@Table
public class TodoRepo {

	@Id
	private int taskId;
	
	@Column
	private String taskName;

	/**
	 * @return the taskId
	 */
	public int getTaskId() {
		return taskId;
	}

	/**
	 * @param taskId the taskId to set
	 */
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName;
	}

	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	
}
