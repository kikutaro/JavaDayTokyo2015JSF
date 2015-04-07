package my.app.javadaytokyo.managedbean;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import lombok.Getter;

/**
 * 管理Beanスライドのサンプルコード.
 * 
 * CDIでEJBをInject
 * 
 * @author kikuta
 */
@Named(value = "hogeBean")
@RequestScoped
public class HogeBean {

    /**
     * EJBをInject
     */
    @Inject
    private BizLogic bizLogic;
    
    /**
     * 実行結果
     */
    @Getter
    private String ret;
    
    /**
     * 初期化
     */
    @PostConstruct
    public void init(){
        ret = bizLogic.execBizLogic();
    }
}
