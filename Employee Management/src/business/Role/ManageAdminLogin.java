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
public class ManageAdminLogin extends Role{

    public ManageAdminLogin(){
        this.type = RoleType.ManageAdmin;
    }

    @Override
    public JPanel createWorkArea(JPanel userLoginContainer, JPanel userContainer, UserAccount account, Organization organization, EmployeeManagement business) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}