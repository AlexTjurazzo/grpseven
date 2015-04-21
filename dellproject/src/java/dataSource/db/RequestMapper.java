package dataSource.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import domain.Project;


public class RequestMapper
{

    Project saveRequest(Project request, Connection connection) throws SQLException
    {
        String sql = "insert into request "
                + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                System.out.println(connection.toString());
        
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, request.getProjectName());
            statement.setString(2, request.getCompanyName());
            statement.setString(3, request.getActivityDescription());
            statement.setString(4, request.getComments());
            statement.setString(5, request.getTargetAudience());
            statement.setString(6, request.getCurrency());
            statement.setString(7, request.getCost());
            statement.setString(8, request.getActivityStatus());
            statement.setString(9, request.getExecutionQuarter());
            statement.setString(10, request.getStartDate());
            statement.setString(11, request.getEndDate());
            statement.setString(12, request.getObjectiveResult());
            statement.setString(13, request.getRequiredPoe());
                    statement.executeQuery();
        
        

        return request;
    }
    ArrayList<Project> loadRequestOverview (ArrayList<Project> requestList, Connection connection) throws SQLException
    {
//        ArrayList requestList = new ArrayList();
        
        String sql2 = "select * from request";
        PreparedStatement statement = connection.prepareStatement(sql2);
        ResultSet rs = statement.executeQuery();
        while (rs.next())
        {
            Project project = new Project (rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
            rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12),
            rs.getString(13));
                    
                    requestList.add(project);
        
        }
        return requestList;
    }
}
