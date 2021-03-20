package entity;

import characteristic.Color;
import characteristic.SemiPreciousStoneType;
import characteristic.Transparency;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

 @Data
 @Slf4j
public class SemiPreciousStone extends Stone {
    private float weight;
    private SemiPreciousStoneType stoneType;

    public SemiPreciousStone(Color color, Transparency transparency,
                             float cost, float weight, SemiPreciousStoneType stoneType) {
        super(color, transparency, cost);
        this.weight = weight;
        this.stoneType = stoneType;
    }

    @Override
    public String toString() {
        return super.toString() + "SemiPreciousStone{" +
                "weight=" + weight +
                ", stoneType=" + stoneType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SemiPreciousStone that = (SemiPreciousStone) o;
        return Float.compare(that.weight, weight) == 0 && stoneType == that.stoneType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight, stoneType);
    }
}
