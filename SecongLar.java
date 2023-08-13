public class SecongLar {


    static int SecondSmallest(int[] arr, int n){
        if(n<2){
            return 0;
        }
           int min = Integer.MAX_VALUE;
           int smin = Integer.MAX_VALUE;
           for(int i =0; i<n; i++){
              if(arr[i] < min){
                smin = min;
                min = arr[i];
              }
              else if(arr[i]<smin && arr[i] != min){
                smin = arr[i];
              }
           }
           return smin;

    }

       public static int Secondlargest(int[] arr , int n ){
        if(n<2){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE ;
        
        for(int i =0; i<n; i++){
             if(arr[i]>max){
               secondlargest = max;
                max= arr[i];

             }
             else if(arr[i] > secondlargest  && arr[i] != max){
               secondlargest = arr[i];
             }
              
        }
        return secondlargest;
        
    }
    public static void main(String[] args){
        int arr[] = {12,14,16,18,20};
        int n = arr.length;
        int Sl = Secondlargest(arr, n);
        int Ss = SecondSmallest(arr, n);

        System.out.println("The second largest element " +Sl);
        System.out.println("the SecondSmaleest element in array is " +Ss);
    }
}
