package my.app.javadaytokyo.primefaces;

import java.util.stream.IntStream;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author kikuta
 */
@Named(value = "primeFacesModernBean")
@RequestScoped
public class PrimeFacesModernBean {
    
    @Getter @Setter
    private String input;
    
    public void submit(){
        
    }

    public void block(){
        IntStream.range(0, 50000).forEach(System.out::println);
    }
    
}
