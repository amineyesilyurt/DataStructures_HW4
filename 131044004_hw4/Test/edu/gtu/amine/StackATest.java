package edu.gtu.amine;

import org.junit.Assert;

/**
 * Created by Amine on 20/03/2017.
 */


public class StackATest {

    StackA sa= new StackA();

    public void testSize(){
        sa.push("Amine");
        Assert.assertEquals(1,sa.size());
    }

    public void tesPush(){
        sa.push("Amine");
        sa.push(19);
        Assert.assertEquals(false,sa.isEmpty());
    }

    public void tesPop(){
        sa.push("Amine");
        sa.push(19);
        try {
            sa.pop();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertEquals(1,sa.size());
    }

}
