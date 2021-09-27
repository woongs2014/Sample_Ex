package 인터페이스예제;

import java.util.Scanner;

public class ArithmeticGameMain {
	
	// 입출력 담당
	// 정답횟수 체크, 5문제를 제시할 수 있게끔 로직!
	
	
	
	public static void main(String[] args) {
		PlusGame p1 = new PlusGame(); //Dummy을 통핸 인터페이스 관리
		Scanner sc = new Scanner(System.in);
		//1. 총 5문제를 제시
		
		int count = 0; //정답의 개수를 체크하는 역할!
		
		for(int i =0; i <5; i++) {
		
		//2. 난수 생서하는 기능
			p1.makeRandom();
		
		//3. 문제출력
			for(int j =0; j <3; j++ ){
			System.out.println(p1.getQuizMsg());
			int answer = sc.nextInt();
		
		//4. 한 문제당 정답을 맞출 수 있는 기회는 3번
			
			if(p1.checkAnswer(answer)) {
				System.out.println(""); // 정답인경우
				count++;
				break;//for, switch, while 사용
			}
			else {//틀린경우
				System.out.println("오답입니다~");
				
			}}
		
		//5. 맞은 정답 횟수를 출력
		}
		
		System.out.println("정답의 개수는 " + count + "입니다.");
		
		
		
		
		
		
		
		
//		#내풀이
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
//					System.out.println("잘 맞췄어요!");
//					break;
//				}
//				else {
//					chance--;
//					if(chance == 0) {
//						System.out.println("그냥 다음 문제로 넘어가요..");
//						break;
//					}
//					System.out.println("다시 생각해 보실래요?");
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
