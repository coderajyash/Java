import java.util.Scanner;

public class KadaneAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int i;
            System.out.println("Enter number of elements : ");
            int n = sc.nextInt();
            int a[] =new int[n];
            System.out.println("Enter elements : ");
            for(i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            int s = 0;
            for(i=0;i<a.length;i++){
                s = s + a[i];

                if(s > max){
                    max = s;
                }
                if(s<0){
                    s=0; // Discard Subarray with negative Sum
                }

            }
            System.out.println("Max Sum : "+max);
            
    }
}
