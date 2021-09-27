package 인터페이스기초;

public class Seungshin extends Person implements Codable,Swimable {
	
	
	//인터페이스 ----> 구현
	//다중구현이 가능하다. 즉, 여러 개(파일)를 함번에 구현, 자바안에서 기본적으로 제공되는 인터페이스를 가져와서 쓸수 있다.
	//마찬가지로 superclass에서 상속 같이 받을 수 있다.
	@Override
	public void coding() {
		// TODO Auto-generated method stub
		
	}
	//interface는 구현이라 한다.// 마찬가지로 추상 class처럼 override

	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		
	}
	
	

}
