

public class P01 {
        public static int min(int[] arr){
            int min = arr[0];
            for (int i = 0; i < arr.length; i++){
                System.out.println("arr ["+i+"]  = "+arr[i]);
                if(min > arr[i]){
                    min = arr[i];
                }
            }
            return min;
        }
        public static int max(int[] arr){
            int max = arr[0];
            for (int temp : arr){
                System.out.println("temp ="+temp);
                if(max < temp){
                    max = temp;
                }
            }
            return max;
        }
    public static void main(String[] args) {
            int arr[] = {3,1,2,4,10,20,45};
            System.out.println("min = "+min(arr));
            System.out.println("max = "+max(arr));

    }
}
