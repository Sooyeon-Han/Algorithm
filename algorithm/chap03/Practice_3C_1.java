package algorithm.chap03;


//아이디를 부여하는 클래스
class Id{
	private static int counter = 0;	//아이디를 몇 개 부여했는지 저장
	private int id;					//아이디
	
	//생성자
	public Id() {
		id=++counter;	//id는 counter를 하나씩 증가시킨 값. numbering처럼..
	}
	
	//아이디를 반환하는 인스턴스 메서드
	public int getId() {
		return id;
	}
	
	//counter를 반환하는 인스턴스 메서드
	public static int getCounter() {
		return counter;
	}
}

public class Practice_3C_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Id a = new Id();	//0(counter 초기값)에서 하나 증가해 1(1이 곧 counter)
		Id b = new Id();	//1(counter)에서 하나 증가해 2
		
		System.out.println("a의 아이디 : " + a.getId());
		System.out.println("b의 아이디 : " + b.getId());
		
		System.out.println("부여한 아이디의 개수 : " + Id.getCounter());
	}

}
