/**
 * 
 */
package com.todo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Anoop
 *
 */
@Repository
public interface TodoRepository extends JpaRepository<TodoRepo, Integer> {

}
