package entity;

import lombok.Data;
import lombok.extern.slf4j.*;

import java.util.List;

@Data
@Slf4j
public class Necklace  {

    private List<Stone> stones; // mb rename

    public Necklace(List<Stone> stones) {
        this.stones = stones;
    }

    public float fullCost() {
        if(this.stones==null){
            throw new NullPointerException();
        }
        float cost=0;
        for(Stone stone : stones) {
            cost+=stone.getCost();
        }
        return  cost;
    }
//check, have 2 type of weight
    public float fullWeight() {
        if(this.stones==null){
            throw new NullPointerException();
        }
        float  weight=0;
        for(Stone stone : stones) {
            if(stone instanceof  PreciousStone){
                weight+=((PreciousStone) stone).getCarat()*((PreciousStone) stone).getONE_CARAT();
            }
            else if (stone instanceof SemiPreciousStone){
               weight+=((SemiPreciousStone) stone).getWeight();
            }
            else {
                throw new ClassCastException("We have some problems.");
            }
        }
        return  weight;
    }

}

