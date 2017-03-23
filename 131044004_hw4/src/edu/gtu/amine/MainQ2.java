package edu.gtu.amine;

import java.io.*;
import java.nio.file.FileSystemNotFoundException;
import java.util.LinkedList;
import java.util.Queue;



public class MainQ2 {

    public static void main(String[] args) {

        myQueue q1 = new myQueue();

        // reading csv file
        System.out.print("Enter file name to read:_");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = null;
        String line = "";
        try {
            filename = br.readLine();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }


        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new File("testResult_2.csv"));
        } catch (FileNotFoundException e1) {
            System.err.println(e1.getMessage());
        }

        try {
            br = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e1) {
            System.err.println(e1.getMessage());
        }


        try {


            while( (line=br.readLine())!=null) {

                // use comma as separator
                String[] elements = line.split(",");
                for (int i = 0; i < elements.length; ++i) {
                    q1.offer(elements[i]);

                }
                //Called reverse method
                q1.reverse(); //reversed que

                StringBuffer csvFormatA = new StringBuffer();
                csvFormatA.append(q1.size() + ",");



                while (q1.size()>0) {

                    try {
                        csvFormatA.append( q1.poll()+",");
                    } catch (Exception e1) {
                        System.err.println(e1.getMessage());
                    }
                }

                //deleting last comma
                csvFormatA.setCharAt(csvFormatA.length() - 1,'\n');

                pw.write(csvFormatA.toString());

            }

        } catch ( FileSystemNotFoundException e) {


            e.printStackTrace();
        } catch (IOException e) {

        } finally

        {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        pw.close();

        System.out.println("Testing reverseQueue metdhod:");
        Queue q2= new LinkedList();
        q2.offer(10);
        q2.offer(20);
        q2.offer(30);
        q2.offer(40);
        myQueue.reverseQueue((Queue) q2);
        System.out.println(q2.toString());



    }
}
