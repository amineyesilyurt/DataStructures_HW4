package edu.gtu.amine;


import org.junit.Assert;

/**
 * Created by Amine on 21/03/2017.
 */
public class StackBTest {

    StackB sb= new StackB();

    public void testSize(){
        sb.push("Amine");
        Assert.assertEquals(1,sb.size());
    }

    public void tesPush(){
        sb.push("Amine");
        sb.push(19);
        Assert.assertEquals(false,sb.isEmpty());
    }

    public void tesPop(){
        sb.push("Amine");
        sb.push(19);
        try {
            sb.pop();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertEquals(1,sb.size());
    }



}