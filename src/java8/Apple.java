package java8;

import lombok.Data;

/**
 * @author fengyadong
 * @date 2019/3/6 0:17
 * @description
 */
@Data
public class Apple {

    private String color;

    private Integer weight;

    public Apple(){}

    public Apple(String color, int weight){
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
