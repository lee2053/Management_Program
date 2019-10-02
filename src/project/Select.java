package project;

import java.util.Scanner;

public class Select {
	
	//new에서 마지막에 사용.
	public static boolean select12(String q) { //질문을 인자 값으로 받아서 설정 //1번 false 2번 true리턴
		//메인메뉴로 돌아가려면 1번 추가등록하시려면 2번 선택 >> 1번 메인 2번 while돌기 그 외 제대로된 입력
		while(true) {
			System.out.println(q);
			//입력받기
			Scanner sc = new Scanner(System.in);
			String reply = sc.next();
			
			//1번일 때
			if(reply.equals("1")) return false;
			//2번
			else if(reply.equals("2")) {
				return true;
			}
			//3번
			else System.out.println("잘못 입력하셨습니다. 1또는 2를 입력해주세요.");
		}
	}
	
	public static boolean selectYN(String q) { //질문을 인자 값으로 받아서 설정.
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println(q);
			String re = sc.next();
			if(re.equals("Y")) return true;
			else if(re.equals("N")) return false;
			else System.out.println("잘못 입력하셨습니다.");
		}
	}
	
}
