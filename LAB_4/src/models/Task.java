package models;

import domain.Component;
import domain.Mediator;

public class Task implements Component {
    private String name;
    private Mediator mediator;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void add() {
        mediator.notify(this, "ADDED");
    }
}
