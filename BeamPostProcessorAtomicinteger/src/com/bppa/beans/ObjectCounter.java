package com.bppa.beans;

import java.util.concurrent.atomic.AtomicInteger;

public class ObjectCounter {
	private static AtomicInteger no_of_instance = new AtomicInteger();
	
	public static void increment() {
		no_of_instance.getAndIncrement();
	}

	public static int getNo_of_instance() {
		return no_of_instance.get();
	}
	
}
