package domain;

import java.sql.Date;
import java.util.ArrayList;
//=== hau

public class Project
{

    private String projectName;
    private String companyName; 
    private String activityDescription; 
    private String comments;
    private String targetAudience;
    private String currency;
    private String cost;
    private String activityStatus;
    private String executionQuarter;
    private String startDate;
    private String endDate;
    private String objectiveResult;
    private String requiredPoe;
   
public Project(){}
    public Project(String projectName, String companyName, String activityDescription, String comments, String targetAudience, String currency, String cost,  String activityStatus, String executionQuarter, String startDate, String endDate, String objectiveResult, String requiredPoe)
    {
        this.projectName = projectName;
        this.companyName = companyName;
        this.activityDescription = activityDescription;
        this.comments = comments;
        this.targetAudience = targetAudience;
        this.currency = currency;
        this.cost = cost;
        this.activityStatus = activityStatus;
        this.executionQuarter = executionQuarter;
        this.startDate = startDate;
        this.endDate = endDate;
        this.objectiveResult = objectiveResult;
        this.requiredPoe = requiredPoe;
    }

    public String getProjectName()
    {
        return projectName;
    }

    public void setProjectName(String projectName)
    {
        this.projectName = projectName;
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }

    public String getActivityDescription()
    {
        return activityDescription;
    }

    public void setActivityDescription(String activityDescription)
    {
        this.activityDescription = activityDescription;
    }

    public String getComments()
    {
        return comments;
    }

    public void setComments(String comments)
    {
        this.comments = comments;
    }

    public String getTargetAudience()
    {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience)
    {
        this.targetAudience = targetAudience;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency(String currency)
    {
        this.currency = currency;
    }

    public String getCost()
    {
        return cost;
    }

    public void setCost(String cost)
    {
        this.cost = cost;
    }

    

    public String getActivityStatus()
    {
        return activityStatus;
    }

    public void setActivityStatus(String activityStatus)
    {
        this.activityStatus = activityStatus;
    }

    public String getExecutionQuarter()
    {
        return executionQuarter;
    }

    public void setExecutionQuarter(String executionQuarter)
    {
        this.executionQuarter = executionQuarter;
    }

    public String getStartDate()
    {
        return startDate;
    }

    public void setStartDate(String startDate)
    {
        this.startDate = startDate;
    }

    public String getEndDate()
    {
        return endDate;
    }

    public void setEndDate(String endDate)
    {
        this.endDate = endDate;
    }

    public String getObjectiveResult()
    {
        return objectiveResult;
    }

    public void setObjectiveResult(String objectiveResult)
    {
        this.objectiveResult = objectiveResult;
    }

    public String getRequiredPoe()
    {
        return requiredPoe;
    }

    public void setRequiredPoe(String requiredPoe)
    {
        this.requiredPoe = requiredPoe;
    }

    
    
}
