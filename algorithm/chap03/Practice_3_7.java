package algorithm.chap03;

import java.util.Comparator;


//클래스 X의 내부에서 comparator 정의
public class Practice_3_7 {
	//필드나 메서드 등
	
	public static final Comparator<T> COMPARATOR = new Comp();
	
	private static class Comp implements Comparator<T>{
		public int compare(T d1, T d2) {
			//d1>d2 -> 양의 값 반환
			//d1<d2 -> 음의 값 반환
			//d1=d2 -> 0 반환
			
			return 0;
			//return이 없으면 오류 발생. 임의의 return값 삽입(나중에 지우기)
		}
	}
}
