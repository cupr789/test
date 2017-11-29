package assignment;

import java.util.Scanner;

public class Assignment01 {

	public static void main(String[] args) {

		/*   ★       과제     ★          
		 * 
		  							구현일자: 2017. 11. 25. Sat
		  							  구현자: 윤재형
		  	
		 
		  	1. Scanner클래스를 사용하여 초기값과 맥스값을 입력받아주세요.
		  	
	        2. 위에서 받은 초기값부터 맥스값 까지 반복하는 반복문을 작성해주세요.
	        
	       	3. 스트링 배열변수를 선언해주세요. 
	           (해당배열변수의 방의 갯수는 위에서 받아온 초기값과 맥스값으로 계산해야 에러가 나지 않습니다.)
	           
	      	4. 해당반복문에서 Scanner클래스를 사용 하여 위에서 선언한 
	      	    스트링 배열변수에 0번째 인덱스부터 마지막 방의 인덱스까지 값을 받아주세요.
	      	
	       	5. 다음 반복문에서 스트링배열변수가 가진 모든방의 값을 출력해주세요.
	       	
		*/
		
		
		//  [ 1번 과정 ]
		
		Scanner sc = new Scanner(System.in);  			//   사용자의 입력을 받기 위한 Scanner클래스 생성
		
		System.out.println("초기값을 입력해주세요!");  
		
		int minNum = sc.nextInt();						//   생성한 Scanner 클래스 타입 변수인 " sc "의 nextInt()를 이용하여 값입력을 받은후 
														//	 int형 변수 " minNum " 에 대입 (반복문의 시작값 설정)
		
		System.out.println("최대값을 입력해주세요!");
		
		int maxNum = sc.nextInt();						//   생성한 Scanner 클래스 타입 변수인 " sc "의 nextInt()를 이용하여 값입력을 받은후 
														//	 int형 변수 " maxNum " 에 대입 (반복문의 끝값과 String배열의 방 갯수 설정)
		sc.nextLine();									//   개행문자 제거를 위함
		
		
		//  [ 3번 과정 ]
		
		String strArr[] = new String[maxNum];           //   String 배열 타입의 변수 strArr[] 생성  
														//   (위에서 받아온 maxNum을 대괄호 안에 넣어줌으로 maxNum크기의 String배열 생성 )

		
		//  [ 4번 과정 ]
		
		String partStr;
		for (int i = minNum; i <= maxNum; i++) {		//   값 할당을 위한 첫번째 for문 시작값은 minNum, 종료값은 maxNum
			
			System.out.println("strArr["+(i-1)+"]"+"에 넣을 값을 입력해주세요!");
			partStr = sc.nextLine();
			strArr[i - 1] = partStr.trim();
		}
		sc.close();
		System.out.println("");
		
		
		
		
		//	[ 5번 과정]
		
		for (int x = minNum; x <= maxNum; x++) {		//   String배열 strArr안에 할당되어져 있는 값들을 출력
				System.out.print(strArr[x - 1]+" ");
			}
		}

	
}
