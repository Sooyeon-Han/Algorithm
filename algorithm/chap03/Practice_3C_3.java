package algorithm.chap03;

//제네릭 클래스 예
public class Practice_3C_3 {
	
	//제네릭 클래스의 파라미터를 T로 작성
	static class GenericClass<T>{
		private T xyz;
		GenericClass(T t){	//생성자
			this.xyz = t;
		}
		
		T getXyz() {		//xyz를 반환
			return xyz;			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericClass<String> s = new GenericClass<String>("ABC");
		GenericClass<Integer> n = new GenericClass<Integer>(15);
		
		System.out.println(s.getXyz());
		System.out.println(n.getXyz());
	}

}
