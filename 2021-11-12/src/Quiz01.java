import java.awt.print.Paper;

class Box{
        public void Wrap(){
                System.out.println("Simple Wrapping");
        }
}
class PaperBox extends Box{
        public void Wrap(){
                super.Wrap();
                System.out.println("Paper Wrapping");
        }
}
class GoldPaperBox extends PaperBox{
        public void Wrap(){
                super.Wrap();
                System.out.println("Gold Wrapping");
        }
}

public class Quiz01 {
        public static void main(String[] args) {
                GoldPaperBox box1 = new GoldPaperBox();

                box1.Wrap();

        }
}

