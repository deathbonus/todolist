package com.deathbonus.todolist3;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface TaskRepository extends PagingAndSortingRepository<Task, UUID> {
}
