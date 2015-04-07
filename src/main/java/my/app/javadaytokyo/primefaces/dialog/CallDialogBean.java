package my.app.javadaytokyo.primefaces.dialog;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import lombok.Getter;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author kikuta
 */
@Named(value = "callDialogBean")
@RequestScoped
public class CallDialogBean {
    
    @Getter
    private String inputDialogResult;

    public void showDialog(){
        //ダイアログに関する設定オプション
        Map<String,Object> options = new HashMap<>();
        options.put("modal", true);
        options.put("draggable", false);
        options.put("resizable", false);
        options.put("contentHeight", 400);
        
        //パラメータ
        Map<String, List<String>> params = new HashMap<>();
        params.put("nogizaka", Arrays.asList("MaiShiraishi", "NanaseNishino", "MaiFukagawa"));

        RequestContext.getCurrentInstance().openDialog("dialog", options, params);
    }
    
    public void returnDialog(SelectEvent event){
        Object returnDialogObj = event.getObject();
        if(returnDialogObj != null){
            inputDialogResult = returnDialogObj.toString();
        }
    }
}
