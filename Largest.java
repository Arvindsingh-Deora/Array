
public class Largest{

     public static int firstlargest(int arr[]){
        int max = arr[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        
        }
           return max;
    }

    public static void main(String[] args){
        int arr[] ={12,14,16,22,18,20};
        System.out.println("The largest element in array is" + firstlargest(arr));

    }
}