package algorithm.chap02;


//1000 이하의 소수 열거(ver.2)
public class Practice_2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter = 0;				//나눗셈의 횟수
		int ptr = 0;					//찾은 소수의 개수
		int [] prime = new int[500];	//소수를 저장하는 배열
		
		prime[ptr++] = 2;				//2는 소수임
		
		for(int n=3;n<=100; n+=2) {		//대상은 홀수만(짝수는 소수일 수 없음)
			int i;
			for(i=1;i<ptr;i++) {		//이미 찾은 소수로 나누어봄 -> 소수가 아닌 수는 무언가의 배수이므로 굳이 찾아볼 필요 없다
				counter++;
				if(n%prime[i]==0)		//나누어 떨어지면 소수가 아님
					break;				//더 이상의 반복은 불필요(이미 나누어 떨어져 소수가 아닌 게 증명되었기 때문)
			}
			if(ptr==i)					//마지막까지 나누어 떨어지지 않음
				prime[ptr++]=n;			//소수라고 배열에 저장
		}
		
		for(int i=0; i<ptr;i++)			//찾은 ptr개의 소수를 나타냄
			System.out.println(prime[i]);
		
		
		System.out.println("나눗셈을 수행한 횟수 : " + counter);
	}

}
