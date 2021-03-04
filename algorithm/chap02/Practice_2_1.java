package algorithm.chap02;


//구성 요소의 자료형이 int인 배열(구성 요솟수는 5 : new를 이용해 본체를 생성한다)
public class Practice_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= new int[5];	//배열 선언
		a[1]=37;
		a[2]=51;
		a[4]=a[1]*2;
		
		for(int i=0;i<a.length;i++)
			System.out.println("a["+i+"] = " + a[i]);
	}
	//배열의 index는 0부터 시작
	//값이 정해지지 않은 요소 값은 0
}
