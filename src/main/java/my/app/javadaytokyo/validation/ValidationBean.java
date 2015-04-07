package my.app.javadaytokyo.validation;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author kikuta
 */
@Getter @Setter
@Named(value = "validationBean")
@RequestScoped
public class ValidationBean {

    @NotNull(message = "入力必須です")
    private String 必須;
    
    @Size(max=5, message = "文字数オーバー")
    private String 文字数;
    
    @Pattern(regexp = "[a-zA-Z0-9]*", message = "英数字のみ")
    private String 正規表現;
    
    public void submit(){
        
    }
}
