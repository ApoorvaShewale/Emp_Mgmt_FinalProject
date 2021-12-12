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
//import ui.stardardLogin.AuthorizedWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author ApoorvaShewale
 */
@SuppressWarnings("unchecked")
public class AssetManagerLogin extends Role{

    public AssetManagerLogin(){
        this.type = RoleType.AssetManager;
    }

    @Override
    public JPanel createWorkArea(JPanel userLoginContainer, JPanel userContainer, UserAccount account, Organization organization, EmployeeManagement business) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}