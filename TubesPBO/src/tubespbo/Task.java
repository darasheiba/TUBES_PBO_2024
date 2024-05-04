/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author LENOVO
 */
class Task {
    private String TaskID;
    private String TaskName;
    private String TaskDescription;
    private Date StartDate;
    private Date EndDate;
    private String TaskProgress;
    private List<ToDo> TaskActivities;
    
    public Task (String TaskID, String TaskName, String TaskDescription, Date StartDate, Date EndDate, String TaskProgress, List<ToDo> TaskActivities){
        this.TaskID = TaskID;
        this.TaskName = TaskName;
        this.TaskDescription = TaskDescription;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
        this.TaskProgress = TaskProgress;
        this.TaskActivities = TaskActivities;
    }

    public String getTaskID() {
        return TaskID;
    }

    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    public String getTaskName() {
        return TaskName;
    }

    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    public String getTaskDescription() {
        return TaskDescription;
    }

    public void setTaskDescription(String TaskDescription) {
        this.TaskDescription = TaskDescription;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date EndDate) {
        this.EndDate = EndDate;
    }

    public String getTaskProgress() {
        return TaskProgress;
    }

    public void setTaskProgress(String TaskProgress) {
        this.TaskProgress = TaskProgress;
    }

    public List<ToDo> getTaskActivities() {
        return TaskActivities;
    }

    public void setTaskActivities(List<ToDo> TaskActivities) {
        this.TaskActivities = TaskActivities;
    }
    
    public void ProgressUpdate(String ProgressUpdate){
        this.ProgressUpdate(ProgressUpdate);
        
    } 
    
    public boolean IsCompleted (boolean IsCompleted){
        this.IsCompleted(IsCompleted);
        return IsCompleted;
    }
    
    public void SetDeadline (Date SetDeadline){
        this.SetDeadline(SetDeadline);
    }
    
    public void SetPriority(){
        this.SetPriority();
    }
    
      public void Printinfo(){
        this.Printinfo();
    }
}
