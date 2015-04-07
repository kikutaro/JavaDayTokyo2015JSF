package my.app.javadaytokyo.argument;

import java.io.Serializable;
import javax.annotation.PostConstruct;
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
@Named(value = "argToBean")
@ViewScoped
public class ArgToBean implements  Serializable{

    /**
     * Flashで受け取る
     */
    @Getter @Setter
    private String receiveValue;
    
    @Getter @Setter
    @Inject
    private Parameter param;
    
    @PostConstruct
    public void init(){
        receiveValue = FacesContext.getCurrentInstance().getExternalContext().getFlash().get("parameter").toString();
    }
}
