package my.app.javadaytokyo.security;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author kikuta
 */
@Named(value = "registerBean")
@ViewScoped
public class RegisterBean implements Serializable{

    @Getter @Setter
    private String userName;
    
    @PostConstruct
    public void inti(){
        userName = "default";
    }
}
