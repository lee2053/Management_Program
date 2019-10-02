package project;

import java.util.Scanner;

public class SearchAll implements Functionable{

	public void start() { //정렬 기능을 갖추어야 함.
		boolean botton = true;
		while (botton) {
			try {
				Main.customerList.get(0);
			}
			catch(IndexOutOfBoundsException e) {
				System.out.println("리스트에 정보가 없습니다.");
				break;
			}
			System.out.println("------------------------------------------------------------------------------------------------------------------------");
			System.out.println("							전체 회원 목록");
			System.out.println("------------------------------------------------------------------------------------------------------------------------");
			System.out.println(" 이름   |  생년월일  |     전화번호          |      주소            |   등록 날짜        |   종료 날짜       |   수강 프로그램     |   등록 날짜        |  종료 날짜    ");
			System.out.println("------------------------------------------------------------------------------------------------------------------------");


			for (Customer c : Main.customerList) {
				System.out.println(c);
			}
			System.out.println("------------------------------------------------------------------------------------------------------------------------");
			if(botton = Select.selectYN("정렬을 원하시면 Y, 메인메뉴로 돌아가시려면 N을 입력해주세요.")) {
				sort();
			}
		}
	}
	
	public void sort() {
		boolean botton = true;
		
		while(botton) {
			System.out.println("원하시는 정렬방법을 선택하세요. 1. 이름 2. 시작날짜 3. 종료날짜");
			Scanner sc = new Scanner(System.in);
			MyComparator comparator; //다형성 구현
			String reply = sc.next();
			
			switch(reply) {
			case "1":
				if(Select.select12("오름차순은 1내림차순은 2를 입력해주세요.")) {
					comparator = new DescendingName();
					Main.customerList.sort(comparator);
					botton = false;
					break;
				}
				else {
					comparator = new AscendingName();
					Main.customerList.sort(comparator);
					botton = false;
					break;
				}
			case "2":
				if(Select.select12("오름차순은 1내림차순은 2를 입력해주세요.")) {
					comparator = new DescendingStart();
					Main.customerList.sort(comparator);
					botton = false;
					break;
				}
				else {
					comparator = new AscendingStart();
					Main.customerList.sort(comparator);
					botton = false;
					break;
				}
			case "3":
				if(Select.select12("오름차순은 1내림차순은 2를 입력해주세요.")) {
					comparator = new DescendingLast();
					Main.customerList.sort(comparator);
					botton = false;
					break;
				}
				else {
					comparator = new AscendingLast();
					Main.customerList.sort(comparator);
					botton = false;
					break;
				}
			default:
				System.out.println("값을 잘못입력했습니다.");
				break;
			}
		}
	}
}
