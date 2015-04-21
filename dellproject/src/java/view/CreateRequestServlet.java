/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataSource.*;
import domain.*;

/**
 *
 * @author Britta
 */
@WebServlet(name = "CreateRequestServlet", urlPatterns =
{
    "/CreateRequest"
})
public class CreateRequestServlet extends HttpServlet
{

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try {
            
            
            String projectName = request.getParameter("project-name");
            String companyName = request.getParameter("company-name");
            String activityDescription = request.getParameter("activity-description");
            String comments = request.getParameter("comments");
            String targetAudience = request.getParameter("target-audience");
            String currency = request.getParameter("currency");
            String cost = request.getParameter("cost");
            String activityStatus = request.getParameter("activity-status");
            String executionQuarter = request.getParameter("execution-quarter");
            String startDate = request.getParameter("start-date");
            String endDate = request.getParameter("end-date");
            String objectiveResult = request.getParameter("objective-results");
            String requiredPoe = request.getParameter("required-poe");

            Project req = Controller.getInstance().saveRequest(projectName, companyName, activityDescription, comments, targetAudience, currency, cost, activityStatus, executionQuarter, startDate, endDate, objectiveResult, requiredPoe);

            request.setAttribute("proj", req);
            
            request.getRequestDispatcher("request-created.jsp").forward(request, response);
            // I JSP: <p>${req.companyName}</p>
        }
        catch (Exception e) {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h2>"+e+"</h2>");
            out.println("<hr/>");
            out.print("<pre>");
            e.printStackTrace(out);
            out.println("</pre>");
            
        }
        
   }
    
}
