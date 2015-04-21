/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import domain.Project;

/**
 *
 * @author Britta
 */
public interface Facade
{
    Project saveRequest(Project request);
    
    
//    Project loadRequest(Project request);
}
