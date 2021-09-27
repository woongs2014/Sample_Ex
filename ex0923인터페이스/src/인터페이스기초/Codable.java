package 인터페이스기초;

public interface Codable {
	//수정수정~~
	// #interface // 마치, 함수를 모아놓는 것들? class인데 여러개 자유롭게 쓰는 것들? ->이름을 자유롭게 선언해서 이용한다.
	//1. 객체 생성이 불가능하다.
	//2. 추상메소드만 가질 수 있다.
	//자바8버전 ---> default or static을 추가하면 일반 method을 가질 수 있다. (but 자주 안씀)
	//3. 필드 안에 반드시 상수만 가질 수 있다.
	
	
//	#다중구현 가능/ 상속도 받을 수 잇다./ ovrride강제성
	
//	#필기
//	 - 클래스들을 구현해야하는 공통되는 기능들을 미리 지정 // 이름만
//	 - 작업명세서, 프로젝트 설계도/ 추상class와 같지만, 누구든 구현받을 수 있는 특징// 일명 함수 묶음을 받는다? 그냥 가져다 쓰는 느낌
//	 - 기능만 정의함으로써 구현 객체의 같은 동장보장(구현강제)
	
//	#형태
//	 code -> interface으로 만들고
//	 구현받을 class에 public class name extends 상속이름 implements name,name, 다중구현
//	 public class Seungshin extends Person implements Codable,Swimable
	
//	#JDBC(JAVA database connectivity)
//	java에서 db에 접속하기 위해 만들어 놓은 apl
	
	
	// Abstract class vs interface
//	상속은 1개, 인터페이스는 다중 구현이 가능
//	- Abstract class - > is ~ 속성을 나눠줄떄(종족) // field + 기능
//	- interface -> ~을 할 수 있는 즉, 기능을 나눠줄때 // 기능 그냥 method묶음이네
//	- 의미적으로 계층도를 나타날때, 상속 외에 능력을 주는? 기능을 주는 쉽계관리하는 방식
//	- 이름은 able 식으로 넣어서 보통 많이 사용한다.
	
	
	public abstract void coding(); // abstract 없어도 자동으로 -> 추상method로 인식가능
	

}
