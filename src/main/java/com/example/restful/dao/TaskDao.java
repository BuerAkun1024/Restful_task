package com.example.restful.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.restful.pojo.Task;

@Mapper
public interface TaskDao {

    /**
     * 用户数据新增
     */
//    @Insert("insert into list(id,content,createdTime) values (#{id},#{content},#{createdTime})")
    @Insert("insert into list(id,content) values (#{id},#{content})")
    void addTask(Task task);

    /**
     * 用户数据修改
     */
//    @Update("update t_user set name=#{name},age=#{age} where id=#{id}")
//    void updateUser(Task task);

    /**
     * 用户数据删除
     */
    @Delete("delete from list where id=#{id}")
    void deleteTask(int id);

    /**
     * 根据用户名称查询用户信息
     *
     */
    @Select("SELECT id,content,createdTime FROM list where id=#{taskId}")
    Task findBytaskId(int taskId);

    /**
     * 查询所有
     */
    @Select("SELECT id,content,createdTime FROM list")
    List<Task> findAll();

}

