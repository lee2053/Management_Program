package project;
//초기화매소드 만들기. 초기화 클래스 하나 만들어서 미리 데이터 넣어놓고 시스템 시작 ㄱㄱ

//DayCal 예외처리 완료
//PT 선택 예외처리 완료
//Yoga 예외처리 완료
//

public class Test {
	public static void main(String[] args) {
		Init.start();
		Main main = new Main();
		main.start();
//		System.out.println(Main.customerList);
	}
}
