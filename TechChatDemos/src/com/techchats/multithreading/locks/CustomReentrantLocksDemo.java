/**
*	Tech Chats Team Works. All Copyrights reserved 2016
*	Author - Naresh Jagatap
*/

package com.techchats.multithreading.locks;

public class CustomReentrantLocksDemo
{
	CustomReentrantLock lock = new CustomReentrantLock();

	public void outer() throws InterruptedException
	{
		lock.lock();
		inner();
		lock.unlock();
	}

	private synchronized void inner() throws InterruptedException
	{
		lock.lock();
		// do something
		lock.unlock();
	}
}
