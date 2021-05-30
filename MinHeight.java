
import java.util.Scanner;

public class MinHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int i;
            System.out.println("Enter value of k : ");
            int k =sc.nextInt();
            System.out.println("Enter number of elements : ");
            int n = sc.nextInt();
            int[] a = new int[n];
          

            for(i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            int max = a[0] , min=a[0];

            for(i=0;i<n;i++){
                if(a[i]>max){
                    max=a[i];
                }
                if(a[i]<min){
                    min = a[i];
                }
            }
            System.out.println("Minimum Height : "+((max-k)-(min+k)));
    }
}
