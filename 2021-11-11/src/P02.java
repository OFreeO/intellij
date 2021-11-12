

public class P02 {
    public static void addOnedArr(int[] arr, int add){
        for(int i = 0; i < arr.length; i++){
            arr[i]  = arr [i] + add;
        }
    }
    public static void addTwodArr(int[][] arr, int add){
        for(int temp_arr[] : arr){
            addOnedArr(temp_arr,add);
        }
    }
    //2차원 배열은 1차원 배열이 여러개다
    //3차원 배열은 2차원 배열이 여러개다
    //4차원 배열은 3차원 배열이 여러개다
    public static void main(String[] args) {
//        int arr[] = {10,5,3,2,7};
        int add = 4;
//        addOnedArr(arr,add);
        int darr[][] = {{10,5,2},{1,2,3,4},{6,7,8,9,10}};
        for(int temp_arr[] : darr){
            for(int temp : temp_arr) {
                System.out.println("temp = " + temp);
            }
            System.out.println();
        }
        addTwodArr(darr,add);
        System.out.println("변경후");
        for(int temp_arr[] : darr){
            for (int temp : temp_arr){
                System.out.println("temp = "+temp);
            }
            System.out.println();
        }
    }
}
