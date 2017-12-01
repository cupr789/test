package p08;

public class ExecLotto {

	public static void main(String[] args) {
	 Lotto lt = new Lotto(3,4);
	 
	 
	 lt.userInputLotto();
	 lt.checkNum(lt.userLotto,2); // 파라미터 1과 2의 의미는 컴퓨터 로또라면 1, 2는 유저로또 구분지어주기 위함
	 lt.print(lt.userLotto,2);
	 
	 System.out.println("");
	 
	 lt.makeLottoNums();
	 lt.checkNum(lt.comLotto,1);  
	 lt.print(lt.comLotto,1);
	 lt.finalCheck();
	 
	 

	}

}
