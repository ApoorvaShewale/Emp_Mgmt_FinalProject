/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.UserAccount;

import business.Employee.Employee;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ApoorvaShewale
 */

@SuppressWarnings("unchecked")
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUser(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        return userAccountList.stream().noneMatch((ua) -> (ua.getUsername().equals(username)));
    }
    
    public boolean IsSystemAdmin(String userrole){
        return userrole.equals("SystemAdmin");
    }
    
    public boolean IsTalentAndAcquistionHR(String userrole){
        return userrole.equals("Talent and Acquisition HR");
    }
    
    public boolean IsCompensationAndBenefitsHR(String userrole){
        return userrole.equals("Compensation and Benefits HR");
    }
    
    public boolean IsLearningAndDevelopmentHR(String userrole){
        return userrole.equals("Learning and Development HR");
    }
    
    public boolean IsProjectManager(String userrole){
        return userrole.equals("Project Manager");
    }
    
    public boolean IsEmployee(String userrole){
        return userrole.equals("Employee");
    }
    
    public boolean IsTechSupport(String userrole){
        return userrole.equals("TEch Support");
    }
    
    public boolean IsAssetManager(String userrole){
        return userrole.equals("Asset Manager");
    }
    
    public boolean IsManageAdmin(String userrole){
        return userrole.equals("Manage Admin");
    }
    
        
}