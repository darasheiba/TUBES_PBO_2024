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
public class Member {
    private String UserID;
    private String Username;
    private String Role;
    
    public Member (String UserID, String Username, String Role){
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
    
    public void PrintInfo(){
        this.PrintInfo();
    }
    
    public void SetChecklistOn(){
        this.SetChecklistOn();
    }
    
    public void SetChecklistOff(){
        this.SetChecklistOff();
    }
}
