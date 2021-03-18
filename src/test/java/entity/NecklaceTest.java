package entity;

import Sorting.SortByCost;
import characteristic.Color;
import characteristic.PreciousStoneType;
import characteristic.SemiPreciousStoneType;
import characteristic.Transparency;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class NecklaceTest {
    @Test
    public void fullCost() {

        List<Stone> list = new ArrayList<>();
        list.add(new PreciousStone(Color.Red, Transparency.Opaque, 1000f,20, PreciousStoneType.Ruby));
        list.add(new SemiPreciousStone(Color.Red,Transparency.SemiTranslucent,333f,6, SemiPreciousStoneType.Epidote));
     //   expected.add(new Stone(Color.Red, Transparency.Opaque, 1000f));
        Necklace necklace = new Necklace(list);
        float actual=1000f+333f;
        float expected=necklace.fullCost();
        Assert.assertEquals(expected,actual, 0.0f);
    }
    @Test(expected = ClassCastException.class)
    public void fullWeight_CLASS_Exceptions() {

        List<Stone> list = new ArrayList<>();
        list.add(new PreciousStone(Color.Red, Transparency.Opaque, 1000f,20, PreciousStoneType.Ruby));
        list.add(new SemiPreciousStone(Color.Red,Transparency.SemiTranslucent,333f,6, SemiPreciousStoneType.Epidote));
        list.add(new Stone(Color.Red, Transparency.Opaque, 1000f));
        Necklace necklace = new Necklace(list);
        necklace.fullWeight();
    }
    @Test
    public void SortByCost_TEST_WORK() {

        Stone stone1=new PreciousStone(Color.Red, Transparency.Opaque, 1000f,20, PreciousStoneType.Ruby);
        Stone stone2=new SemiPreciousStone(Color.Red,Transparency.SemiTranslucent,333f,6, SemiPreciousStoneType.Epidote);
        Stone stone3=new Stone(Color.Red, Transparency.Opaque, 1001f);

        List<Stone> expected = new ArrayList<>();
        expected.add(stone1);
        expected.add(stone2);
        expected.add(stone3);

        SortByCost.stonesSortByCost(expected);

        List<Stone> actual = new ArrayList<>();
        actual.add(stone2);
        actual.add(stone1);
        actual.add(stone3);

        Assert.assertEquals(expected,actual);
    }
}