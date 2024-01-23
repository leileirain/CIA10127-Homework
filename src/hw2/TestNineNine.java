package hw2;

public class TestNineNine {
	public static void main(String[] args) {
//		請建立一個TestNineNine.java程式，可輸出九九乘法表
//		• 一：使用for迴圈 + while迴圈
		int i;
		for ( i=1; i<=9; i++) {
			int j=1;
			while ( j<=9) {	
				System.out.print(i+"+"+j+"="+(i*j)+"\t");
				j++;
			}
			System.out.println();
		}
		System.out.println("=======================================");
		
//		• 二：使用for迴圈 + do while迴圈
		int o;
		for (o=1; o<=9; o++) {
			int p=0;
			do {
				p++;
				System.out.print(o+"*"+p+"="+(o*p)+"\t");
			}while(p<=9);
			System.out.println();
		}
		System.out.println("=======================================");
		
//		• 三：使用while迴圈 + do while迴圈
		int s=1;
		while(s<=9) {
			int t=0;
			do {
				t++;
				System.out.print(s+"*"+t+"="+(s*t)+"\t");
			}while(t<=9);
			s++;
			System.out.println();
		}
		
	}
}
