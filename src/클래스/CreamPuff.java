package Ŭ����;

import java.util.Scanner;

public class CreamPuff extends Bungeoppang_Machine_Run {
	
	
	public CreamPuff() {
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("�ؾ ũ�⸦ �����ϼ���.");
		System.out.println("1. �Ϲ�");
		System.out.println("2. �̴�");
		System.out.println();
		int sizeAnswer = scanner1.nextInt();
        
		
		if(sizeAnswer == 1) {
			System.out.println("�Ϲ� �ؾ �����ϼ̽��ϴ�.");
		} else if(sizeAnswer == 2) {
			System.out.println("�̴� �ؾ �����ϼ̽��ϴ�.");
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
			return;
			
		}
				
	} // CreamPuff end
	
	
	
	
	
	
} //public class end
