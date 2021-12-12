/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Network.Network;
import business.Organization.Organization;
import business.Organization.OrganizationDirectory;
import business.Role.Role;
import business.Role.SystemAdminLogin;
import java.util.ArrayList;


/**
 *
 * @author ApoorvaShewale
 */

@SuppressWarnings("unchecked")
public class EmployeeManagement extends Organization{

    private static EmployeeManagement business;
    private OrganizationDirectory organizationDirectory;
    
    public static EmployeeManagement getInstance(){
        if(business==null){
            business=new EmployeeManagement();
        }
        return business;
    }
    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminLogin());
        return roleList;
    }
    
    private EmployeeManagement(){
        super(null);
        organizationDirectory=new OrganizationDirectory();
    }

    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        return true;
    }
    
    
}