public class RDS {

     public static int Remove(int[] arr , int n){
        int i =0;
        for(int j =1; j<arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];

            }
            
        }
          return  i+1;
    }
    public static void main(String[] args){
        int[] arr = {12,14,16,16,18,20,20};
        int n = arr.length;
        int ans = Remove(arr ,n);

        for (int i = 0; i < ans; i++) {
            System.out.print(arr[i] + " ");
        }
     
       
    }  
}
