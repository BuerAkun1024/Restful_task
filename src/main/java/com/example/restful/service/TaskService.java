package com.example.restful.service;

import java.util.List;

import com.example.restful.pojo.Task;

public interface TaskService {

    boolean addTask(Task task);

//    boolean upTask(Task task);

    boolean deleteTask(int id);

    Task findTaskByTaskId(int id);

    /**
     * 查询所有
     * @return
     */
    List<Task> findAll();
}

