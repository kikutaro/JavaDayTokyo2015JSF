package my.app.javadaytokyo.scope;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author kikuta
 */
@Named(value = "viewScopeBean")
@ViewScoped
public class ViewScopeBean implements Serializable{

    @Getter @Setter
    private int count;
    
    public void countup(){
        count++;
    }
}
