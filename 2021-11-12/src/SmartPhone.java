import java.lang.*;
/*
        생략가능
        import java.lang
        super()
        toString()
        this. super. 생략가능
        extend object -> 자바 최상위 클래스
        @override
 */

//기본 생성자 호출은 무조건 하기 때문에 부모클래스
//선언 되어져 있어야 한다.
class MobilePhone{
        int number;
        public MobilePhone(){}
        MobilePhone(int number){
                this.number = number;
        }
        public String toString() {
                return "MobilePhone{" +
                        "number=" + number +
                        '}';
        }

        public void answer(){
                System.out.println("Hi from" +number);
        }
}
class Smartphone extends MobilePhone {

        private String androidVer;

        Smartphone(int num, String androidVer) {
                super(num);
                this.androidVer = androidVer;
        }

        public void playApp() {
                System.out.println("안드로이드 버전 = " + androidVer);
        }




        public static void main(String[] args) {
                MobilePhone mp = new MobilePhone(123);
                System.out.println(mp);
                mp.answer();
                System.out.println();
                Smartphone sp = new Smartphone(400,"9버전");
                System.out.println(sp);
                sp.answer();
                sp.playApp();
             
             MobilePhone mps = new Smartphone(500,"10버전");
             mps.answer();
//             mps.playApp();은 안된다
                //다형성
                //자식 객체는 부모 클래스를 담을수 있다.
                //부모 참조변수는 자식객체를 참조할수 있다.
                
                //object - > mobilePhone -> SmartPhone
                
                Object a = new MobilePhone();
                Object b = new Smartphone(600,"11버전");

                ((MobilePhone)a).answer();
                Smartphone ss = (Smartphone) b;
                ss.playApp();

//                ((Smartphone)b).playApp();


        }
}


