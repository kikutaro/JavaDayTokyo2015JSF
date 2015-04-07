package my.app.javadaytokyo.customcomponent;

import java.io.IOException;
import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

/**
 * createTagのみ定義したカスタムコンポーネント.
 * @author kikuta
 */
@FacesComponent(createTag = true)
public class SimpleCustomComponent extends UIComponentBase{

    @Override
    public String getFamily() {
        return "simple.component";
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
