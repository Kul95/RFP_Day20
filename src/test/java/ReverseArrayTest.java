import org.junit.Assert;
import org.junit.Test;

public class ReverseArrayTest {
    ReverseArray reverse=new ReverseArray();
    @Test
    public void reverse1(){
        Assert.assertEquals(21,reverse.reverseArray(new int[]{1,4,6,3,7}));
    }
}
