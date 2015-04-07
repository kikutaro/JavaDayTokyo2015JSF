package my.app.javadaytokyo.primefaces;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

/**
 *
 * @author kikuta
 */
@Getter @Setter
@Named(value = "primeFacesBean")
@ViewScoped
public class PrimeFacesBean implements Serializable{

    private String input;

    private List<Cat> items;

    private Cat selectedNeko;

    private TreeNode root;

    private TreeNode selected;
    
    @PostConstruct
    public void init(){
        items = Arrays.asList(
                new Cat("嬉しい", "nekobean_happy_s.png"),
                new Cat("普通", "nekobean_normal_s.png"),
                new Cat("悲しい", "nekobean_sad_s.png"),
                new Cat("眠い", "nekobean_zzz_s.png")
        );
        createTree();
    }
    
    public void submit(){
    }
    
    private void createTree(){
        root = new DefaultTreeNode("Root");
        TreeNode top = new DefaultTreeNode("トップ", root);
        TreeNode grpNode1 = new DefaultTreeNode("グループ1", top);
        TreeNode subGrpNode11 = new DefaultTreeNode("オプション1-1", grpNode1);
        TreeNode subGrpNode12 = new DefaultTreeNode("オプション1-2", grpNode1);
        TreeNode subGrpNode13 = new DefaultTreeNode("オプション1-3", grpNode1);
        TreeNode grpNode2 = new DefaultTreeNode("グループ2", top);
        TreeNode subGrpNode21 = new DefaultTreeNode("オプション1-1", grpNode2);
        TreeNode subGrpNode22 = new DefaultTreeNode("オプション1-2", grpNode2);
        TreeNode grpNode3 = new DefaultTreeNode("グループ3", top);
        
    }
}
