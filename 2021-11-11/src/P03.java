public class P03 {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0 ; j < arr[i].length; j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }


        charr(arr);
        System.out.println("변경후");

        for(int i = 0; i < arr.length; i++){
            for(int j = 0 ; j < arr[i].length; j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static void charr(int [][] arr){
        int brr[] = arr[0];//brr은 0번째행을 가지고 있다
//        for (int b : brr){
//            System.out.println("b = "+b)}

        arr[0] = arr[2];
        arr[2] = brr;

        brr = arr[1];
        arr[2] = arr[1];
        arr[1] = brr;
    }
}
