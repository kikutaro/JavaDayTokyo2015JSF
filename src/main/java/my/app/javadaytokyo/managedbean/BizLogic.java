package my.app.javadaytokyo.managedbean;

import javax.ejb.Stateless;

/**
 * EJB
 * 
 * @author kikuta
 */
@Stateless
public class BizLogic {
    
    public String execBizLogic(){
        return "EJBでビジネスロジック実行";
    }
}
