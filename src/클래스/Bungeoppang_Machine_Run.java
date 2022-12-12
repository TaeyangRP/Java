package 클래스;

import java.util.Scanner;

public class Bungeoppang_Machine_Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("붕어빵 소를 선택하세요.");
		System.out.println("1. 팥");
		System.out.println("2. 슈크림");
		System.out.println("3. 피자");		
		int answer;
		answer = sc.nextInt();
		
		
				
			if (answer == 1) {
				RedBean redbean = new RedBean(); // 팥
				System.out.println(redbean.getClass());		
				
			} else if (answer == 2) {
				CreamPuff creampuff = new CreamPuff(); // 슈크림
				System.out.println(creampuff.getClass());
				
			} else if (answer == 3) {
				Pizza pizza = new Pizza(); // 피자
				System.out.println(pizza.getClass());
					
			} 
			plasticBag plasticBag = new plasticBag(); // 봉투
			System.out.println(plasticBag.getClass());
			System.out.println("주문이 완료되었습니다.");

	
	} //public static void main end

} // public class end
