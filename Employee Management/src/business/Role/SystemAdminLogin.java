/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EmployeeManagement;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.Login.LoginArea;

/**
 *
 * @author ApoorvaShewale
 */
@SuppressWarnings("unchecked")
public class SystemAdminLogin extends Role{
    
    public SystemAdminLogin(){
        this.type = RoleType.SystemAdmin;
    }
    @Override
    public JPanel createWorkArea(JPanel userLoginContainer,JPanel container, UserAccount account, Organization organizaion, Enterprise enterprise, EmployeeManagement system) {
        return new LoginArea(userLoginContainer,container,account, system);
    }

}