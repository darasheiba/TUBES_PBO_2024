/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.util.Date;
import java.util.List;
import javafx.concurrent.Task;

/**
 *
 * @author LENOVO
 */
public class Project {
    private String ProjectID;
    private String ProjectNama;
    private String PMNama;
    private Date StartDate;
    private Date EndDate;
    private List<Task> ProjectTasks;
    private List<User> ProjectTeam;
  
    public Project (String ProjectID, String ProjectNama, String PMNama, Date StartDate, Date EndDate, List<Task> ProjectTasks, List<User> ProjectTeam){
        this.ProjectID = ProjectID;
        this.ProjectNama = ProjectNama;
        this.PMNama = PMNama;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
        this.ProjectTasks = ProjectTasks;
        this.ProjectTeam = ProjectTeam;
        
    }

    public String getProjectID() {
        return ProjectID;
    }

    public void setProjectID(String ProjectID) {
        this.ProjectID = ProjectID;
    }

    public String getProjectNama() {
        return ProjectNama;
    }

    public void setProjectNama(String ProjectNama) {
        this.ProjectNama = ProjectNama;
    }

    public String getPMNama() {
        return PMNama;
    }

    public void setPMNama(String PMNama) {
        this.PMNama = PMNama;
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

    public List<Task> getProjectTasks() {
        return ProjectTasks;
    }

    public void setProjectTasks(List<Task> ProjectTasks) {
        this.ProjectTasks = ProjectTasks;
    }

    public List<User> getProjectTeam() {
        return ProjectTeam;
    }

    public void setProjectTeam(List<User> ProjectTeam) {
        this.ProjectTeam = ProjectTeam;
    }
    
    public void Printinfo(){
        this.Printinfo();
    }
    
    public void ProgressUpdate(String ProgressUpdate){
        this.ProgressUpdate(ProgressUpdate);
    } 
}
