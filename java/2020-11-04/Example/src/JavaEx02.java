
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaEx02 {
	public static void main(String[] args) {
		//하나의 수를 입력 받고 10의 배수로 입력받은 수는 어느 범위에 있는지 출력되게 해라
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력: ");
		int num = sc.nextInt();
		//방법1
		if(num > 90 && num <= 100) {
			System.out.println("입력한 수는 90보다 크거나 100보다 작거나 같다.");
		}else if(num > 80 && num <= 90) {
			System.out.println("입력한 수는 80보다 크거나 90보다 작거나 같다.");
		}else if(num > 70 && num <= 80) {
			System.out.println("입력한 수는 70보다 크거나 80보다 작거나 같다.");
		}else if(num > 60 && num <= 70) {
			System.out.println("입력한 수는 60보다 크거나 70보다 작거나 같다.");
		}else if(num > 50 && num <= 60) {
			System.out.println("입력한 수는 50보다 크거나 60보다 작거나 같다.");
		}else if(num > 40 && num <= 50) {
			System.out.println("입력한 수는 40보다 크거나 50보다 작거나 같다.");
		}else if(num > 30 && num <= 40) {
			System.out.println("입력한 수는 30보다 크거나 40보다 작거나 같다.");
		}else if(num > 20 && num <= 30) {
			System.out.println("입력한 수는 20보다 크거나 30보다 작거나 같다.");
		}else if(num > 10 && num <= 20) {
			System.out.println("입력한 수는 10보다 크거나 20보다 작거나 같다.");
		}else if(num > 0 && num <= 10) {
			System.out.println("입력한 수는 0보다 크거나 10보다 작거나 같다.");
		}
		
		//방법 2
		if(num == 100) {
			System.out.println("100입니다");
		}else {
			System.out.println("입력한 수는 " + ((num/10)*10) + "보다크거나" + (((num/10)*10)+10) + "보다작");
		}
		
		//방법 2
		System.out.println("숫자입력: ");
		num = sc.nextInt();
		int n = 0; // initialize(초기화)
		for(int i = 0; i < 10 ; i++) {
			n = i * 10;// 0 10 20 30 ....90
			if(num > n && num <= (n+10))
			System.out.println("num은" + n + "보다크고" + (n+10) + "보다 작다.");
		}
	}
}	
