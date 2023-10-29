package models;

import domain.Handler;

public class TaskHandler implements Handler {
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
