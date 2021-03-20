package entity;

import characteristic.Color;
import characteristic.PreciousStoneType;
import characteristic.Transparency;

import lombok.Data;
import lombok.extern.slf4j.*;

import java.util.Objects;

@Data
@Slf4j
public class PreciousStone extends Stone{

    private PreciousStoneType stoneType;

    public PreciousStone(Color color, Transparency transparency, float cost, float carat, PreciousStoneType stoneType) {
        super(carat,color, transparency, cost);
        this.stoneType = stoneType;
    }

    @Override
    public String toString() {
        return "PreciousStone{" +
                "stoneType=" + stoneType +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PreciousStone that = (PreciousStone) o;
        return stoneType == that.stoneType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), stoneType);
    }
}
