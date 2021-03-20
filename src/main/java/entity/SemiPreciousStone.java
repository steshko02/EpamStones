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

    private SemiPreciousStoneType stoneType;

    public SemiPreciousStone(Color color, Transparency transparency,
                             float cost, float carat, SemiPreciousStoneType stoneType) {
        super(carat,color, transparency, cost);
        this.stoneType = stoneType;
    }

     @Override
     public String toString() {
         return "SemiPreciousStone{" +
                 "stoneType=" + stoneType +
                 "} " + super.toString();
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         if (!super.equals(o)) return false;
         SemiPreciousStone that = (SemiPreciousStone) o;
         return stoneType == that.stoneType;
     }

     @Override
     public int hashCode() {
         return Objects.hash(super.hashCode(), stoneType);
     }
 }
