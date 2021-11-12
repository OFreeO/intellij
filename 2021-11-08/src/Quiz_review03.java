import java.util.Scanner;

public class Quiz_review03 {
    public static void menu() {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("1.더하기 2. 빼기 3. 나누기 4. 곱하기 5.나머지 6.종료");
            int select = s.nextInt();
            if (select == 1) {
                System.out.println("첫번째 수 입력>");
                int n1 = s.nextInt();
                System.out.println("두번째 수 입력 >");
                int n2 = s.nextInt();
                System.out.println("더하기>>"+(n1+n2));
            } else if (select == 2) {
                System.out.println("첫번째 수 입력>");
                int n1 = s.nextInt();
                System.out.println("두번째 수 입력 >");
                int n2 = s.nextInt();
                System.out.println("빼기>>"+(n1-n2));
            } else if (select == 3) {
                System.out.println("첫번째 수 입력>");
                int n1 = s.nextInt();
                System.out.println("두번째 수 입력 >");
                int n2 = s.nextInt();
                System.out.println("나누기>>"+(n1/n2));
            } else if (select == 4) {
                System.out.println("첫번째 수 입력>");
                int n1 = s.nextInt();
                System.out.println("두번째 수 입력 >");
                int n2 = s.nextInt();
                System.out.println("곱하기>>"+(n1*n2));
            } else if (select == 5) {
                System.out.println("첫번째 수 입력>");
                int n1 = s.nextInt();
                System.out.println("두번째 수 입력 >");
                int n2 = s.nextInt();
                System.out.println("나머지>>"+(n1%n2));
            } else if (select == 6) {
                System.out.println("종료합니다.");
                break;
            }
        }

    }


    public static void main(String[] args) {
        menu();
    }
}
