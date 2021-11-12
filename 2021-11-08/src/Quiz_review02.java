import java.util.Scanner;

public class Quiz_review02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("파일명을 입력 >>>");
        String inputString = s.nextLine();
        System.out.println("inputString = "+inputString);
        String ar[] = inputString.split("\\.");//split 기준을 .으로 할땐 escape 문인 \\을 붙여야한다.
//        for(String a : ar){
            System.out.println("a = "+ar[0]);
            System.out.println("a = "+ar[1]);
        }
    }
//}
