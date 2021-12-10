/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;


/**
 *
 * @author ApoorvaShewale
 */

@SuppressWarnings("unchecked")
public class ProjectOrganization extends Organization{

    public ProjectOrganization() {
        super(Organization.Type.Project.getValue());
    }
}