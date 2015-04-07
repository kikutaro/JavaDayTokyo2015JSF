package my.app.javadaytokyo.dynamic;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutputLabel;
import javax.faces.context.FacesContext;

/**
 *
 * @author kikuta
 */
@Named(value = "dynamicHtmlBean")
@RequestScoped
public class DynamicHtmlBean {

    public void createView(){
        HtmlOutputLabel label = new HtmlOutputLabel();
        label.setValue("コードから生成したラベル");
        HtmlInputText text = new HtmlInputText();
        HtmlCommandButton btn = new HtmlCommandButton();
        btn.setValue("コードから生成したボタン");
        List<UIComponent> listComp = FacesContext.getCurrentInstance().getViewRoot().getChildren();
        listComp.add(label);
        listComp.add(text);
        listComp.add(btn);
    }
}
