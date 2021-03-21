package entity;

import lombok.Data;
import lombok.extern.slf4j.*;

import java.util.List;

@Data
@Slf4j
public class Necklace  {

    private List<Stone> stones;

    public Necklace(List<Stone> stones) {
        this.stones = stones;
    }

    public float fullCost() {
        if(this.stones==null){
            log.error("expected not null object");
            throw new NullPointerException("stones is null...");
        }
        float cost=0;

        for(Stone stone : stones) {
            cost+=stone.getCost();
        }

        return  cost;
    }

    public float fullCarat() {
        if(this.stones==null){
            log.error("expected not null object");
            throw new NullPointerException("stones is null...");
        }

        float  carat=0;

        for(Stone stone : stones) {
            carat+=stone.getCarat();
        }

        return carat;
    }

    @Override
    public String toString() {
        return "Necklace{\n" +
                "stones=\n" + stones +
                '}'+"\n" ;
    }

}

