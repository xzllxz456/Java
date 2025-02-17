package day03;
// 1부터 100까지의 소수를 2중 for문을 사용해서 구하는 프로그램
// 소수란 무엇인가?
// 약수가 1과 자기 자신밖에 없는 수
// = 약수의 갯수가 2개인 숫자

// 약수란 무엇인가?
// 어떤 숫자 a를 숫자 b로 나눠서
// 나눠 떨어지면 b는 a의 약수가 된다.
// 예시: 4는 8의 약수이다.
// = 약수란 어떤 숫자 a를 b로 나눠서
// 나머지가 0이면 b는 a의 약수가 된다.

// 어떤 수 a의 가장 큰 약수는 얼마인가?
// 자기자신인 a가 된다.

// 우리는 
// 1. 소수란 약수의 갯수가 2개인 숫자
// 2. 어떤 숫자의 약수는 나눠서 나머지가 0인 숫자
// 3. 어떤 숫자의 가장 큰 약수는 자기 자신

// 이 3가지 조건을 이용해서 1~100까지의 소수를 출력하는 프로그램을 만들어볼 것이다.
public class Ex07PrimeNumber {
	public static void main(String[] args) {
		//2중 for 문을 만들건데
		//바깥 쪽 i for문의 i는 소수인지 아닌지를 검사할 숫자가 된다.
		//안쪽 j for문의 j는 약수인지 아닌지를 검사할 숫자가 된다.
		//그렇다면 i의 반복 조건식은 어떻게 될까?
		//i <= 100
		//j의 반복 조건식은 어떻게 될까?
		//j <= i
		for(int i = 1; i <= 100; i++) {
			//약수의 갯수를 저장할 int 변수 count를 만들어주자
			int count = 0;
			for(int j = 1; j <= i; j++) {
				//조건문을 이용해서 
				//j가 i의 약수인지 체크해보자
				//만약 j가 i의 약수라면, count를 1 증가시켜주자
				if(i % j == 0) {
					count++;
				}
			}
			//조건문을 이용해서
			//count의 갯수에 따라서
			//소수이면 출력한다.
			if(count == 2) {
				System.out.println(i+"는 소수입니다.");
			}
		}
		
	}
}







