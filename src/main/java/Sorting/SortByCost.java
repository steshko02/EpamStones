package Sorting;

import entity.Stone;
import java.util.List;

public class SortByCost {
    public static void stonesSortByCost(List<Stone> stones) {
        stones.sort((o1, o2) -> Float.compare(o1.getCost(), o2.getCost()));
    }
}