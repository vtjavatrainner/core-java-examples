package com.pcstraining.core.threads;

public class RunnableCaller implements Runnable{
    private final String message;
    private final DisplayService displayService;

    public RunnableCaller(String message, DisplayService displayService) {
        this.message = message;
        this.displayService = displayService;
    }

    @Override
    public void run() {
        displayService.display(message);
    }
}
