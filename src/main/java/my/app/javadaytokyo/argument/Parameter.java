package my.app.javadaytokyo.argument;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author kikuta
 */
@Named(value = "parameter")
@SessionScoped
public class Parameter implements Serializable {

    @Getter @Setter
    private String value;
}
