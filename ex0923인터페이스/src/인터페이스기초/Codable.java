package �������̽�����;

public interface Codable {
	//��������~~
	// #interface // ��ġ, �Լ��� ��Ƴ��� �͵�? class�ε� ������ �����Ӱ� ���� �͵�? ->�̸��� �����Ӱ� �����ؼ� �̿��Ѵ�.
	//1. ��ü ������ �Ұ����ϴ�.
	//2. �߻�޼ҵ常 ���� �� �ִ�.
	//�ڹ�8���� ---> default or static�� �߰��ϸ� �Ϲ� method�� ���� �� �ִ�. (but ���� �Ⱦ�)
	//3. �ʵ� �ȿ� �ݵ�� ����� ���� �� �ִ�.
	
	
//	#���߱��� ����/ ��ӵ� ���� �� �մ�./ ovrride������
	
//	#�ʱ�
//	 - Ŭ�������� �����ؾ��ϴ� ����Ǵ� ��ɵ��� �̸� ���� // �̸���
//	 - �۾�����, ������Ʈ ���赵/ �߻�class�� ������, ������ �������� �� �ִ� Ư¡// �ϸ� �Լ� ������ �޴´�? �׳� ������ ���� ����
//	 - ��ɸ� ���������ν� ���� ��ü�� ���� ���庸��(��������)
	
//	#����
//	 code -> interface���� �����
//	 �������� class�� public class name extends ����̸� implements name,name, ���߱���
//	 public class Seungshin extends Person implements Codable,Swimable
	
//	#JDBC(JAVA database connectivity)
//	java���� db�� �����ϱ� ���� ����� ���� apl
	
	
	// Abstract class vs interface
//	����� 1��, �������̽��� ���� ������ ����
//	- Abstract class - > is ~ �Ӽ��� �����ً�(����) // field + ���
//	- interface -> ~�� �� �� �ִ� ��, ����� �����ٶ� // ��� �׳� method�����̳�
//	- �ǹ������� �������� ��Ÿ����, ��� �ܿ� �ɷ��� �ִ�? ����� �ִ� ��������ϴ� ���
//	- �̸��� able ������ �־ ���� ���� ����Ѵ�.
	
	
	public abstract void coding(); // abstract ��� �ڵ����� -> �߻�method�� �νİ���
	

}
