package Ŭ����;

import java.util.Scanner;

public class Bungeoppang_Machine_Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ؾ �Ҹ� �����ϼ���.");
		System.out.println("1. ��");
		System.out.println("2. ��ũ��");
		System.out.println("3. ����");		
		int answer;
		answer = sc.nextInt();
		
		
				
			if (answer == 1) {
				RedBean redbean = new RedBean(); // ��
				System.out.println(redbean.getClass());		
				
			} else if (answer == 2) {
				CreamPuff creampuff = new CreamPuff(); // ��ũ��
				System.out.println(creampuff.getClass());
				
			} else if (answer == 3) {
				Pizza pizza = new Pizza(); // ����
				System.out.println(pizza.getClass());
					
			} 
			plasticBag plasticBag = new plasticBag(); // ����
			System.out.println(plasticBag.getClass());
			System.out.println("�ֹ��� �Ϸ�Ǿ����ϴ�.");

	
	} //public static void main end

} // public class end
