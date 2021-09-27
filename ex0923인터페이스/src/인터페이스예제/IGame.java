package 인터페이스예제;

public interface IGame {
	
	//작업 설계도
	//랜덤한 수 생성
	public void makeRandom();
	//퀴즈생성하는 기능
	public abstract String getQuizMsg();
	//정답을 체크
	public boolean checkAnswer(int answer);
	

}
