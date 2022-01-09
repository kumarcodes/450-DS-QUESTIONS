package com.java.rohit;

import java.util.Scanner;

public class Q2MinMaxArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[10];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int low=arr[0];
		int high=arr[n-1];
		for(int i=0;i<n;i++) {
		if(low>arr[i]) {
			low=arr[i];
		}
		if(high<arr[i]) {
			high=arr[i];
		}
		
		}
		System.out.println(low);
		System.out.println(high);

	}

}
