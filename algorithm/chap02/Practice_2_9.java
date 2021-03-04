package algorithm.chap02;


//1000 이하의 소수 열거(ver.1)
public class Practice_2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0;	//나눗셈의 횟수
		
		for(int n=2; n<=1000; n++) {
			int i;
			for(i=2; i<n; i++) {
				counter++;
				if(n%i==0)	//나누어 떨어지면 소수가 아님
					break;	//더 이상의 반복은 불필요(이미 나누어 떨어져 소수가 아닌 게 증명되었기 때문)
			}
			 if(n==i)	//마지막까지 나누어 떨어지지 않음
				 System.out.println(n);
		}
		System.out.println("나눗셈을 수행한 횟수 : " + counter);
	}

}
