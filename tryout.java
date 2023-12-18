/**
 * tryout
 */
public class tryout {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2};
        
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    found = true;
                }
                else{
                    found = false;
                    break;
                }
                
            }
            if (found) {
                System.out.println(arr[i]);
             
            }
        }
           System.out.println(arr[arr.length-1]);
        
    }
}