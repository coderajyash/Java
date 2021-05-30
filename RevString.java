import java.util.Scanner;

public class RevString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();
        
        System.out.println("Enter the string with spaces: ");
        char[] arr = new char[n];
        
        int left = 0 , right = n-1;
        
        for(int i =0;i<n;i++){
          
            arr[i] = sc.next().charAt(0);
        
        }
        
        while(left<right){

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        
        }
        System.out.println("Reverse - ");
        for(int i =0;i<n;i++){
          
            System.out.println(" "+arr[i]);
        
        }
    }
}
