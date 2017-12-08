package p14;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculate {

	/*
	 * 1. 더하기 빼기 곱하기 나누기를 각각 실행 해주는 인트형 함수 네 개 만들고 사용자에게 피연산자 두개와 연산자 하나를 입려받아 입력받은
	 * 연산자에 맞는 함수를 실행하여 리턴받은 값을 어레이 리스트에 저장 저장한 어레이티스트를 거꾸로 출력하는 프로그램을 작성하시오 (단 빼거나
	 * 나눌땐 자동으로 큰값에서 작은값을 빼거나 나누어야 한다.)
	 */
	int result=0;

	int add(int firstNum, int lastNum) {
		result = (firstNum + lastNum);
		return result;
	}

	int min(int firstNum, int lastNum) {
		int temp;
		if (firstNum < lastNum) {
			temp = lastNum;
			lastNum = firstNum;
			firstNum = temp;
		}
		result = (firstNum - lastNum);

		return result;
	}

	int mul(int firstNum, int lastNum) {
		result = (firstNum * lastNum);

		return result;
	}

	int div(int firstNum, int lastNum) {
		int temp;
		if (firstNum < lastNum) {
			temp = lastNum;
			lastNum = firstNum;
			firstNum = temp;
		}

		result = (firstNum / lastNum);

		return result;
	}

	public static void main(String[] args) {
		Calculate c = new Calculate();

		ArrayList<Integer> al = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
			try {
				System.out.println("첫 숫자 입력: ");
				int firstNum = sc.nextInt();
				System.out.println("두번재 숫자 입력: ");
				int lastNum = sc.nextInt();
				System.out.println("연산자 입력");
				sc.nextLine();
				String oper = sc.nextLine();

				switch (oper) {

				case "+":
					al.add(c.add(firstNum, lastNum));
					System.out.println("결과값: " + c.result);
					break;

				case "-":
					al.add(c.min(firstNum, lastNum));
					System.out.println("결과값: " + c.result);
					break;

				case "*":
					al.add(c.mul(firstNum, lastNum));
					System.out.println("결과값: " + c.result);
					break;

				case "/":
					al.add(c.div(firstNum, lastNum));
					System.out.println("결과값: " + c.result);
					break;
				default:
					break;
				}

				
			} catch (Exception e) {
					System.out.println("입력을 잘못하셨습니다! 다시 입력하시겠습니까?    Y:N");
					sc.nextLine();
					String choice = sc.nextLine();
					if(choice.equals("N")) {
						continue;
					}
					else if(choice.equals("Y")){
						break;
					}
			}

		}

		System.out.println("기존 al값 : " + al);

		ArrayList<Integer> al2 = new ArrayList<Integer>();

/*		int max = 0;
		int idx = 0;

		for (int i = 0; i < al.size(); i++) {
			if (max < al.get(i)) {
				max = al.get(i);
				idx = i;
			}
			if (i == al.size() - 1) {
				al2.add(al.get(idx));
				al.remove(idx);

				max = 0;
				idx = 0;
				i = -1;
			}

		}*/
		
		
		for(int i=al.size(); i>0; i--) {
			al2.add(al.get(i-1));
		}

		System.out.println("이후 al값 : " + al2);
	}

}
