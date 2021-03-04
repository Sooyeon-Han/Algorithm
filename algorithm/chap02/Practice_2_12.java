package algorithm.chap02;


//2행 4행의 2차원 배열
public class Practice_2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] x = new int[2][4];	//2차원 배열 선언
		
		x[0][1] = 37;
		x[0][3] = 54;
		x[1][2] = 65;
		
		for(int i=0;i<2;i++)		//각 요소의 값 출력
			for(int j=0;j<4;j++)
				System.out.println("x["+i+"]["+j+"] = "+x[i][j]);
	}

}
