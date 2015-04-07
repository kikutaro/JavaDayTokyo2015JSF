package my.app.javadaytokyo.ajax;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author kikuta
 */
@Named(value = "ajaxEventBean")
@RequestScoped
public class AjaxEventBean {

    public void executeFromBlur(){
        System.out.println("フォーカスアウトで呼ばれた");
    }
    
    public void executeFromClick(){
        System.out.println("クリックで呼ばれた");
    }
    
    public void executeFromDoubleClick(){
        System.out.println("ダブルクリックで呼ばれた");
    }
    
    public void executeFromKeyDown(){
        System.out.println("キーダウンで呼ばれた");
    }
    
    public void executeFromMouseOver(){
        System.out.println("マウスオーバー");
    }
}
