class car{
    String name;
    public void tellName(){
        System.out.println("name = "+name);
    }
}
public class Hcar extends car {
    String brand;
    public Hcar(){
        name = "아반떼";
        brand = "현대";
    }
    public void tellinfo(){
        System.out.println("name = "+name);
        System.out.println("brand = "+brand);


    }
    public static void main(String[] args) {
        Hcar hcar = new Hcar();
        hcar.tellinfo();
    }
}
