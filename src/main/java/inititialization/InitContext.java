package inititialization;

import characteristic.Color;
import characteristic.PreciousStoneType;
import characteristic.SemiPreciousStoneType;
import characteristic.Transparency;
import entity.Necklace;
import entity.PreciousStone;
import entity.SemiPreciousStone;
import entity.Stone;
import lombok.extern.slf4j.Slf4j;
import random.Random;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class InitContext {

    private static Stone createRandomStone() {
        int i = Random.random(1,3);
        switch (i)
        {
            case 1: return  new PreciousStone(Color.getElementByIndex(Random.random(0,Color.values().length)),
                    Transparency.getElementByIndex(Random.random(0,Transparency.values().length)),
                    Random.random(0f,1000000f),Random.random(0f,1000f),
                    PreciousStoneType.getElementByIndex(Random.random(0,PreciousStoneType.values().length)));

            case 2: return new SemiPreciousStone(Color.getElementByIndex(Random.random(0,Color.values().length)),
                    Transparency.getElementByIndex(Random.random(0,Transparency.values().length)),
                    Random.random(0f,1000000f),Random.random(0f,1000f),
                    SemiPreciousStoneType.getElementByIndex(Random.random(0,SemiPreciousStoneType.values().length)));
            default:
                    log.info("no index");
                    throw new RuntimeException("no index");
        }
    }

    public Necklace createNecklace(int count){

        List<Stone> stones = new ArrayList<>();

        for (int i = 0; i<count; i++){
            stones.add(InitContext.createRandomStone());
        }

        return new Necklace(stones);
    }


}
