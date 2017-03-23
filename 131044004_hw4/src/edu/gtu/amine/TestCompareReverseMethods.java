package edu.gtu.amine;

import java.io.*;
import java.nio.file.FileSystemNotFoundException;
import java.util.LinkedList;
import java.util.Queue;

public class TestCompareReverseMethods {

    public static void main(String[] args) {

        myQueue myQ = new myQueue();
        Queue q2 = new LinkedList();

        for (int i = 0; i < 1000; ++i) {
            q2.offer(i);
            myQ.offer(i);

        }
        System.out.println("Testing reverseQueue metdhod:");
        myQueue.reverseQueue((Queue) q2);
        System.out.println(q2.toString());

        System.out.println("Testing reverse metdhod:");
        myQ.reverse();
        System.out.println(myQ.toString());

    }
}
