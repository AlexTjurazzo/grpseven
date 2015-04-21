package domain;

import dataSource.db.DBFacade;
import java.util.*;
import dataSource.*;
//=== hau

public class Controller
{

    private Project currentRequest;       // Order in focus
    private Facade facade;

    //-- singleton
    private static Controller instance;

    private Controller()
    {
        currentRequest = null;
        facade = DBFacade.getInstance();
    }

    public static Controller getInstance()
    {
        if (instance == null)
        {
            instance = new Controller();
        }
        return instance;
    }
    //----------------------

    public Project saveRequest(String projectName, String companyName, String activityDescription, String comments, String targetAudience, String currency, String cost,  String activityStatus, String executionQuarter, String startDate, String endDate, String objectiveResult, String requiredPoe)
    {
        Project request = new Project(projectName, companyName, activityDescription, comments, targetAudience, currency, cost, activityStatus, executionQuarter, startDate, endDate, objectiveResult, requiredPoe);
        return facade.saveRequest(request);
    }
    
    public Project loadOverview(ArrayList<Project> requestList)
    {
        requestList = new ArrayList<Project>(requestList);
        return loadOverview(requestList);
    }

}
