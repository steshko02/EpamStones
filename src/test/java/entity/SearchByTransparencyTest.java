package entity;

import service.Searching.SearchByTransparency;
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

public class SearchByTransparencyTest {

    static  List<Stone> underTest = new ArrayList<>();

    @BeforeClass
    public static void init(){
        underTest.add(new SemiPreciousStone(Color.Red, Transparency.SemiTranslucent,333f,6, SemiPreciousStoneType.Epidote));
        underTest.add(new PreciousStone(Color.Red, Transparency.Opaque, 1000f,20, PreciousStoneType.Ruby));
        underTest.add(new PreciousStone(Color.Red, Transparency.Translucent, 1000f,20, PreciousStoneType.Ruby));
        underTest.add(new SemiPreciousStone(Color.Red, Transparency.Translucent,333f,6, SemiPreciousStoneType.Epidote));
        underTest.add(new SemiPreciousStone(Color.Red, Transparency.Opaque,333f,6, SemiPreciousStoneType.Epidote));
    }

    @Test
    public void SearchByTransparency() {
        List<Stone> actual = new ArrayList<>();

        actual.add(new SemiPreciousStone(Color.Red, Transparency.SemiTranslucent,
                333f,6, SemiPreciousStoneType.Epidote));
        actual.add( new PreciousStone(Color.Red, Transparency.Translucent, 1000f,20, PreciousStoneType.Ruby));
        actual.add( new SemiPreciousStone(Color.Red, Transparency.Translucent,333f,6, SemiPreciousStoneType.Epidote));

        Assert.assertEquals(SearchByTransparency.search(underTest,
                Transparency.Translucent, Transparency.SemiTranslucent),actual);
    }

    @Test(expected = NullPointerException.class)
    public void SearchByTransparencyNullPointerException() {
        SortByCost.sort(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void SearchByTransparencyIllegalArgumentException() {
        SearchByTransparency.search(underTest,Transparency.Opaque,  Transparency.Transparent);
    }

}
