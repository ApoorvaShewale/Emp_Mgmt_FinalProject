/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ApoorvaShewale
 */

@SuppressWarnings("unchecked")
public class FinanceOrganization extends Organization{

    public FinanceOrganization() {
        super(Organization.Type.Finance.getValue());
    }

    
}