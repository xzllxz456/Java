
import java.util.InputMismatchException;
import java.util.Scanner;
// 문자 -> 숫자
// 숫자 비교


public class JavaEx08 {
	public static void main(String[] args) {
//	사칙연산
		
//	방법1
		Scanner sc = new Scanner(System.in);
//		int num;
//		while(true) {
//			try {
//				System.out.println("첫수입력: ");
//				num = sc.nextInt();
//				if(0 < num || num <= 0) {
//					break;
//				}
//			} catch (InputMismatchException e) {
//				System.out.println("잘못입력 다시입력: ");
//				sc.nextLine();
//			}
//			
//		}
//		int num2;
//		while(true) {
//			try {
//				System.out.println("두번쨰 수입력: ");
//				num2 = sc.nextInt();
//				if(0 < num2 || num2 <= 0) {
//					break;
//				}
//			} catch (Exception e) {
//				System.out.println("잘못입력 다시입력: ");
//				sc.nextLine();
//			}
//			
//		}
//		while(true) {
//			System.out.println("연산자");
//			char c = sc.next().charAt(0);
//
//			if(c == '+') {
//				System.out.printf("%d + %d = %d", num, num2, num + num2);
//				break;
//			}else if(c == '-') {
//				System.out.printf("%d - %d = %d",num, num2,num - num2);
//				break;
//			}else if(c == '*') {
//				System.out.printf("%d * %d = %d",num, num2, num * num2);
//				break;
//			}else if(c == '/') {
//				System.out.printf("%d / %d = %d",num, num2, num / num2);
//				break;
//			}else {
//				System.out.println("연산자 아님!");
//			}
//		}
//	}
//}
		
			
//		방법2
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫수입력: ");
//		int num = sc.nextInt();
//		System.out.println("두 번째수입력: ");
//		int num2 = sc.nextInt();
//		System.out.println("연산자입력 +-/*");
//		String c = sc.next();
//		
//		switch (c) {
//		case "+":
//			System.out.printf("%d + %d = %d", num, num2, num + num2);
//			break;
//		case "-":
//			System.out.printf("%d - %d = %d",num, num2,num - num2);
//
//			break;
//		case "/":
//			System.out.printf("%d / %d = %d",num, num2, num / num2);
//
//			break;
//		case "*":
//			System.out.printf("%d * %d = %d",num, num2, num * num2);
//
//			break;
//
//		default:
//			System.out.println("연산자 아님!");
//			break;
//		}
//	}
//}
//		방법 3
		//선언
		int num1, num2;
		String operator;
		//initialize 초기화
		int result = 0;
		//input
		System.out.println("숫자1 = ");
		num1 = sc.nextInt();
		
		System.out.println("(+, -, *, /) = ");
		operator = sc.next();
		
		System.out.println("숫자2 = ");
		num2 = sc.nextInt();
		
		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		default:
			break;
		}
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	}
}

