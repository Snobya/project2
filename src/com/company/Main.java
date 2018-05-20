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

        int[] a = {1, 2};
        int[] b = {2, 8};
        Arrays.fill(b, 7);
        System.out.println(Arrays.toString(b));
        int[][] c = new int[7][7];
        int[][] k = {
                {1, 2},
                {8, 8}
        };
        for (int [] qq: k
             ) {
            for (int vv: qq
                 ) {
                System.out.println(vv);
            }

            System.out.println(Arrays.deepToString(k));
        }
    }
}