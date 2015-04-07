package my.app.javadaytokyo.omnifaces;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import org.omnifaces.util.Faces;

/**
 *
 * @author kikuta
 */
@Named(value = "omniFacesBean")
@RequestScoped
public class OmniFacesBean {

    public void exampleNormal(){
        if(FacesContext.getCurrentInstance() != null){
            String usingTheme = FacesContext.getCurrentInstance().getExternalContext().getInitParameter("primefaces.THEME");
            System.out.println(usingTheme);
        }
    }
    
    public void exampleUsingOmniFaces(){
        if(Faces.hasContext()){
            String usingTheme = Faces.getInitParameter("primefaces.THEME");
            System.out.println(usingTheme);
        }
    }
}
