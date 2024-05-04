/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
class ToDo {
    private String ActivityName;
    private Date StartDate;
    private Date EndDate;
    private String Priority;
    private boolean Checklist;
    
    public ToDo(String ActivityName, Date StartDate, Date EndDate, String Priority, boolean Checklist){
        this.ActivityName = ActivityName;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
        this.Priority =  Priority;
        this.Checklist = Checklist;
    }

    public String getActivityName() {
        return ActivityName;
    }

    public void setActivityName(String ActivityName) {
        this.ActivityName = ActivityName;
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

    public String getPriority() {
        return Priority;
    }

    public void setPriority(String Priority) {
        this.Priority = Priority;
    }

    public boolean isChecklist() {
        return Checklist;
    }

    public void setChecklist(boolean Checklist) {
        this.Checklist = Checklist;
    }
    
    public boolean ChecklistOn(){
        this.ChecklistOn();
        boolean ChecklistOn = false;
        return ChecklistOn;
    }
    
    public boolean ChecklistOff(){
        this.ChecklistOff();
        boolean ChecklistOff = false;
        return ChecklistOff;
    }
    
    public void PrintInfo(){
        this.PrintInfo();
    }
}
