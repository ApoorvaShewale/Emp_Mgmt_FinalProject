/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Organization.Organization;
import business.Enterprise.Enterprise;
import business.EmployeeManagement;
import business.UserAccount.UserAccount;
import ui.ManageAdmin.ManageAdminWorkerPanel;
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
    public JPanel createWorkArea(JPanel userLoginContainer,JPanel container, UserAccount account, Organization organization, Enterprise enterprise, EmployeeManagement system) {
        return new ManageAdminWorkerPanel(userLoginContainer,container,enterprise,organization,account, system);
    }
}