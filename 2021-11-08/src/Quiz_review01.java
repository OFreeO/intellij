import java.util.Scanner;

public class Quiz_review01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("이름을 성과 이름을 띄워서 영어로 입력 >>>");
        String inputString = s.nextLine();
        System.out.println("inputString = "+inputString);
        String ar[] = inputString.split(" ");//입력받은 string을 띄워쓰기 부분에서 나누어라
//        for(String a : ar){
            System.out.println("a = "+ar[0]);
            System.out.println("a = "+ar[1]);
        }
    }
//}
