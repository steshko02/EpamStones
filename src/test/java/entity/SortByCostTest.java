package entity;

import service.Sorting.SortByCost;
import characteristic.Color;
import characteristic.PreciousStoneType;
import characteristic.SemiPreciousStoneType;
import characteristic.Transparency;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SortByCostTest {
    static  List<Stone> underTest = new ArrayList<>();

    @BeforeClass
    public static void init(){
        underTest.add(new PreciousStone(Color.Red, Transparency.Opaque, 1000f,20f, PreciousStoneType.Ruby));
        underTest.add(new SemiPreciousStone(Color.Red,Transparency.SemiTranslucent,333f,6f, SemiPreciousStoneType.Epidote));
        underTest.add(new SemiPreciousStone(Color.Red,Transparency.SemiTranslucent,1001f,5f, SemiPreciousStoneType.Epidote));
    }

    @Test(expected = NullPointerException.class)
    public void fullCost()  {
        SortByCost.sort(null);
    }

    @Test
    public void sortByCost() {
        SortByCost.sort(underTest);

        List<Stone> actual = new ArrayList<>();

        actual.add(new SemiPreciousStone(Color.Red, Transparency.SemiTranslucent,333f,6f, SemiPreciousStoneType.Epidote));
        actual.add(new PreciousStone(Color.Red, Transparency.Opaque, 1000f,20f, PreciousStoneType.Ruby));
        actual.add(new SemiPreciousStone(Color.Red,Transparency.SemiTranslucent,1001f,5f, SemiPreciousStoneType.Epidote));

        Assert.assertEquals(underTest,actual);
    }

}
