/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;


import business.Role.AssetManagerLogin;
import business.Role.Role;
import business.Role.TechSupportLogin;
import java.util.ArrayList;

/**
 *
 * @author ApoorvaShewale
 */

@SuppressWarnings("unchecked")
public class SupportEnterprise extends Enterprise {

    public SupportEnterprise(String name){
        super(name,EnterpriseType.ManageHR);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AssetManagerLogin());
        roles.add(new TechSupportLogin());
        return roles;
    }
    
    
}