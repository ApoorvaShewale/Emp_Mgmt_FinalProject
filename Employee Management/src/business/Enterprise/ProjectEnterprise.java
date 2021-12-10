/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;


import business.Organization.Organization;
import business.Role.ProjectManagerLogin;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ApoorvaShewale
 */

@SuppressWarnings("unchecked")
public class ProjectEnterprise extends Enterprise {
public ProjectEnterprise(String name){
        super(name,EnterpriseType.ManageHR);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ProjectManagerLogin());
        return roles;
    }
    
    @Override
    public ArrayList<Organization.Type> getSupportedOrganization() {
        ArrayList<Organization.Type> organizations = new ArrayList<>();
        organizations.add(Type.Project);
        return organizations;
    }
    
    }