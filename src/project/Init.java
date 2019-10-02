package project;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
 
public class Init {
    public static void start() {
        String[] name = { "김자바", "홍길동", "스티브", "주커버", "그리거", "트럼프", "푸틴쓰", "시진핑", "빌게이", "워렌버", "호날두", "르브론", "메시리",
                "힐러리", "실바야", "최홍만", "백종원", "알바몬", "최태원", "도라에", "진구얌", "크리스", "브라운", "칸예웨", "스윙스", "빈지노", "돈까스", "전지현",
                "김태희", "송혜교", "릴디키", "칼리드" };
        String[] state = { "서초구", "강남구" };
        String[] dong = { "서초동", "역삼동", "방배동", "논현동" };
        for (int i = 0; i < name.length-20; i++) {
            Random r = new Random();
            int randomName = r.nextInt(name.length);
            int randomstate = r.nextInt(state.length);
            int randomdong = r.nextInt(dong.length);
 
            Customer c = new Customer();
 
            c.name = name[randomName];
            c.birthday = (String.valueOf(r.nextInt(49) + 50) + (r.nextInt(2) + 10) + "0" + r.nextInt(9));
            c.phone = ("010-" + String.valueOf(r.nextInt(9)) + String.valueOf(r.nextInt(9))
                    + String.valueOf(r.nextInt(9)) + String.valueOf(r.nextInt(9)) + "-" + String.valueOf(r.nextInt(9))
                    + String.valueOf(r.nextInt(9)) + String.valueOf(r.nextInt(9)) + String.valueOf(r.nextInt(9)));
            c.address = ("서울시 " + state[randomstate] + " " + dong[randomdong]);
            int date = r.nextInt(21) + 10;
 
            c.start = ("2019/0" + String.valueOf(r.nextInt(2) + 1) + "/" + String.valueOf(date));
            c.last = ("2019/0" + String.valueOf(r.nextInt(5) + 4) + "/" + String.valueOf(date));
            c.yoga = new Yoga();
            c.yoga.name = "요가";
            c.yoga.start = c.start;
            c.yoga.last = c.last;
 
            Main.customerList.add(c);
        }
        for (int i = 10; i < name.length-10; i++) {
            Random r = new Random();
            int randomName = r.nextInt(name.length);
            int randomstate = r.nextInt(state.length);
            int randomdong = r.nextInt(dong.length);
 
            Customer c = new Customer();
 
            c.name = name[randomName];
            c.birthday = (String.valueOf(r.nextInt(49) + 50 + "0" + (r.nextInt(8) + 1) + (r.nextInt(20) + 10)));
            c.phone = ("010-" + String.valueOf(r.nextInt(9)) + String.valueOf(r.nextInt(9))
                    + String.valueOf(r.nextInt(9)) + String.valueOf(r.nextInt(9)) + "-" + String.valueOf(r.nextInt(9))
                    + String.valueOf(r.nextInt(9)) + String.valueOf(r.nextInt(9)) + String.valueOf(r.nextInt(9)));
            c.address = ("서울시 " + state[randomstate] + " " + dong[randomdong]);
            int date = r.nextInt(21) + 10;
 
            c.start = ("2019/0" + String.valueOf(r.nextInt(8) + 1) + "/" + String.valueOf(date));
            c.last = ("2019/" + String.valueOf(r.nextInt(2) + 10) + "/" + String.valueOf(date));
            c.pt = new Pt();
            c.pt.name ="PT";
            c.pt.count = r.nextInt(20) + 10;
 
            Main.customerList.add(c);
        }
        for (int i = 20; i < name.length; i++) {
            Random r = new Random();
            int randomName = r.nextInt(name.length);
            int randomstate = r.nextInt(state.length);
            int randomdong = r.nextInt(dong.length);
 
            Customer c = new Customer();
 
            c.name = name[randomName];
            c.birthday = (String.valueOf(r.nextInt(49) + 50 + "0" + (r.nextInt(8) + 1) + (r.nextInt(20) + 10)));
            c.phone = ("010-" + String.valueOf(r.nextInt(9)) + String.valueOf(r.nextInt(9))
                    + String.valueOf(r.nextInt(9)) + String.valueOf(r.nextInt(9)) + "-" + String.valueOf(r.nextInt(9))
                    + String.valueOf(r.nextInt(9)) + String.valueOf(r.nextInt(9)) + String.valueOf(r.nextInt(9)));
            c.address = ("서울시 " + state[randomstate] + " " + dong[randomdong]);
            int date = r.nextInt(21) + 10;
 
            c.start = ("2019/0" + String.valueOf(r.nextInt(8) + 1) + "/" + String.valueOf(date));
            c.last = ("2019/" + String.valueOf(r.nextInt(2) + 10) + "/" + String.valueOf(date));
            // c.pt = new Pt();
            // c.pt.count = r.nextInt(30)+1;
 
            Main.customerList.add(c);
        }
        for (int i = 25; i < name.length; i++) {
            Random r = new Random();
            int randomName = r.nextInt(name.length);
            int randomstate = r.nextInt(state.length);
            int randomdong = r.nextInt(dong.length);
 
            Customer c = new Customer();
 
            c.name = name[randomName];
            c.birthday = (String.valueOf(r.nextInt(49) + 50 + "0" + (r.nextInt(8) + 1) + (r.nextInt(20) + 10)));
            c.phone = ("010-" + String.valueOf(r.nextInt(9)) + String.valueOf(r.nextInt(9))
                    + String.valueOf(r.nextInt(9)) + String.valueOf(r.nextInt(9)) + "-" + String.valueOf(r.nextInt(9))
                    + String.valueOf(r.nextInt(9)) + String.valueOf(r.nextInt(9)) + String.valueOf(r.nextInt(9)));
            c.address = ("서울시 " + state[randomstate] + " " + dong[randomdong]);
            int date = r.nextInt(21) + 10;
 
            c.start = ("2019/0" + String.valueOf(r.nextInt(8) + 1) + "/" + String.valueOf(date));
            c.last = ("2019/" + String.valueOf(r.nextInt(2) + 10) + "/" + String.valueOf(date));
            c.yoga = new Yoga();
            c.yoga.start = c.start;
            c.yoga.last = c.last;
            
            c.pt = new Pt();
            c.pt.name = "PT";
            c.pt.count = r.nextInt(30)+10;
 
            Main.customerList.add(c);
        }
        
    }
}
