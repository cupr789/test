package p08;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	int[] comLotto;
	int[] userLotto;
	int rdNum = 0;
	int lottoMaxNum;
	int cnt = 0;
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);

	public Lotto() {

		this.comLotto = new int[6];
		this.lottoMaxNum = 45;

	}

	public Lotto(int lottoMaxNum) {
		this.comLotto = new int[lottoMaxNum];
	}

	public Lotto(int lottoNumsLength, int lottoMaxNum) {

		comLotto = new int[lottoNumsLength];
		this.lottoMaxNum = lottoMaxNum;
	}

	
	
	void userInputLotto() {
		userLotto= new int [comLotto.length];
		
		for(int i=0; i<userLotto.length; i++) {
			System.out.println((i+1)+"번째 숫자를 입력해주세요!");
			userLotto[i]=sc.nextInt();
		}
		
		
	}
	
	void makeLottoNums() {
		for (int i = 0; i < comLotto.length; i++) {
			rdNum = rd.nextInt(lottoMaxNum) + 1;
			comLotto[i] = rdNum;
			
		}
	}
	
	

	void checkNum(int[] arr,int partNum) {
		// 7743585
		for (int i = 0; i < arr.length; i++) {
			for (int x = i + 1; x < arr.length; x++) {
				if (arr[i] == arr[x]) {
					cnt++;
					if(partNum==1) {
						
						arr[x] = rd.nextInt(lottoMaxNum) + 1;
					}
					else if(partNum==2) {
						System.out.println("입력하신 숫자중 중복숫자가 있습니다! 다시 입력해주세요!");
						arr[x] = sc.nextInt();
					}
					i = 0;
					x--;
				}
			}

		}

	}

	void print(int[] arry,int a) {
		if(a==1) {
			System.out.print("[로또당첨번호]");
		}
		else if(a==2) {
			System.out.print("[사용자로또번호]");
		}
		System.out.println("");
		for (int i = 0; i < arry.length; i++) {
			if (i == arry.length - 1) {
				System.out.print(arry[i]);
			} else {
				System.out.print(arry[i] + ", ");
			}
		}
		System.out.println("");
	}

	void finalCheck() {
		int count=0;
		for(int i=0; i<userLotto.length;i++) {
			
			for(int x=0; x<comLotto.length;x++) {
				if(userLotto[i]==comLotto[x]) {
					count++;
				}
			}
			
		}
		System.out.println("중복된 숫자의 갯수 = "+count);
		
	}
	public static void main(String[] args) {

/*		Lotto ex1 = new Lotto();
		Lotto ex = new Lotto(5, 5);
		//ex.lottoMaxNum = 2;
		ex.makeLottoNums();
		ex.checkNum();
		ex.print();

		System.out.println("");

		ex1.makeLottoNums();
		ex1.checkNum();
		ex1.print();*/
	}

}
