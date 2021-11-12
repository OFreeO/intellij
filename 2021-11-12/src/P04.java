class CC{
        public void doC(){
                System.out.println("CC doC");
        }
}
class D{
        public void doD(){
                System.out.println("D doD");
        }

}
class DD extends D{
        public void doD(){
                System.out.println("DD doD");
        }
}


public class P04 {

        public static void main(String[] args) {
                CC c = new CC();
                D d1 = new DD();
                DD d2 = new DD();

//                if(C instanceof  DD){
//                }
                if (d1 instanceof  DD){
                        System.out.println("true");
                }
                if(d2 instanceof DD){
                        System.out.println("true");
                }
        }
}
