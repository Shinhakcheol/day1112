package arrays;

public class ArrayTest07 {

	public static void main(String[] args) {
		
		int n = 10;
		int[][] arr = new int[n][n];
		int count = 1;
		/////////////////////////////////////////////
		// 데이터 입력
		
		//1번
		// 오른쪽 방향으로 데이터 입력 ---->
		int right=0;
		int down=0;
		int left=0;
		int up=0;
		
		while(count<=n*n) {
		for (int i = up; i < n-down; i++) {
			arr[right][i] = count++;
		}
		right++;// 제일 위쪽행이 없어진다. 위쪽 없어진 행개수
		
		//if(count>25)break;
		
		//1~4 ,2~3
		// 아래쪽 방향으로 데이터 입력
		for (int i =right; i < n-left; i++) {
			arr[i][n - 1 - down] = count++;
		}
		down++; // 제일 오른쪽 열이 다찬다.
		
		
		
		// <---- 왼쪽 방향으로 데이더 입력
		for (int i = n - 1 - down; i >= up; i--) {
			arr[n - 1-left][i] = count++;
		}
		left++;
		
		
		//3~1 2~2
		// 위쪽으로 데이터 입력
		for (int i = n - 1 - left; i >=right; i--) {
			arr[i][up] = count++;
		}
		up++;
		}

	
		// 1   2  3  4 5      
		// 16 17 18 19 6    
		// 15 24 25 20 7   
		// 14 23 22 21 8
		// 13 12 11 10 9 

		
		
		//arr[0][0]=1
		//arr[0][1]=2
		//arr[1][0]=3
		
		//arr[0][2]=4
		//arr[1][1]=5
		//arr[2][0]=6
		
		//arr[0][3]=7
		//arr[1][2]=8
		//arr[2][1]=9
		//arr[3][0]=10
		

		// 순차접근 데이터 출력
		////////////////////////////////////////////////////////////////
		for (int[] a : arr) {
			for (int x : a) {
				System.out.printf("%2d ", x); // d 10진법 o 8진법 x 16진법
			}
			System.out.println();
		}
		/////////////////////////////////////////////////////////////////////
		}

}
