class box{
    private String conts;

    public box(String conts) {
        this.conts = conts;
    }

    @Override
    public String toString() {
        return "box{" +
                "conts='" + conts + '\'' +
                '}';
    }
}




public class P02{
    public static void main(String[] args) {
        box[] boxes = new box[3];
        for(box temp : boxes){
            System.out.println("temp = "+temp);
        }
        boxes[0] = new box("사과");
        boxes[1] = new box("바나나");
        boxes[2] = new box("수박");

        for(box temp : boxes){
            System.out.println("temp = "+temp);
        }

    }
}
