package com.java.training.program08;

//Main Class
public class Multithreadcontd {
		public static void main(String[] args) {
			int n = 8; // Number of threads
			for (int i = 0; i < n; i++) {
				Multihread object = new Multihread();
				object.start();
			}
		}
	}
