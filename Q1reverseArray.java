package com.java.rohit;

import java.util.Scanner;

public class Q1reverseArray {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int a[]=new int[10];
	 for(int i=0;i<n;i++) {
		 a[i]=sc.nextInt();
	 }
	 int temp=0;
     for(int j=0;j<n/2;j++){
         temp=a[j];
         a[j]=a[n-j-1];
         a[n-j-1]=temp;
     
     
 }
 for(int i=0;i<n;i++){
     System.out.println(a[i]);
 }

}
}
