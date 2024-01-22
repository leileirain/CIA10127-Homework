package hw1;

public class Homework1 {


	public static void main(String[] args) {
//		• 請設計一隻Java程式，計算12，6這兩個數值的和與積
		int n1=12, n2=6;
		System.out.println(n1+n2+","+n1*n2);
		System.out.println(n1*n2);
		System.out.println("====================================");
		
//		• 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		int egg=200; 
		System.out.println(egg/12d+"打");
		System.out.println("====================================");
		
//		• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int sec=256559%60, a=256559/60;
		int min=a/60; a/=60;
		int hour=a/60;
		System.out.println(hour+"時"+min+"分"+sec+"秒");
		System.out.println("====================================");
		
//		• 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		final double pai=3.1415;
		System.out.println("圓面積為"+pai*5*5+";圓周長為"+2*5*pai);
		System.out.println("====================================");
		
//		• 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//		金加利息共有多少錢 (用複利計算，公式請自行google)
		double s=1_500_000, i=1;
		
		while(i<=10) {
			s=s*(1+0.02);
			i++;
		}
		System.out.printf("%.0f%n",s);
		System.out.println("====================================");

//		• 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原		
		System.out.println(5+5);    //2個5資料類型皆為整數。5+5=10
		System.out.println(5+'5');  //'5'為字元值定數，對應的Unicode編號為0053。5+53=58
		System.out.println(5+"5");  //"5"為字串，5+"5"為字串相加=55。
				
	}
}
