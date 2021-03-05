package algorithm.chap03;


//자연스운 정렬 하기
public class Practice_3C_2 implements Comparable<Practice_3C_2>{//Compare<Practice_3C_2> 인터페이스 구현
	
	//필드, 메서드 등
	
	public int compareTo(Practice_3C_2 c) { //comparetTo 메서드 구현
		//this가 c보다 크면 양의 값 반환
		//this가 c보다 작으면 음의 값 반환
		//this가 c와 같으면 0 반환
		return 0;
		//return이 없으면 오류 발생. 임의의 return값 삽입(나중에 지우기)
	}
	
	public boolean equals(Object c) { //equals 메서드 구현
		//this와 c가 같으면 true 반환
		//this가 c와 같지 않으면 false 반환
		return true;
		//return이 없으면 오류 발생. 임의의 return값 삽입(나중에 지우기)
	}

}
