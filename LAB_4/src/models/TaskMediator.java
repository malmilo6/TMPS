package models;

import domain.Mediator;
import domain.Component;

public class TaskMediator implements Mediator {
    private TaskManager taskManager;

    public TaskMediator(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender instanceof Task && event.equals("ADDED")) {
            taskManager.addTask((Task) sender);
        }
    }
}

