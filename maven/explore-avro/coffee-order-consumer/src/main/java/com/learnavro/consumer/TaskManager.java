package com.learnavro.consumer;

/**
 * The TaskManager class represents a task with a description and a done flag.
 */
public class TaskManager {
    private final String description;
    private boolean done;

    /**
     * Constructs a new TaskManager with the specified description.
     * The task is initially not done.
     *
     * @param description the description of the task
     */
    public TaskManager(String description) {
        this.description = description;
        this.done = false;
    }

    /**
     * Returns the description of the task.
     *
     * @return the description of the task
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns whether the task is done.
     *
     * @return true if the task is done, false otherwise
     */
    public boolean isDone() {
        return done;
    }

    /**
     * Sets the task as done or not done.
     *
     * @param done true to mark the task as done, false to mark it as not done
     */
    public void setDone(boolean done) {
        this.done = done;
    }
}