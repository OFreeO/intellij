class AA{
    public static void addOneDarr(int[] arr, int add){
        for(int i = 0; i< arr.length;i++) {
            arr[i] += add;
        }
    }
    public static void addTwoDArr(int[][] arr, int add){
        AA.addOneDarr(new int[]{1, 2, 3, 4, 5},5);
    }
}



public class Quiz02 {
    public static void main(String[] args) {

    }
}
