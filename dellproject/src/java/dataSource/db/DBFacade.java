package dataSource.db;

import dataSource.Facade;
import dataSource.db.RequestMapper;
import java.sql.Connection;
import domain.*;
import java.sql.SQLException;
import java.util.*;

// Encapsulates the Data Source Layer
// Encapsulates connection handling 
// Implemented as a Singleton to provide global access from
// Domain classes and to ensure the use of max one connection
// hau
public class DBFacade implements Facade
{

    private RequestMapper requestMapper;
    private Connection connection;

    //== Singleton start
    private static DBFacade instance;

    private DBFacade()
    {
        requestMapper = new RequestMapper();
        connection = DBConnector.getInstance().getConnection();
        System.out.println(connection);
    }

    public static Facade getInstance()
    {
        if (instance == null)
        {
            instance = new DBFacade();
        }
        return instance;
    }
	  //== Singleton end

    @Override
    public Project saveRequest(Project request)
    {
        try
        {
            return requestMapper.saveRequest(request, connection);
        }
        catch (SQLException sqle) {
            return null;
        }
    }
    
    public ArrayList<Project> loadRequestOverview(ArrayList<Project> requestList)
    {
        try
        {
            return requestMapper.loadRequestOverview(requestList, connection);
        }
        catch (SQLException sqle) {
        }
        
        return null;
        
    }
    
}
    
    


