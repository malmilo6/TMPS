package models;

import java.util.List;
import domain.Iterator;

public class TaskIterator implements Iterator<Task> {
    private List<Task> tasks;
    private int index = 0;

    public TaskIterator(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean hasNext() {
        return index < tasks.size();
    }

    @Override
    public Task next() {
        return hasNext() ? tasks.get(index++) : null;
    }
}
