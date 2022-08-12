package com.java.training.lambda;

/**
 * Creating an interface for the implementation of default and abstract methods.
 */
public interface Default {

	default void method1() {
		System.out.println("This is Default method!!!");
	}

	void method2(String str);
}
