package my.app.javadaytokyo.primefaces;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author kikuta
 */
@AllArgsConstructor
@Getter @Setter
public class Employee {
    private String name;
    private int age;
    private String shozoku;
    private String mail;
}
