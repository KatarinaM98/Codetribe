package Project;

public class Project {
    protected String name;
    protected String startDate;
    protected int deadline;
    protected String clientName;

    protected String shortDescription;

    protected Status status;


    public Project() {

    }

    public Project(String name, String startDate, int deadline, String clientName, String shortDescription, Status status) {
        this.name = name;
        this.startDate = startDate;
        this.deadline = deadline;
        this.clientName = clientName;
        this.shortDescription = shortDescription;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Project.Status getStatus() {
        return status;
    }

    public void setStatus(Project.Status status) {
        this.status = status;
    }
}

