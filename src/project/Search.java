package project;

import java.util.Scanner;

public class Search implements Functionable{

	// 인덱스아웃바운드익셉션해결
	public void start() {
		boolean botton = true; //while문을 키고 끄는 스위치라고 하려했는데  switch 못써서 botton이라고 명했습니다 
		while(botton) {
			System.out.println("------------------------------------------------------------------------------------------------------------------------");
			System.out.println("							회원 정보 조회");
			System.out.println("------------------------------------------------------------------------------------------------------------------------");
			int index = searchCustomer(); //전화번호를 입력받고 리스트에서 일치하는 인덱스 값을 리턴함.
			if(index == -3) break;
			botton = Select.select12("메인메뉴로 돌아가시려면 1번 조회를 하시려면 2번을 눌러주세요.");
		}
	}
	
// searchIndex() : 매개변수로 전화번호를 받은 다음 리스트를 검색한 후 일치하는 전화번호를 가진 Customer객체의 인덱스를 리턴.
// 리스트에 아무것도 없을 경우 "리스트에 정보가 없습니다."출력 후 -2리턴 / 리스트에 일치하는 번호가 없을 경우 "해당하는 전화번호가 없습니다."출력 후 -1리턴 
// 해당 값이 존재할경우 해당 인덱스를 리턴.  **예외처리완료
	public int searchIndex(String phone) {
		// 리스트에 아무것도 없을 떄 
		try {
			Main.customerList.get(0);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("리스트에 정보가 없습니다.");
			return -2;
		}
		// 리스트에서 찾음
		boolean x = true;
		Integer i = 0;                   //해당하는 인덱스가  마지막 인덱스일 때 해결.
		while (x) {
			
			if (i == Main.customerList.size()) {
				System.out.println("해당하는 전화번호가 없습니다.");
				i = -1; // -1이 나오면 해당하는 번호가 없다는 뜻 -1을 리턴함.
				break;
			}
			else {
				x = !Main.customerList.get(i).getPhone().equals(phone);
				i++;
			}
		}
		return i-1;   //루프 else 에서  i++이 되기 때문에 하나 낮은 값을 리턴해야한다. 테스트완료
	}
	
	//반복되는 작업이어서 메소드 하나 만들었음. 전화번호를 입력받고 리스트에서 일치하는 회원정보를 출력한 후 인덱스를 리턴함.
		public int searchCustomer() {
			boolean botton = true;
			int i = 0;
			while (botton) {
				Scanner sc = new Scanner(System.in);
				System.out.println("찾으시는 회원님의 전화번호를 입력해주세요. 메인메뉴로 돌아가시려면 0을 눌러주세요.");
				String reply = sc.next();
				if (reply.equals("0")) {
					botton = false; // 입력값이 0이면 메인메뉴로 이동하고 -3을 리턴
					i = -3;
				}
				else { // 0이 아니면 검색시작.
					i = searchIndex(reply); // Main클래스에 searchIndex()메소드 참고
					// 리턴받은 인덱스값으로 수행.
					if (i < 0) botton = true; // 인덱스가 음수 값이 나오는 것은 리스트에 아무것도 없던지 아니면 검색 일치 값이 없을 때임.
					
					else {
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						System.out.println("							회원 정보 조회");
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						System.out.println(" 이름   |  생년월일  |     전화번호          |      주소            |   등록 날짜        |   종료 날짜       |   수강 프로그램     |   등록 날짜        |  종료 날짜    ");
						System.out.println("------------------------------------------------------------------------------------------------------------------------");

						System.out.println(Main.customerList.get(i)); // 리스트에 인덱스 값에 있는 Customer인스턴스를 출력.(toString)
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						botton = false;
					}
				}
			}
			return i;
		}
}
