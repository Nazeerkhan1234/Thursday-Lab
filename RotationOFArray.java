package com.test;
import java.util.*;

public class RotationOFArray {
	
	
  public static void display(int[] a) {
    StringBuilder sb = new StringBuilder();
    System.out.println("Display Array After rotation");
    for (int val : a) {
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void reverse(int[] a, int li, int ri) {
    while (li < ri) {
      int temp = a[li];
      a[li] = a[ri];
      a[ri] = temp;

      li++;
      ri--;
    }
  }

  public static void rotate(int[] a, int k) {
    k = k % a.length;
    if (k < 0) {
      k += a.length;
    }

    reverse(a, 0, a.length - k - 1);
    reverse(a, a.length - k, a.length - 1);
    reverse(a, 0, a.length - 1);
  }

  public static void main(String[] args) throws Exception {
	  Scanner scn = new Scanner(System.in);
	  System.out.println("Input the size of array");
	  int n = scn.nextInt();
	  System.out.println("Input the value in original array ");
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {

    	a[i]=scn.nextInt();
    }
    System.out.println("Input the number which times you want to rotate a array in clockwise direction ");
    int k = scn.nextInt();

    rotate(a, k);
    display(a);
    scn.close();
  }

}

