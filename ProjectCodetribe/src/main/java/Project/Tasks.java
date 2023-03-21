package Project;

public class Tasks extends Project {
    protected String taskName;
    protected String taskSpecification;
    protected TaskStatus statusOfTheTask;
    protected int taskDeadline;



    public Tasks() {

    }

    public Tasks(String name, String startDate, int deadline, String clientName, String shortDescription, ProjectStatus projectStatus,
            String taskName, String taskSpecification, TaskStatus statusOfTheTask, int taskDeadline) {
        super(name, startDate, deadline, clientName, shortDescription, projectStatus);
        this.taskName = taskName;
        this.taskSpecification = taskSpecification;
        this.statusOfTheTask = statusOfTheTask;
        this.taskDeadline = taskDeadline;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
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

    public int getTaskDeadline() {
        return taskDeadline;
    }

    public void setTaskDeadline(int taskDeadline) {
        this.taskDeadline = taskDeadline;
    }


    //toString


    @Override
    public String toString() {
        return "Tasks{" +
                "taskName='" + taskName + '\'' +
                ", taskSpecification='" + taskSpecification + '\'' +
                ", statusOfTheTask=" + statusOfTheTask +
                ", taskDeadline=" + taskDeadline +
                ", name='" + name + '\'' +
                ", startDate='" + startDate + '\'' +
                ", deadline=" + deadline +
                ", clientName='" + clientName + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", projectStatus=" + projectStatus +
                '}';
    }
}
