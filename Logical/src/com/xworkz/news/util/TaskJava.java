package com.xworkz.news.util;
import java.util.Scanner;

public class TaskJava{
public static void main(String[] info)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Number which You want to find");
int no=sc.nextInt();
int check=0;
int[] number={1,2,3,4,2,6};
for(int i=0;i<number.length;i++)
{
 check=number[i];
}
int count=0;
if(check==no)
{
count++;
}
System.out.println("It is Present "+count);
}
}