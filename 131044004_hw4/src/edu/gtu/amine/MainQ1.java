package edu.gtu.amine;

import groovy.ui.SystemOutputInterceptor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class MainQ1 {

    public static void main(String[] args) {

        StackA sA = new StackA<>();
        StackB sB = new StackB<>();
        StackC sC = new StackC<>();
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

        try {

            br = new BufferedReader(new FileReader(filename));
            line = br.readLine();
            // use comma as separator
            String[] elements = line.split(",");
            for (int i = 0; i < elements.length; ++i) {
                sA.push(elements[i]);
                sB.push(elements[i]);
                sC.push(elements[i]);
            }

        } catch (FileSystemNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.print(sA.toString());
        System.out.println(sA.size());
        System.out.print(sB.toString());
        System.out.println(sB.size());
        System.out.print(sC.toString());
        System.out.println(sC.size());

        try {
            sA.pop();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            sB.pop();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            sC.pop();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.print(sA.toString());
        System.out.println(sA.size());
        System.out.print(sB.toString());
        System.out.println(sB.size());
        System.out.print(sC.toString());
        System.out.println(sC.size());

    }
}
