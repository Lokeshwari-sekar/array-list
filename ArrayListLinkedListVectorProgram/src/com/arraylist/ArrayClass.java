package com.arraylist;
import java.util.Scanner;
public class ArrayClass {
public static void main(String[] args) {
		int[] array=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements"+array.length);
		
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("array elemts are");
		for(int i=0;i<5;i++)
		{
			System.out.println(array[i]);
		}
        int sum=0;
        System.out.println("sum of array elements are");
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
			
		}
		System.out.println("sum ="+sum);
		System.out.println("average="+(float)sum/array.length);
		
		//maximum logic
		int max=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
			
		}
		System.out.println("maximum of the array element"+max);
		//minimum logic
		int min=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(array[i]<min)
			{
				min=array[i];
				
			}
			
		}
		System.out.println("minimum of the array element"+min);
		sc.close();
		}
}
