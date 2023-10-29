package models;

import domain.Component;
import domain.Mediator;

public class TaskComponent implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void addTask(Task task) {
        mediator.notify(task, "ADDED");
    }
}

