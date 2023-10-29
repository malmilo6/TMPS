package client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import domain.*;
import models.*;

public class Main {
    public static void main(String[] args) {
        // Iterator pattern usage
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");
        List<Task> tasks = Arrays.asList(task1, task2);
        Iterator<Task> taskIterator = new TaskIterator(tasks);
        while (taskIterator.hasNext()) {
            System.out.println(taskIterator.next().getName());
        }

        // Chain of Responsibility pattern usage
        Handler taskHandler = new TaskHandler();
        taskHandler.handleRequest("TASK");

        // Observer pattern usage
        TaskManager taskManager = new TaskManager();
        Observer taskObserver = new TaskObserver();
        taskManager.addObserver(taskObserver);
        taskManager.addTask(new Task("Task 3"));

        // Mediator pattern usage
        TaskMediator taskMediator = new TaskMediator(taskManager);
        TaskComponent taskComponent = new TaskComponent();
        taskComponent.setMediator(taskMediator);
        taskComponent.addTask(new Task("Task 4"));
    }
}
