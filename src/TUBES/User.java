package TUBES;

public class User {
    private String userID;
    private String userName;
    private String role;
    
    public User(String userID, String userName, String role) {
        this.userID = userID;
        this.userName = userName;
        this.role = role;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public boolean isAdmin(){
        return role.equalsIgnoreCase("admin");      
    }
    
    public void printInfo(){
        System.out.println("User ID: " + userID);
        System.out.println("User Name: " + userName);
        System.out.println("Role: " + role);
        
    }
}