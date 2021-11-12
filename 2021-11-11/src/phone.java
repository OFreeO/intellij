import java.util.Scanner;

class data{
        Scanner s = new Scanner(System.in);
        private String [] name = new String[100];
        private int [] number = new int[100];
        public data() {
                int h = 0;
                String[] name = null;
                String number = null;
                System.out.println("저장할 인원수>>>");
                h = s.nextInt();
                for(int i = 0; i<h; i++){
                        System.out.println((i+1)+"번째 사람의 이름 입력>>");
                }
        }

        public int[] getNumber() {
                return number;
        }

        public void setNumber(int[] number) {
                this.number = number;
        }

        public String[] getName() {
                return name;
        }

        public void setName(String[] name) {
                this.name = name;
        }
}

public class phone {
        public static void main(String[] args) {
                int c = 0;
                data a = new data();
                Scanner s = new Scanner(System.in);
                System.out.println("전화번호부");
                System.out.println("1.저장하기 2.확인하기 3.종료");
                c = s.nextInt();
                while (true) {
                        switch (c) {
                                case 1:
                                        a.data();
                                        break;
                                case 2:

                                        break;
                                case 3:

                                        break;
                                default:
                                        break;
                        }
                }
        }
}
