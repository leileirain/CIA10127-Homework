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
		
		
	
	}

	
	

}
