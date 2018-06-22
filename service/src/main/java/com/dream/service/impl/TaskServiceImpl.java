package com.dream.service.impl;

import com.dream.dao.domain.Task;
import com.dream.dao.utils.Response;
import com.dream.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yangshikang on 22/06/2018.
 */
@Service
public class TaskServiceImpl extends BaseService implements TaskService {

    @Override
    public Response<List<Task>> list() {

        List<Task> taskList= taskMapper.selectAll();
        return Response.success(taskList);
    }

    @Override
    public Response<Task> getById(int id) {

        Task task = new Task();
        task.setId(id);
        task = taskMapper.selectOne(task);
        return Response.success(task);
    }

    @Override
    public Response<List<Task>> getByUserId(int userId) {

        Task task = new Task();
        task.setUserId(userId);
        List<Task> taskList = taskMapper.select(task);
        return Response.success(taskList);
    }

    @Override
    public void insert(Task task) {
        taskMapper.insertSelective(task);
    }

    @Override
    public void update(Task task) {
        taskMapper.updateByPrimaryKeySelective(task);
    }
}
