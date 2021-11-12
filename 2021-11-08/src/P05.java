class mybox{
    private String name;
    private int boxnum;

    public int getBoxnum() {
        return boxnum;
    }
    public mybox(int boxnum,String name){
        this.name = name;
        this.boxnum = boxnum;
    }
    @Override
    public String toString() {
        return "mybox{" +
                "name='" + name + '\'' +
                ", boxnum=" + boxnum +
                '}';
    }
}


public class P05 {
    public static void main(String[] args) {
        mybox[] mybox = new mybox[3];
        mybox[0] = new mybox(101,"coffee");
        mybox[1] = new mybox(202,"computer");
        mybox[2] = new mybox(303,"Dress");

        for(mybox mb : mybox){
            if(mb.getBoxnum() == 303)
                System.out.println(mb.toString());
        }


    }
}
