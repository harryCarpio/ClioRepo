/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.TabChangeEvent;

@javax.faces.bean.ManagedBean (name="tabBean")
@ViewScoped
public class TabBean {  
  
    public void onTabChange(TabChangeEvent event) {  
        FacesMessage msg = new FacesMessage("Tab Changed", "Active Tab: " + event.getTab().getTitle());  
  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }  
}  
  