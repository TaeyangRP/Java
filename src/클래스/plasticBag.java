package 클래스;

import java.util.Scanner;

public class plasticBag extends Bungeoppang_Machine_Run {
	
	public plasticBag() {
	Scanner sc1 = new Scanner(System.in);
	System.out.println("봉투 크기를 선택하세요.");
	System.out.println("1. 일반");
	System.out.println("2. 미니");
	int plasticBag = sc1.nextInt();
	if(plasticBag == 1) {
		System.out.println("일반 봉투 선택하셨습니다.");
	} else if(plasticBag == 2) {
		System.out.println("작은 봉투 선택하셨습니다.");
	} else {
		System.out.println("잘못 선택하셨습니다.");
	}

	}
}
