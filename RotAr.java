import java.util.Scanner;

public class RotAr {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int i;
            int n =7;
            int a[] =new int[n];
            for(i=0;i<n;i++){
                a[i] = sc.nextInt();

            }
            i=i-2;
            int k = a[n-1];
            while(i>=0){
                a[i+1]=a[i];
                i--;
            }
            a[0] = k;
            for(i=0;i<n;i++){
            System.out.println(a[i]+ " ");

            }
        }
}
