package com.taskManager;
import com.taskManager.Enums.TaskStatus;

public class Task {
    static int LastId;
    public int id;
    public String description;
    public TaskStatus status;
    public Task(String description) {
        this.id = LastId + 1;
        this.description = description;
        this.status = TaskStatus.New;
    }
}
