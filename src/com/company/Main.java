package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {

       int [] a ;
       a = new int [100];

        for (int i = 0; i < 100; i++) {
            a[i]=i;
        }
        System.out.println(Arrays.toString(a));

        System.out.println(a.length);

        for (int i: a
             ) {
            System.out.println(i);
        }

        for ( int i: a
             ) {
            System.out.println(i);
        }
    }
}