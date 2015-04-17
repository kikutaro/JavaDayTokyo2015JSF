package my.app.javadaytokyo.scope;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author kikuta
 */
@Named(value = "requestScopeBean")
@RequestScoped
public class RequestScopeBean {

    @Getter @Setter
    private int count;
    
    public void countup(){
        count++;
    }
}
