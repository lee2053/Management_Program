package project;
import java.util.ArrayList;
import java.util.Scanner;

public class Main implements Functionable{           // *************************예외처리 완료
	static ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	public void start() {
		while (true) {
			System.out.println("------------------------------------------------------------------------------------------------------------------------");
			System.out.println("							헬스장 회원 관리 콘솔 ");
			System.out.println("------------------------------------------------------------------------------------------------------------------------");
			System.out.println("                                                      1. 신규 등록 ");
			System.out.println("                                                      2. 회원 정보 조회  ");
			System.out.println("                                                      3. 회원 정보 수정 ");
			System.out.println("                                                      4. 회원 정보 삭제 ");
			System.out.println("                                                      5. 전체 회원 조회 ");
			System.out.println("------------------------------------------------------------------------------------------------------------------------");
			System.out.println("원화시는 메뉴 번호를 입력하시오\n>>");

			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();

			switch (input) {
			case 1:
				New n = new New();
				n.start();
				break;
			case 2:
				Search s = new Search();
				s.start();
				break;

			case 3:
				Edit e = new Edit();
				e.start();
				break;

			case 4:
				Remove r = new Remove();
				r.start();
				break;

			case 5:
				SearchAll sa = new SearchAll();
				sa.start();
				break;
			default:
				System.out.println("잘못된 값을 입력했습니다. 다시 입력해주세요.");
				break;
			}
		}
	}
}
