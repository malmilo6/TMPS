package models;
import java.util.ArrayList;
import java.util.List;

import domain.Observer;
import domain.Subject;

public class TaskManager implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void addTask(Task task) {
        
        notifyObservers("New task added: " + task.getName());
    }
}
