package �������̽�����;

import java.util.Scanner;

public class ArithmeticGameMain {
	
	// ����� ���
	// ����Ƚ�� üũ, 5������ ������ �� �ְԲ� ����!
	
	
	
	public static void main(String[] args) {
		PlusGame p1 = new PlusGame(); //Dummy�� ���� �������̽� ����
		Scanner sc = new Scanner(System.in);
		//1. �� 5������ ����
		
		int count = 0; //������ ������ üũ�ϴ� ����!
		
		for(int i =0; i <5; i++) {
		
		//2. ���� �����ϴ� ���
			p1.makeRandom();
		
		//3. �������
			for(int j =0; j <3; j++ ){
			System.out.println(p1.getQuizMsg());
			int answer = sc.nextInt();
		
		//4. �� ������ ������ ���� �� �ִ� ��ȸ�� 3��
			
			if(p1.checkAnswer(answer)) {
				System.out.println(""); // �����ΰ��
				count++;
				break;//for, switch, while ���
			}
			else {//Ʋ�����
				System.out.println("�����Դϴ�~");
				
			}}
		
		//5. ���� ���� Ƚ���� ���
		}
		
		System.out.println("������ ������ " + count + "�Դϴ�.");
		
		
		
		
		
		
		
		
//		#��Ǯ��
//		int turn =1;
//		int chance = 3;
//		Scanner sc =new Scanner (System.in);
//		PlusGame p1 = new PlusGame();
//		boolean check = true;
//		while(turn <=5) {
//			p1.makeRandom();
//			while(true) {
//				System.out.print(p1.getQuizMsg());
//				check =p1.checkAnswer(sc.nextInt());
//				
//				
//				if(check) {
//					System.out.println("�� ������!");
//					break;
//				}
//				else {
//					chance--;
//					if(chance == 0) {
//						System.out.println("�׳� ���� ������ �Ѿ��..");
//						break;
//					}
//					System.out.println("�ٽ� ������ ���Ƿ���?");
//				}
//				
//			}
//			
//			turn++;
//			chance =3;
//		}
//		
		
	}

}
