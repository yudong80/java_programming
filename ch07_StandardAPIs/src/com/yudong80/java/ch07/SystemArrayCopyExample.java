package com.yudong80.java.ch07;

public class SystemArrayCopyExample {
	public static void main(String[] args) {
		//1. �迭 ���� 
		char[] src = {'A', 'B', 'C', 'D', 'E'};
		char[] dest = {'J', 'K', 'L', 'M', 'N'};
		
		printArray("src", src);
		printArray("dest", dest);
		
		//2. �迭 ���� 
		System.arraycopy(src, 0, dest, 0, 3);		
		printArray("dest ������ ", dest);
	}
	
	static void printArray(String title, char[] arr) {
		StringBuilder sb = new StringBuilder("�迭 ");
		sb.append(title + " = { ");
		for (char ch : arr) {
			sb.append(ch).append(',');
		}
		sb.deleteCharAt(sb.lastIndexOf(","));
		
		sb.append(" }");
		System.out.println(sb.toString());
	}
}
