package com.example.restful.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restful.pojo.Task;
import com.example.restful.service.TaskService;

/**
 *
 * Title: UserRestController
 * Description:
 * 用户控制层
 */
@RestController
@RequestMapping(value = "/api")
public class TaskRestController {
    @Autowired
    private TaskService taskService;

    @RequestMapping(value = "/tasks", method = RequestMethod.POST)   // 2  POST /api/tasks/
    public boolean addUser(@RequestBody Task task) {
        System.out.println("开始新增...");
        return taskService.addTask(task);
    }

//    @RequestMapping(value = "/user", method = RequestMethod.PUT)
//    public boolean updateUser(@RequestBody User user) {
//        System.out.println("开始更新...");
//        return userService.updateUser(user);
//    }

    @RequestMapping(value = "/tasks", method = RequestMethod.DELETE)  // 4  DELETE /api/tasks/{id}
    public boolean delete(@RequestParam(value = "taskId", required = true) int taskId) {
        System.out.println("开始删除...");
        return taskService.deleteTask(taskId);
    }

    @RequestMapping(value = "/tasks", method = RequestMethod.GET)     //  3 GET /api/tasks/{id}
    public Task findByUserName(@RequestParam(value = "taskId", required = true) int taskId) {
        System.out.println("开始查询...");
        return taskService.findTaskByTaskId(taskId);
    }


    @RequestMapping(value = "/taskALL", method = RequestMethod.GET) //  1  GET /api/tasks/
    public List<Task> findByAll() {
        System.out.println("开始查询所有数据...");
        return taskService.findAll();
    }
}

