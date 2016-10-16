package com.wjliuh.travel;

public class Format {
	public static void main(String[] args) {
		System.out.format("%f, %1$+020.10f%n", Math.PI);// 3.141593,
														// +00000003.1415926536
	}
}