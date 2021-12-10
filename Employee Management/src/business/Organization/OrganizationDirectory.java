/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import java.util.ArrayList;

/**
 *
 * @author ApoorvaShewale
 */

@SuppressWarnings("unchecked")
public class OrganizationDirectory {
    
    private ArrayList<Organization> departmentList;

    public OrganizationDirectory() {
        departmentList = new ArrayList<Organization>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return departmentList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization department = null;

       
        return department;
    }
    
    public boolean checkIfOrganizationIsUnique(String username){
        for (Organization department : departmentList){
            if (department.getName().equals(username))
                return false;
        }
        return true;
    }
    
    }