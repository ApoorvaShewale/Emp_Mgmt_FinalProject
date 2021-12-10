/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Employee.Employee;
import business.Role.SystemAdminLogin;
import business.UserAccount.UserAccount;


/**
 *
 * @author ApoorvaShewale
 */

@SuppressWarnings("unchecked")
public class Configure {
    public static EmployeeManagement configure(){
    
    EmployeeManagement system = EmployeeManagement.getInstance();
        
        
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        
        UserAccount ua = system.getUserAccountDirectory().createUser("sysadmin", "sysadmin", employee, new SystemAdminLogin());
        
        return system;
    } 
    
}