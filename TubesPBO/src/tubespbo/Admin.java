/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author LENOVO
 */
public class Admin {
    private String UserID;
    private String Username;
    private String Role;
    
    public Admin (String UserID, String Username, String Role){
        this.UserID = UserID;
        this.Username = Username;
        this.Role = Role;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }
    
    public void AddTask (Task AddTask){
        this.AddTask(AddTask);
    }
    
    public void DeleteTask (Task DeleteTask){
        this.DeleteTask(DeleteTask);
    }
    
    public void AddActivity (ToDo AddActivity){
        this.AddActivity(AddActivity);
    }
    
    public void DeleteActivity (ToDo DeleteActivity){
        this.DeleteActivity(DeleteActivity);
    }
    
    public void PrintInfo(){
        this.PrintInfo();
    }
    
    public void ProgressUpdate(String ProgressUpdate){
        this.ProgressUpdate(ProgressUpdate);
        
    } 
}   
