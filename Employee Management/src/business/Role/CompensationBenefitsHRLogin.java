/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Organization.Organization;
import business.EmployeeManagement;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author ApoorvaShewale
 */
@SuppressWarnings("unchecked")
public class CompensationBenefitsHRLogin extends Role{
//Authorizes the System and adds enterprises, admins and networks and organizations and Projects
    public CompensationBenefitsHRLogin(){
        this.type = RoleType.CompensationBenefitsHR;
    }

    @Override
    public JPanel createWorkArea(JPanel userLoginContainer,JPanel container, UserAccount account, Organization organizaion, EmployeeManagement system)  {
        return null; 
    }

}