package my.app.javadaytokyo.argument;

import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author kikuta
 */
@Named(value = "argFromBean")
@ViewScoped
public class ArgFromBean implements Serializable{

    /**
     * Flashで渡す
     */
    @Getter @Setter
    private String value;
    
    @Getter @Setter
    @Inject
    private Parameter param;
    
    public String move(){
        FacesContext.getCurrentInstance().getExternalContext().getFlash().put("parameter", value);
        return "/argument/to.xhtml";
    }
}
