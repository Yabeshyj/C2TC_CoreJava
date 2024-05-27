package com.TNSIF.C2TC.daythirteen;

public class ThreadTest extends Thread 
{
   public void run()
   {
	   for( int i = 0; i < 10; i++)
	   {
		   System.out.println(i);
	   }
   }
}