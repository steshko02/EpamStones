package entity;

import characteristic.Color;
import characteristic.PreciousStoneType;
import characteristic.SemiPreciousStoneType;
import characteristic.Transparency;
import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class NecklaceTest {

   private static final List<Stone> underTest = new ArrayList<>();

    @BeforeClass
    public static void init(){
        underTest.add(new PreciousStone(Color.Red, Transparency.Opaque, 1000f,2f, PreciousStoneType.Ruby));
        underTest.add(new SemiPreciousStone(Color.Red,Transparency.SemiTranslucent,333f,6f, SemiPreciousStoneType.Epidote));
        underTest.add(new SemiPreciousStone(Color.Red,Transparency.SemiTranslucent,1001f,5f, SemiPreciousStoneType.Epidote));
    }

    @Test
    public void fullCost() {
        Necklace necklace = new Necklace(underTest);
        float actual=1000f+1001f+333f;
        float expected=necklace.fullCost();
        Assert.assertEquals(expected,actual, 0.0f);
    }

    @Test
    public void fullCarat(){
        Necklace necklace = new Necklace(underTest);
        float actual=2f+6f+5f;
        float expected=necklace.fullCarat();
        Assert.assertEquals(expected,actual, 0.0f);
    }

    @Test(expected = NullPointerException.class)
    public void fullWeightNullPointerException() {
        Necklace expected = new Necklace(null);
        expected.fullCarat();
    }

    @Test(expected = NullPointerException.class)
    public void fullCostNullPointerException() {
        Necklace expected = new Necklace(null);
        expected.fullCost();
    }
}