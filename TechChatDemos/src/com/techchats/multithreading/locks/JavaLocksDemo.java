/**
*	Tech Chats Team Works. All Copyrights reserved 2016
*	Author - Naresh Jagatap
*/

package com.techchats.multithreading.locks;

public class JavaLocksDemo
{
	public static void main(String[] args)
	{
		PrinterQueue printerQueue = new PrinterQueue();
		Thread thread[] = new Thread[10];
		for (int i = 0; i < 10; i++)
		{
			thread[i] = new Thread(new PrintingJob(printerQueue), "Thread " + i);
		}
		for (int i = 0; i < 10; i++)
		{
			thread[i].start();
		}
	}
}
