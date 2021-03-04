package algorithm.chap02;

//구성 자료형이 int형인 배열(구성 요솟수는 5 : 배열 초기자로 생성)
public class Practice_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5};	//배열 초기자로 생성
		//int[] a = new int[] {1,2,3,4,5};와 동일
		
		for(int i=0;i<a.length;i++)
			System.out.println("a["+i+"] = " + a[i]);
	}

}
