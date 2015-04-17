package my.app.javadaytokyo.scope;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author kikuta
 */
@Named(value = "sessionScopeBean")
@SessionScoped
public class SessionScopeBean implements Serializable {

    @Getter @Setter
    private int count;
    
    public void countup(){
        count++;
    }
}
