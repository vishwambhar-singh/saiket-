import java.util.LinkedList;

 class TodoList{
    private LinkedList<Task> tasks;

    public TodoList() {
        tasks = new LinkedList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void markComplete(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equals(title)) {
                task.setStatus("complete");
                break;
            }
        }
    }

    public void displayTasks() {
        for (Task task : tasks) {
            System.out.println(task.getTitle() + ": " + task.getStatus());
        }
    }
}

public class Task {
    private String title;
    private String status;

    public Task(String title, String status) {
        this.title = title;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

