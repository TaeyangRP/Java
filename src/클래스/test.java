package Ŭ����;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("�ؾ �Ҹ� �����ϼ���.");
		System.out.println("1. ��");
		System.out.println("2. ��ũ��");
		System.out.println("3. ����");		
		int answer;
		answer = sc.nextInt();
		
		if (answer == 1) {
			System.out.println("���� �����Ͽ����ϴ�.");		
			
		} else if (answer == 2) {
			System.out.println("��ũ���� �����Ͽ����ϴ�.");
			
		} else if (answer == 3) {
			System.out.println("���ڸ� �����Ͽ����ϴ�.");
				
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
			return;
		}	
	    System.out.println("�ֹ��� �Ϸ�Ǿ����ϴ�.");
	}

}
