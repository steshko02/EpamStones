package runner;

import Sorting.SortByCost;
import characteristic.Color;
import characteristic.PreciousStoneType;
import characteristic.SemiPreciousStoneType;
import characteristic.Transparency;
import entity.PreciousStone;
import entity.SemiPreciousStone;
import entity.Stone;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Runner {
    public static void main(String[] args)
    {
        log.info("The application started...");
        List<Stone> expected = new ArrayList<>();
        expected.add(new Stone(Color.Red, Transparency.Opaque, 1001f));
        expected.add(new PreciousStone(Color.Red, Transparency.Opaque, 1000f,20, PreciousStoneType.Ruby));
        expected.add(new SemiPreciousStone(Color.Red,Transparency.SemiTranslucent,333f,6, SemiPreciousStoneType.Epidote));

        SortByCost.stonesSortByCost(expected);
        System.out.println(expected);
        log.info("The application has finished working...");
    }
}
