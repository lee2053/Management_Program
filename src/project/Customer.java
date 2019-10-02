package project;
 
import java.util.Scanner;
 
public class Customer {         // *************************예외처리 완료
 
    String name;
    String birthday;
    String phone;
    String address;
    String start; 
    String last; 
    Yoga yoga;
    Pt pt;
     
    Scanner sc = new Scanner(System.in);
     
    //getter/setter
    public String getName() {
        return name;
    }
    public void setName() {
        System.out.println("이름을 입력하세요.");
        this.name = sc.next();
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday() {
        System.out.println("생년월일을 입력하세요. ex)911001");
        this.birthday = sc.next();
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone() {
        System.out.println("전화번호를 입력하세요. ex)010-1234-5678");
        this.phone = sc.next();
    }
    public String getAddress() {
        return address;
    }
    public void setAddress() {
        System.out.println("주소를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        this.address = sc.nextLine();
    }
     
    //setStrat와 setLast는 동시에 이루어지기 때문에 합쳤습니다.
    public void setStartLast() { //작업완료 언제시작해서 언제 끝나냐 매소드
         
        DayCal st = new DayCal();
        st.startcal();
        st.lastcal();
        this.start = st.start;
        this.last = st.last;
    }
    public String getStart() {
        return start;
    }
    public String getLast() {
        return last;
    }
    //추가 프로그램 요가나 PT set을 위한 메소드.
    public void select() {
        boolean x = true;
        while(x) {
             
            System.out.println("수강 프로그램을 입력해주세요.\n 1. PT 2. 요가 3. 없음"); //예외처리 완료
             
            String selecNum = sc.next();
             
            if(selecNum.equals("1")) {
                selecPt();
                x = Select.selectYN("추가적인 프로그램을 등록하시겠습니까? Y/N"); //YN선택메소드 예외처리 다함.
            }
            else if(selecNum.equals("2")) {
                selecYoga();
                x = Select.selectYN("추가적인 프로그램을 등록하시겠습니까? Y/N"); //YN선택메소드 예외처리 다함.
            }
            else if(selecNum.equals("3")) x = false;
            else System.out.println("잘못된 값을 입력했습니다. 다시 입력해주세요.");
        }
    }
     
    public void selecYoga() {
        Yoga yoga = new Yoga();
        yoga.setCount(); //날짜계산기를 통해 시간설정 
        this.yoga = yoga; //설정된 객체를 필드에 저장
    }
 
    public void selecPt() {
        Pt pt = new Pt();
        pt.setCount(); // 횟수입력하는 메소드 실행해서 횟수 획득
        this.pt = pt; // 설정된 횟수에 대한 객체를 필드에 저장
    }
 
    @Override
    public String toString() {
        if (pt == null && yoga == null) {
            return name + " | " + birthday + " | " + phone + " | " + address + " | " + start + " | " + last + " |    "
                    + "  -       |      -     |      -     ";
        } else if (pt == null && yoga != null) {
            return name + " | " + birthday + " | " + phone + " | " + address + " | " + start + " | " + last + " |      "
                    + yoga.name + "            | "+yoga.start+" | " + yoga.last;
        } else if (pt != null && yoga == null) {
            return name + " | " + birthday + " | " + phone + " | " + address + " | " + start + " | " + last + " |    "
                    + pt.name + "("+ String.valueOf(pt.count)+")    |      -     |      -     " ;
        } else {
            return name + " | " + birthday + " | " + phone + " | " + address + " | " + start + " | " + last + " |  "
                    + yoga.name +", "+ pt.name + "("+String.valueOf(pt.count)+") | " + yoga.start+ " | "+ yoga.last;
            
        }
    }
}