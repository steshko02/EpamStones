package entity;

import Sorting.SortByCost;
import characteristic.Color;
import characteristic.PreciousStoneType;
import characteristic.SemiPreciousStoneType;
import characteristic.Transparency;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NecklaceTest {
    static  List<Stone> underTest = new ArrayList<>();

    @BeforeClass
    public static void init(){
        underTest.add(new PreciousStone(Color.Red, Transparency.Opaque, 1000f,20, PreciousStoneType.Ruby));
        underTest.add(new SemiPreciousStone(Color.Red,Transparency.SemiTranslucent,333f,6, SemiPreciousStoneType.Epidote));
        underTest.add(new Stone(Color.Red, Transparency.Opaque, 1001f));
    }

    @Test
    public void fullCost() {

        Necklace necklace = new Necklace(underTest);
        float actual=1000f+1001f+333f;
        float expected=necklace.fullCost();
        Assert.assertEquals(expected,actual, 0.0f);
    }

    @Test(expected = ClassCastException.class)
    public void fullWeightClassCastException() {
        Necklace necklace = new Necklace(underTest);
        necklace.fullWeight();
    }

    @Test(expected = NullPointerException.class)
    public void fullWeightNullPointerException() {
        Necklace expected = new Necklace(null);
        expected.fullWeight();
    }

    @Test(expected = NullPointerException.class)
    public void fullCostNullPointerException() {
        Necklace expected = new Necklace(null);
        expected.fullCost();
    }
}