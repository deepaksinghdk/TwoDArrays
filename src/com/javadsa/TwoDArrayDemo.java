package com.javadsa;

/*
You are given a number n, representing the number of rows.
You are given a number m, representing the number of columns.
You are given n*m numbers, representing elements of 2d array a.
You are required to display the contents of 2d array as suggested by output format below.

Input Format

A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements

Output Format

e11 e12 e13 ..
e21 e22 e23 ..
*/

import java.io.*;
import java.util.*;

public class TwoDArrayDemo{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int m = scr.nextInt();
        int arr[][] = new int[n][m];
        for(int i = 0; i < arr.length; i++){
            for(int j= 0; j< m; j++){
                arr[i][j] = scr.nextInt();
            }
        }

        for(int i = 0; i < arr.length; i++){
            for(int j= 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}