package my.app.javadaytokyo.customcomponent;

import java.io.IOException;
import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

/**
 * createTag以外も定義したカスタムコンポーネント.
 * @author kikuta
 */
@FacesComponent(value = "components.KkeCustomComponent",
        createTag=true,namespace="http://kke.co.jp/kke",tagName="kke")
public class KkeCustomComponent extends UIComponentBase{

    @Override
    public String getFamily() {
        return "";
    }
    
    @Override
    public void encodeBegin(FacesContext context) throws IOException{
        String value = (String) getAttributes().get("value");
        if(value != null){
            ResponseWriter writer = context.getResponseWriter();
            writer.write(value + "自作コンポーネント");
        }
    }
}
