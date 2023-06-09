package Project;

public class Project {
    protected String name;
    protected String startDate;
    protected int deadline;
    protected String clientName;

    protected String shortDescription;

    protected ProjectStatus projectStatus;


    public Project() {

    }

    public Project(String name, String startDate, int deadline, String clientName, String shortDescription, ProjectStatus projectStatus) {
        this.name = name;
        this.startDate = startDate;
        this.deadline = deadline;
        this.clientName = clientName;
        this.shortDescription = shortDescription;
        this.projectStatus = projectStatus;
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

    public ProjectStatus getStatus() {
        return projectStatus;
    }

    public void setStatus(ProjectStatus projectStatus) {
        this.projectStatus = projectStatus;
    }


    //ToString


    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", startDate='" + startDate + '\'' +
                ", deadline=" + deadline +
                ", clientName='" + clientName + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", projectStatus=" + projectStatus +
                '}';
    }
}






