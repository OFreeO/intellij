class PPA{
    public static int count = 10;

}
class CPA extends  PPA{
    public void doA(){
        System.out.println("count = " +count);
    }
}



public class P05 {
    public static void main(String[] args) {
        new CPA().doA();
        System.out.println("static 으로 접근");
        System.out.println(PPA.count);
    }
}
