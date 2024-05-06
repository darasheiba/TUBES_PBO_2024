package TUBES;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Nasya Kirana M
 */
public class Project {
    private String projectID;
    private String projectName;
    private String PMName;
    private Date startDate;
    private Date endDate;
    private List<Task> projectTasks;
    private List<Task> projectTeam;
    
    public Project(String projectID, String projectName, String PMName, 
            Date startDate, Date endDate  ){
        
        this.projectID = projectID;
        this.projectName = projectName;
        this.PMName = PMName;
        this.startDate = startDate;
        this.projectTasks = new ArrayList<>();
        this.projectTeam = new ArrayList<>();
    }   

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getPMName() {
        return PMName;
    }

    public void setPMName(String PMName) {
        this.PMName = PMName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Task> getProjectTasks() {
        return projectTasks;
    }

    public void setProjectTasks(List<Task> projectTasks) {
        this.projectTasks = projectTasks;
    }

    public List<Task> getProjectTeam() {
        return projectTeam;
    }

    public void setProjectTeam(List<Task> projectTeam) {
        this.projectTeam = projectTeam;
    }
    
    public void printInfo(){
        System.out.println("Project ID: " + projectID);
        System.out.println("Project Name: " + projectName);
        System.out.println("Project Manager Name: " + PMName);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
    }    
}