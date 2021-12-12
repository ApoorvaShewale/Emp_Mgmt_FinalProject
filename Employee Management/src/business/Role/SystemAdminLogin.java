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
    public JPanel createWorkArea(JPanel userLoginContainer, JPanel userContainer, UserAccount account, Organization organization, EmployeeManagement business) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}