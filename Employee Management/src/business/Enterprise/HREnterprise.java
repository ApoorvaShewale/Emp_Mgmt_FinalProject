/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Organization.Organization;
import business.Role.CompensationBenefitsHRLogin;
import business.Role.LearningDevelopmentHRLogin;
import business.Role.Role;
import business.Role.TalentAcquisitionHRLogin;
import java.util.ArrayList;

/**
 *
 * @author ApoorvaShewale
 */

@SuppressWarnings("unchecked")
public class HREnterprise extends Enterprise {

    public HREnterprise(String name){
        super(name,EnterpriseType.ManageHR);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new TalentAcquisitionHRLogin());
        roles.add(new CompensationBenefitsHRLogin());
        roles.add(new LearningDevelopmentHRLogin());
        return roles;
    }
    
    @Override
    public ArrayList<Organization.Type> getSupportedOrganization() {
        ArrayList<Organization.Type> organizations = new ArrayList<>();
        organizations.add(Type.HR);
        return organizations;
    }
    
    
}