package java8;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fengyadong
 * @date 2019/3/6 0:17
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apple {

    private Integer id;

    private String color;

    private Integer weight;
}
