/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

/**
 *
 * @author ApoorvaShewale
 */
@SuppressWarnings("unchecked")
public class ITHelpDeskWorkRequest extends WorkRequest {
    private String requesteResult;

    public String getRequesteResult() {
        return requesteResult;
    }

    public void setRequesteResult(String requesteResult) {
        this.requesteResult = requesteResult;
    }

}
