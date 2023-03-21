package Project;

public class Tasks {
    protected String name;
    protected String taskSpecification;
    protected TaskStatus statusOfTheTask;
    protected int deadline;



    public Tasks() {

    }

    public Tasks(String name, String taskSpecification, TaskStatus statusOfTheTask, int deadline) {
        this.name = name;
        this.taskSpecification = taskSpecification;
        this.statusOfTheTask = statusOfTheTask;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaskSpecification() {
        return taskSpecification;
    }

    public void setTaskSpecification(String taskSpecification) {
        this.taskSpecification = taskSpecification;
    }

    public TaskStatus getStatusOfTheTask() {
        return statusOfTheTask;
    }

    public void setStatusOfTheTask(TaskStatus statusOfTheTask) {
        this.statusOfTheTask = statusOfTheTask;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }





}
