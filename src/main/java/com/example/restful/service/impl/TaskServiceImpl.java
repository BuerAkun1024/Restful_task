package com.example.restful.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restful.dao.TaskDao;
import com.example.restful.pojo.Task;
import com.example.restful.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskDao taskDao;


    @Override
    public boolean addTask(Task task) {
        boolean flag=false;
        try{
            taskDao.addTask(task);
            flag=true;
        }catch(Exception e){
            System.out.println("新增失败!");
            e.printStackTrace();
        }
        return flag;
    }

//    @Override
//    public boolean updateUser(Task task) {
//        boolean flag=false;
//        try{
//            taskDao.updateTask(task);
//            flag=true;
//        }catch(Exception e){
//            System.out.println("修改失败!");
//            e.printStackTrace();
//        }
//        return flag;
//    }

    @Override
    public boolean deleteTask(int id) {
        boolean flag=false;
        try{
            taskDao.deleteTask(id);
            flag=true;
        }catch(Exception e){
            System.out.println("删除失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public Task findTaskByTaskId(int taskId) {
        return taskDao.findBytaskId(taskId);
    }

    @Override
    public List<Task> findAll() {
        return taskDao.findAll();
    }
}


