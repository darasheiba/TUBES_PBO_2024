package TUBES;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Nasya Kirana M
 */
public class Task extends Project{
    private String taskID;
    private String taskName;
    private String taskDesc;
    private Date taskStartDate;
    private Date taskEndDate;
    private String taskProgres;
    private List<ToDo> taskActivities;

    public Task(String taskID, String taskName, String taskDesc, Date taskStartDate, Date taskEndDate, String taskProgres, List<ToDo> taskActivities, String projectID, String projectName, String PMName, Date startDate, Date endDate) {
        super(projectID, projectName, PMName, startDate, endDate);
        this.taskID = taskID;
        this.taskName = taskName;
        this.taskDesc = taskDesc;
        this.taskStartDate = taskStartDate;
        this.taskEndDate = taskEndDate;
        this.taskProgres = taskProgres;
        this.taskActivities = taskActivities;
    }

    public Task(List<ToDo> taskActivities, String projectID, String projectName, String PMName, Date startDate, Date endDate) {
        super(projectID, projectName, PMName, startDate, endDate);
        this.taskActivities = taskActivities;
    }
    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    public String getTaskProgres() {
        return taskProgres;
    }

    public void setTaskProgres(String taskProgres) {
        this.taskProgres = taskProgres;
    }

    public List<ToDo> getTaskActivities() {
        return taskActivities;
    }

    public void setTaskActivities(List<ToDo> taskActivities) {
        this.taskActivities = taskActivities;
    }
    
    public void progresUpdate(String update){
        this.taskProgres = update;
    }
    
    public boolean isCompleted(){
        return false; 
    }
    
    public void settDeadline(Date deadline){
        this.taskEndDate = deadline;  
    }
    
    public void settPriority(){
        
    }
    
    public void printInfo(){
        System.out.println("Task ID: " + taskID);
        System.out.println("Task Name: " + taskName);
        System.out.println("Task Description: " + taskDesc);
        System.out.println("Start Date: " + taskStartDate);
        System.out.println("End Date: " + taskEndDate);
    }
    
}