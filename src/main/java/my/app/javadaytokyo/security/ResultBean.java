package my.app.javadaytokyo.security;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author kikuta
 */
@Named(value = "resultBean")
@ViewScoped
public class ResultBean implements Serializable{

    @Getter @Setter
    private String registeredName;

    public void hoge(){
        System.out.println(registeredName);
    }
}
