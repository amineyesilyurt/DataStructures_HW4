package edu.gtu.amine;

import java.io.*;
import java.nio.file.FileSystemNotFoundException;

public class MainQ1 {

    public static void main(String[] args) {

        StackA sA = new StackA<>();
        StackB sB = new StackB<>();
        StackC sC = new StackC<>();
        StackD sD = new StackD<>();
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
            pw = new PrintWriter(new File("testResult_1.csv"));
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
                    sA.push(elements[i]);
                    sB.push(elements[i]);
                    sC.push(elements[i]);
                    sD.push(elements[i]);
                }

                StringBuffer csvFormatA = new StringBuffer();
                csvFormatA.append(sA.size() + ",");

                StringBuffer csvFormatB = new StringBuffer();
                csvFormatB.append(sB.size() + ",");

                StringBuffer csvFormatC = new StringBuffer();
                csvFormatC.append(sC.size() + ",");

                StringBuffer csvFormatD = new StringBuffer();
                csvFormatD.append(sD.size() + ",");

                while (!sA.isEmpty()) {

                    try {
                        csvFormatA.append( sA.pop()+",");
                    } catch (Exception e1) {
                        System.err.println(e1.getMessage());
                    }
                }

                while (!sB.isEmpty()) {

                    try {
                        csvFormatB.append( sB.pop()+",");
                    } catch (Exception e1) {
                        System.err.println(e1.getMessage());
                    }
                }
                while (!sC.isEmpty()) {

                    try {
                        csvFormatC.append( sC.pop()+",");
                    } catch (Exception e1) {
                        System.err.println(e1.getMessage());
                    }
                }


                while (!sD.isEmpty()) {

                    try {
                        csvFormatD.append( sD.pop()+",");
                    } catch (Exception e1) {
                        System.err.println(e1.getMessage());
                    }
                }

                //deleting last comma
                csvFormatA.setCharAt(csvFormatA.length() - 1,'\n');
                csvFormatB.setCharAt(csvFormatB.length() - 1,'\n');
                csvFormatC.setCharAt(csvFormatC.length() - 1,'\n');
                csvFormatD.setCharAt(csvFormatD.length() - 1,'\n');
                /////////////////////////////////////////

                pw.write(csvFormatA.toString());
                pw.write(csvFormatB.toString());
                pw.write(csvFormatC.toString());
                pw.write(csvFormatD.toString());
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



    }
}
