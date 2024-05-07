package TUBES;
import java.util.Date;
import java.util.List;

public class ToDo extends Task {
	private String activityName;
	private Date activityStartdate;
	private Date activityEndDate;
	private String activityPriority;
	private boolean checklist;
	
	
	
	
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public Date getActivityStartdate() {
		return activityStartdate;
	}
	public void setActivityStartdate(Date activityStartdate) {
		this.activityStartdate = activityStartdate;
	}
	public Date getActivityEndDate() {
		return activityEndDate;
	}
	public void setActivityEndDate(Date activityEndDate) {
		this.activityEndDate = activityEndDate;
	}
	public String getActivityPriority() {
		return activityPriority;
	}
	public void setActivityPriority(String activityPriority) {
		this.activityPriority = activityPriority;
	}
	public boolean isChecklist() {
		return checklist;
	}
	public void setChecklist(boolean checklist) {
		this.checklist = checklist;
	}
	
	
}
