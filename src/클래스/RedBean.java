package 클래스;

import java.util.Scanner;

public class RedBean extends Bungeoppang_Machine_Run {
	
	
	public RedBean() {
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("붕어빵 크기를 선택하세요.");
		System.out.println("1. 일반");
		System.out.println("2. 미니");
		int sizeAnswer = scanner1.nextInt();
		
		if(sizeAnswer == 1) {
			System.out.println("일반 붕어빵 선택하셨습니다.");
		} else if(sizeAnswer == 2) {
			System.out.println("미니 붕어빵 선택하셨습니다.");
		} else {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		
		plasticBag plas = new plasticBag();
		System.out.println(plas.getClass());
		
		
	} //redbean end
	


} //public class end
