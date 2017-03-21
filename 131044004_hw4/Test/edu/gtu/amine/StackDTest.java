package edu.gtu.amine;

import org.junit.Assert;

/**
 * Created by Amine on 20/03/2017.
 */
public class StackDTest {

    StackA sd= new StackA();

    public void testSize(){
        sd.push("Amine");
        Assert.assertEquals(1,sd.size());
    }

    public void tesPush(){
        sd.push("Amine");
        sd.push(19);
        Assert.assertEquals(false,sd.isEmpty());
    }

    public void tesPop(){
        sd.push("Amine");
        sd.push(19);
        try {
            sd.pop();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertEquals(1,sd.size());
    }

}
