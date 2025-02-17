
public class mainClass {
	public static void main(String[] args) {
		/*
		 * bit : 0, 1
		 * &	AND
		 * |	OR
		 * ^	XOR  !!!!!!!!!!!!!!!!!!!!!!!!!!!
		 * << left shift
		 * >> right shift
		 * ~ 반전
		 */
		
		int result;
		//		16진수
		//AND	1011 1101 -> B C
		//					(4자리 쪼게서 2진법 계산)8421 8421
		//		1100 1001 -> C 9
		//		1000 1000 -> 8 8 <- 16진수
		result = 0xBC & 0xC9;
		System.out.println("10진수 출력: result = " + result);
		System.out.printf("16진수 출력: %x \n", result);
		
		/*
		 * OR	0x5D | 0xE3
		 * 		
		 * 		0101 1100
		 * 					8421 8421
		 * 		1110 0011
		 * 		1111 1111 -> F F
		 */
		result = 0x5D | 0xE3;
		System.out.println("10진수 출력: result = " + result);
		System.out.printf("16진수 출력: %x \n", result);
		/*
		 * XOR	0x37 ^ 0xAB
		 *	 	0011 0111					0 0 -> 0
		 * 		1010 1011					0 1 -> 1
		 * 		1001 1100 -> 9 C			1 0 -> 1
		 *			 						1 1 -> 0
		 */
		result = 0x37 ^ 0xAB;
		System.out.println("10진수 출력: result = " + result);
		System.out.printf("16진수 출력: %x \n", result);
		
		
//		  ~ 반전 0->1, 1->0
		 byte by = ~0x55;		// 0101 0101
		 						// 1010 1010(반전)
		 						// 8421 8421
		 						// A	A
		 System.out.printf("%x \n", by);
		 /*
		  * left shift 결과가 *2
		  * right shift 결과가 /2
		  * 
		  *  1010 1100  (*2 한 결과가 아래값)
		  * 10101 1000
		  * 
		  *  1000 => 8
		  *   100 => 4
		  */
		 byte by1;
		 by1 = 0x1 << 1;
		 System.out.println("by1 =" + by1);
		 
		 by1 <<= 1;
		 System.out.println("by1 =" + by1);
		 by1 >>= 1;
		 System.out.println("by1 =" + by1);
		 by1 >>= 8;
		 System.out.println("by1 =" + by1);
	}
}
