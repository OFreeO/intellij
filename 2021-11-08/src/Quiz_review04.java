import java.util.Scanner;

public class Quiz_review04 {
    public static void main(String[] args) {
        String numbers[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "zero"};
        Scanner s = new Scanner(System.in);
        System.out.println("숫자카드 입력 : ");
        String inputString = s.nextLine();
        for (int i = 0; i < numbers.length; i++) {
            inputString = inputString.replaceAll(numbers[i], (i + 1) + "");
        }
        System.out.println("inputString >> " + inputString);
        for (int i = 0; i < numbers.length; i++) {
            inputString = inputString.replaceAll(String.valueOf(i + 1), numbers[i]);
        }
        System.out.println("inputString >>"+inputString);
    }
}
