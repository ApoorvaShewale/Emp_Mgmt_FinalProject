/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Network.Network;
import business.Organization.Organization;
import business.Role.Role;
import business.Role.SystemAdminLogin;
import java.util.ArrayList;


/**
 *
 * @author ApoorvaShewale
 */

@SuppressWarnings("unchecked")
public class EmployeeManagement extends Organization{

    private static EmployeeManagement business;
    private ArrayList<Network> networkList;
    public static EmployeeManagement getInstance(){
        if(business==null){
            business=new EmployeeManagement();
        }
        return business;
    }
    
    public Network createNewNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    public boolean checkIfNetworkIsUnique(String username){
        for (Network network : networkList){
            if (network.getName().equals(username)){
                return false;
            }
        }
        return true;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminLogin());
        return roleList;
    }
    
    private EmployeeManagement(){
        super(null);
        networkList=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
    
    
}