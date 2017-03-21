package edu.gtu.amine;

import org.junit.Assert;

/**
 * Created by Amine on 20/03/2017.
 */
public class StackCTest {

    StackA sc= new StackA();

    public void testSize(){
        sc.push("Amine");
        Assert.assertEquals(1,sc.size());
    }

    public void tesPush(){
        sc.push("Amine");
        sc.push(19);
        Assert.assertEquals(false,sc.isEmpty());
    }

    public void tesPop(){
        sc.push("Amine");
        sc.push(19);
        try {
            sc.pop();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertEquals(1,sc.size());
    }

}
