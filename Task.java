public class Task implements Priority {
    private String taskName;
    private int priority;
    public Task(String taskName, int priority) {
        this.taskName = taskName;
        setPriority(priority);
    }
  
    @Override
    public void setPriority(int priority) {
        if (priority < 1) {
            this.priority = 1;
        } else if (priority > 5) {
            this.priority = 5;
        } else {
            this.priority = priority;
        }
    }
    @Override
    public int getPriority() {
        return priority;
    }
    @Override
    public String toString() {
        return String.format("%-20s priority: %d", taskName, priority);
    }
}
