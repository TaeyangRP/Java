package Ŭ����;

import java.util.Scanner;

public class plasticBag extends Bungeoppang_Machine_Run {
	
	public plasticBag() {
	Scanner sc1 = new Scanner(System.in);
	System.out.println("���� ũ�⸦ �����ϼ���.");
	System.out.println("1. �Ϲ�");
	System.out.println("2. �̴�");
	int plasticBag = sc1.nextInt();
	if(plasticBag == 1) {
		System.out.println("�Ϲ� ���� �����ϼ̽��ϴ�.");
	} else if(plasticBag == 2) {
		System.out.println("���� ���� �����ϼ̽��ϴ�.");
	} else {
		System.out.println("�߸� �����ϼ̽��ϴ�.");
	}

	}
}
