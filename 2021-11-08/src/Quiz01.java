class arr{
    public static int Max(int[] a){
    int max = a[0];

    for(int i = 0; i <= a.length;i++){
        if(max < a[i])
            max = a[i];
    }
    return max;
    }
    public static int Min(int[] a){
        int min = a[0];

        for(int e: a){
            if(min > e)
                min = e;
        }
       return min;
    }
}

public class Quiz01 {
    public static void main(String[] args) {
        int [] ar = {1,2,3,4,5,6,7};
        System.out.println(Max(ar));
        System.out.println(Min(ar));
    }

}
