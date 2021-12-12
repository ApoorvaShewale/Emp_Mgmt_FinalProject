/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EmployeeManagement;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.TalentAndAcquisitionHR.TalentAcquisitionWorkerPanel;

/**
 *
 * @author ApoorvaShewale
 */
@SuppressWarnings("unchecked")
public class TalentAcquisitionHRLogin extends Role{
    
    public TalentAcquisitionHRLogin(){
        this.type = RoleType.TalentAcquisitionHR;
    }

    @Override
    public JPanel createWorkArea(JPanel userLoginContainer,JPanel container, UserAccount account, Organization organization, EmployeeManagement system) {
        return new TalentAcquisitionWorkerPanel(userLoginContainer,container,organization,account, system);
    }

}