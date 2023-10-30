## Design Patterns Report: Task Management System using Behavioral Design Patterns

This report provides an overview of the design patterns employed in our "Task Management System" project. The aim of the project is to showcase the usage of Behavorial Design Patterns.

### Iterator Pattern

#### Overview
The Iterator Pattern provides a way to access elements of a collection without exposing the underlying representation.

#### Implementation
In our design, `TaskIterator` implements the `Iterator` interface, allowing sequential access to a list of `Task` objects. Here's a code snippet:
```java
class TaskIterator implements Iterator<Task> {
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
```

### Chain of Responsibility Pattern

#### Overview
The Chain of Responsibility Pattern decouples the sender from receiver by allowing more than one object to handle a request.


### Implementation
In our design, the TaskHandler class implements the Handler interface and is responsible for handling specific types of requests. Here's a code snippet:

```java
class TaskHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equals("TASK")) {
            System.out.println("Handling task");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
```

### Observer Pattern

#### Overview
The Observer Pattern allows an object (known as the subject) to maintain a list of its dependents and notify them of any state changes.

#### Implementation
Our design uses a TaskManager (subject) and TaskObserver (observer). When a new task is added to the TaskManager, all observers are notified. Here's a code snippet:

```java
class TaskObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Task updated: " + message);
    }
}
```

### Mediator Pattern

#### Overview
The Mediator Pattern defines an object that encapsulates how a set of objects interact. This pattern promotes loose coupling by ensuring that instead of objects referring to each other explicitly, they refer to a mediator.

#### Implementation
In our design, the TaskMediator acts as the mediator between TaskComponent and TaskManager. Here's a code snippet:

```java
class TaskMediator implements Mediator {
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
```

## Conclusion

This report highlighted four essential design patterns: Iterator, Chain of Responsibility, Observer, and Mediator. These patterns contribute significantly to the scalability and maintainability of software systems. By understanding and implementing these patterns, developers can ensure their software remains adaptable and robust in the face of evolving requirements.

