package entity;

import characteristic.*;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

@Data
@Slf4j
public class PreciousStone extends Stone{
    private final float ONE_CARAT=  0.2f; // mb make Interface
    private float carat;
    private PreciousStoneType stoneType;

    public PreciousStoneType getStoneType() {
        return stoneType;
    }

    public PreciousStone(Color color, Transparency transparency, float cost, float carat, PreciousStoneType stoneType) {
        super(color, transparency, cost);
        this.carat = carat;
        this.stoneType = stoneType;
        log.trace("constructor finished...");
    }

    public float getONE_CARAT() {
        return ONE_CARAT;
    }

    @Override
    public String toString() {
        return super.toString() + "PreciousStone{" +
                "carat=" + carat +
                ", stoneType=" + stoneType +
                "} " ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PreciousStone that = (PreciousStone) o;
        return Float.compare(that.carat, carat) == 0 && stoneType == that.stoneType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ONE_CARAT, carat, stoneType);
    }
}
