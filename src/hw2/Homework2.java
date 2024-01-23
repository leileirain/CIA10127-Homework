package hw2;

public class Homework2 {
	public static void main(String[] args) {
//		• 請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		int sum=0, i;
		for(i=1;i<=1000;i++){
			if (i%2<=0) {
				sum=sum+i;
			}	
		}
		System.out.println(sum);
		System.out.println("===============================");
		
//		• 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		int  mul_for=1;
		
		for (int j=1;j<=10;j++) {
			mul_for*=j;
		}
					
		System.out.println(mul_for);
		System.out.println("===============================");
		
//		• 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		int k=1, mul_while=1;
		while (k++ < 10)
			mul_while*=k;
			k++;			

		System.out.println(mul_while);
		System.out.println("===============================");
		
//		• 請設計一隻Java程式，輸出結果為以下：
//		1 4 9 16 25 36 49 64 81 100
		int m, n=0;
		for (m=1; m<=20; m+=2 ) {
			n+=m;
			do {
				System.out.println(n);	
			} while (n<=0);
		}	
		System.out.println("===============================");
		
//		•阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//		 輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		int o, p;
		for(o=0; o<=4; o++) {
			if (o!=4) {
				for(p=0; p<=9; p++) {
					if(o==0 && p!=0) {
						System.out.print(p+" ");
					}
					else if(o==0) {}
					else if (p!=4) {
						System.out.print(o+(p+" "));
					}
				}	
			}
		}
		System.out.println();
		System.out.println("===============================");
		
		
//		• 請設計一隻Java程式，輸出結果為以下：
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6 
//		1 2 3 4 5
//		1 2 3 4 
//		1 2 3 
//		1 2 
//		1
		int q, r;
		for(q=10; q>=1; q--) {
			for (r=1; r<=q; r++) {
				System.out.print(r+" ");
			}
			System.out.println();
		}
		System.out.println("===============================");		
		
		
	}
}
