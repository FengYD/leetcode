package java8;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author fengyadong
 * @date 2019/3/6 0:17
 * @description
 */
@Data
public class Apple {

    private Integer id;

    private String color;

    private Integer weight;

    public Apple(){}

    public Apple(Integer id, String color, int weight){
        this.id = id;
        this.color = color;
        this.weight = weight;
    }

}
