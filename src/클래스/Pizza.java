package Ŭ����;

import java.util.Scanner;

public class Pizza extends Bungeoppang_Machine_Run {
	

	
	public Pizza() {
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("�ؾ ũ�⸦ �����ϼ���.");
		System.out.println("1. �Ϲ�");
		System.out.println("2. �̴�");
		int sizeAnswer = scanner1.nextInt();
		
		if(sizeAnswer == 1) {
			System.out.println("�Ϲ� �ؾ �����ϼ̽��ϴ�.");
		} else if(sizeAnswer == 2) {
			System.out.println("�̴� �ؾ �����ϼ̽��ϴ�.");
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
			return;
		}
		
		
		
	} //pizza end
	


} //public class end
