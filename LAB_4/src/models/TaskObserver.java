package models;

import domain.Observer;

public class TaskObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Task updated: " + message);
    }
}
