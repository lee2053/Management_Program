package project;

import java.util.Scanner;

/*
 신규등록클래스. 
 */
public class New implements Functionable{
	Scanner sc = new Scanner(System.in);

	public void start() {
		//while문을 돌지 안 돌지 결정하는 값
		boolean init = true;
		
		while(init){
			//SelectYN메소드는 불린값을 리턴함 Y는 true N은 false 예외처리가 다 된 메소드임. 인자값으로 질문을 넣으면 됌.
			System.out.println("------------------------------------------------------------------------------------------------------------------------");
			System.out.println("							신규 회원 등록 ");
			System.out.println("------------------------------------------------------------------------------------------------------------------------");
			init =Select.selectYN("신규회원을 등록하시겠습니까? (Y/N)"); 
				if (init == true) {
					Customer c = new Customer();
					c.setName();
					c.setBirthday();
					c.setPhone();
					c.setAddress();
					c.setStartLast();
					c.select();
					Main.customerList.add(c);
					System.out.println("------------------------------------------------------------------------------------------------------------------------");
					System.out.println("                                                      신규 등록 완료 ");
					System.out.println("------------------------------------------------------------------------------------------------------------------------");
					System.out.println(" 이름   |  생년월일  |     전화번호          |      주소            |   등록 날짜        |   종료 날짜       |   수강 프로그램     |   등록 날짜        |  종료 날짜    ");
					System.out.println("------------------------------------------------------------------------------------------------------------------------");

					System.out.println(c);
					System.out.println("------------------------------------------------------------------------------------------------------------------------");
					System.out.println(c.getName() + "님 회원 등록이 완료되었습니다.");
					
					//select값이 true면 while문 진행 false면 와일문 빠져나와서 메소드 종료.
					init = Select.select12("메인메뉴로 돌아가시려면 1번  추가등록하시려면 2를 입력해주세요."); 
				}
				else if(init == false);  //메소드 종료
			}	
	}
}