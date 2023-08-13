
public class Roated1 {
    public static void main(String[] args){
        int[] arr = {12,14,16,17,18,20};
         int n = arr.length;
         int k = 2;
         Roataedtoleft(arr, n, k);

         for(int i =0; i<n; i++){
            System.out.println(arr[i] +" ");
            }
    }


         static int Roataedtoleft(int arr[] , int n , int k){
         Reverse( arr , 0, k-1);
         Reverse( arr, k , n-1);
         return Reverse(arr , 0, n-1);



         }

         static int Reverse(int[] arr , int start, int end){
            while(start<end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            return end;
         }

         



    
}
