package Sorting;

import entity.Stone;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

@Slf4j
public class SortByCost {
    public static void stonesSortByCost(List<Stone> stones) {
        if(stones==null){
            log.error("expected not null object");
            throw new NullPointerException();
        }
        stones.sort((o1, o2) -> Float.compare(o1.getCost(), o2.getCost()));
        log.info("SortByCost has finished sorting...");
    }
}