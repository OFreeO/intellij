/*
import java.lang.*;
to string();
super();
등등 생략되어있다
*/

class PaA{
    String name;
    int pa;
    public PaA(){
        System.out.println("부모생성자");
    }
    public PaA(String name,int pa){
        this.name = name;
        this.pa = pa;
    }
}
class CaA extends PaA{
    int ca;
    int cb;
    CaA(String n,int p,int b, int c){
        super(n,p); //생략된 표현
        ca = c;
        cb = b;
    }

    @Override
    public String toString() {
        return "CaA{" +
                "name='" + name + '\'' +
                ", pa=" + pa +
                ", ca=" + ca +
                ", cb=" + cb +
                '}';
    }
}

public class P04 {
    public static void main(String[] args) {
        CaA caA = new CaA("Name",10,20,30);
        System.out.println(caA);
    }
}
