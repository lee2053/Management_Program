package project;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * 
 * 
 */
public class DayCal {  // *************************예외처리 완료
	Date day;
	String start;
	String last;
	SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");

	public String startcal() {
		//오늘 날짜 기준으로 설정함. 
		
		day = new Date();
		start = df.format(day);
		return start;
	}
	
	public String lastcal() {
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			int during = 0; //0으로 초기화.
			System.out.println("몇 개월 등록하시겠습니까?"); 
			
			//int값이 아닌 String 등으로 입력했을 때 예외처리 필요.
			//예외. 문자를 입력했을 때, 음수 값을 입력했을 때.
			try {
				during = sc.nextInt(); //개월 수 입력
				if(during<0) throw new InputMismatchException(); //음수를 입력했을 때 예외처리
			}
			catch(InputMismatchException e) {
				System.out.println("잘못된 값을 입력했습니다. 숫자를 입력해주세요."); //문자같은 다른 값을 입력했을 때 예외처리.
				during = 0; //이거로 음수예외처리 완료
			}
			
			day.setMonth(day.getMonth()+during);
			last = df.format(day);
			
			if(during !=0) break;
		}
		return last;
	}
}
