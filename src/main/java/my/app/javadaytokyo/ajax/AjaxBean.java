package my.app.javadaytokyo.ajax;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author kikuta
 */
@Getter @Setter
@Named(value = "ajaxBean")
@ViewScoped
public class AjaxBean implements Serializable{

    private String message1;
    
    private String message2;

    private String combinedMessage;
    
    public void combine(){
        combinedMessage = message1 + message2;
    }
}
