import org.junit.Assert;
import org.junit.Test;
public class FindMaxNumberTest {
    FindMaxNumber max=new FindMaxNumber();
@Test
    public void  testFindMax(){
        Assert.assertEquals(7,max.findMaxNumber(new int[] {1,2,3,4,5,6,7}));
    }
@Test
    public void  sumDemo(){
        Assert.assertEquals(30,max.sum(10,20));
    }
    @Test
    public void  subDemo(){
        Assert.assertEquals(20,max.sub(30,10));
    }

    @Test
    public void  mulDemo(){
    Assert.assertEquals(10,max.mul(5,2));
    }
@Test
    public void  divDemo(){
        Assert.assertEquals(2,max.div(20,10));
    }
}
