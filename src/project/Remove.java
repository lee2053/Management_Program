package project;


public class Remove extends Search{
	
	public void start() {
		boolean botton = true;
		while(botton) {
			System.out.println("------------------------------------------------------------------------------------------------------------------------");
			System.out.println("							회원 정보 삭제  ");
			System.out.println("------------------------------------------------------------------------------------------------------------------------");
			int index = searchCustomer(); //전화번호로 찾고 회원정보를 프린트한 후 해당 인덱스를 반환받음
			if(index == -3) break; 
			boolean r = Select.selectYN("삭제하려는 회원님의 정보가 맞습니까? 삭제를 원하시면 Y 아니면 N을 입력해주세요.");
			if(r == true) {
				botton = Select.select12(Main.customerList.get(index).getName()+"님의 정보가 삭제되었습니다. 메인메뉴로 돌아가시려면 1번, 추가삭제를 하시려면 2번을 입력해주세요.");
				Main.customerList.remove(index);
			}
			else botton = Select.select12("메인메뉴로 돌아가시려면 1번 회원 정보 삭제를 하시려면 2번을 입력해주세요.");
		}
	}
}
