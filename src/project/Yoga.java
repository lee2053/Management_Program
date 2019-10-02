package project;


public class Yoga {
	String name;
	String start;
	String last;
	
	
	public Yoga() {
		this.name = "요가";
	}

	public void setCount() {
		System.out.println("요가를 선택하셨습니다.");
		// TODO Auto-generated method stub
		DayCal cal = new DayCal(); //개월 수를 입력해주세요.
		cal.startcal();
		cal.lastcal();
		start = cal.start;
		last = cal.last;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	
	
}
