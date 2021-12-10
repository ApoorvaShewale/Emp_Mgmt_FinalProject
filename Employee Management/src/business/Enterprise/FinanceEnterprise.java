/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;


import business.Role.FinanceManagerLogin;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ApoorvaShewale
 */

@SuppressWarnings("unchecked")
public class FinanceEnterprise extends Enterprise {

    public FinanceEnterprise(String name){
        super(name,EnterpriseType.ManageHR);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FinanceManagerLogin());
        return roles;
    }
    
   
}