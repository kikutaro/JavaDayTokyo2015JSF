package my.app.javadaytokyo.primefaces;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author kikuta
 */
@Getter @Setter
@Named(value = "dataTableBean")
@ViewScoped
public class DataTableBean implements Serializable{

    private List<Employee> listEmployee;

    @PostConstruct
    public void init(){
        listEmployee = Arrays.asList(
                    new Employee("堀北真希", 26, "Sweet Power", "makimaki@love.cute.com"),
                    new Employee("白石麻衣", 22, "乃木坂46" , "maiyan@nogizaka46"),
                    new Employee("西野七瀬", 20, "乃木坂46" , "naatyan@nogizaka46"),
                    new Employee("深川麻衣", 24, "乃木坂46" , "maimai@nogizaka46"),
                    new Employee("秋元真夏", 21, "乃木坂46" , "manattan@nogizaka46"),
                    new Employee("生駒里奈", 19, "乃木坂46" , "ikomatti@nogizaka46"),
                    new Employee("齋藤飛鳥", 16, "乃木坂46" , "ashu@nogizaka46"),
                    new Employee("橋本奈々未", 22, "乃木坂46" , "nanamin@nogizaka46"),
                    new Employee("生田絵梨花", 18, "乃木坂46" , "ikutyan@nogizaka46"),
                    new Employee("高山一実", 21, "乃木坂46" , "kazumin@nogizaka46"),
                    new Employee("若月祐美", 20, "乃木坂46" , "wakasama@nogizaka46"),
                    new Employee("衛藤美彩", 22, "乃木坂46" , "misamisa@nogizaka46"),
                    new Employee("桜井玲香", 20, "乃木坂46" , "captain@nogizaka46")
            );
    }
}
