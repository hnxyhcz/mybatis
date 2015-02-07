package com.mybatis.test;

public class Test3 {
	public static void main(String[] args) {
		for(int i = 1; i<10; i++){
			if( i%3 == 0)
				continue;
			System.out.println("i=" + i);
		}
		System.out.println("Ñ­»·½áÊø£¡");
	}
}
