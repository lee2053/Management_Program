package project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pt {
	String name;
	int count;
	
	public Pt() {
		this.name = "피티";
	}

	public void setCount() {
		
		System.out.println("PT를 선택하셨습니다.");
		//예외처리 인트 값을 받아야하고 음수 값은 예외 
		while(true){
			//입력값 받고 count에 저장해야 함.
			Scanner sc = new Scanner(System.in);
			int count = 0;
			System.out.println("횟수를 입력해주세요.");
			try {
				count = sc.nextInt();
				if(count<0) throw new InputMismatchException();
			}
			catch(InputMismatchException e){
				System.out.println("잘못된 값을 입력했습니다.");
				count = 0;
			}
			this.count = count;
			if(count!=0) break;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}
}
