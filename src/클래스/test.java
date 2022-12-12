package 클래스;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("붕어빵 소를 선택하세요.");
		System.out.println("1. 팥");
		System.out.println("2. 슈크림");
		System.out.println("3. 피자");		
		int answer;
		answer = sc.nextInt();
		
		if (answer == 1) {
			System.out.println("팥을 선택하였습니다.");		
			
		} else if (answer == 2) {
			System.out.println("슈크림을 선택하였습니다.");
			
		} else if (answer == 3) {
			System.out.println("피자를 선택하였습니다.");
				
		} else {
			System.out.println("잘못된 입력입니다.");
			return;
		}	
	    System.out.println("주문이 완료되었습니다.");
	}

}
