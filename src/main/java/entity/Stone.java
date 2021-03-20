package entity;

import characteristic.Color;
import characteristic.Transparency;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

@Data
@Slf4j
public class Stone {
    private float carat;
    private Color color;
    private Transparency transparency;
    private float cost;

    public Stone(float carat,Color color, Transparency transparency, float cost) {
        this.carat= carat;
        this.color = color;
        this.transparency = transparency;
        this.cost = cost;
    }

    public Stone(){}

    @Override
    public String toString() {
        return "Stone{" +
                "color=" + color +
                ", transparency=" + transparency +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stone stone = (Stone) o;
        return Float.compare(stone.cost, cost) == 0 && color == stone.color && transparency == stone.transparency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, transparency, cost);
    }
}
