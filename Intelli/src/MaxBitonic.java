import java.util.Scanner;


//Bitonic means [1,3,8,'12',4,2]
//Inreasing till 12 then decreasing



public class MaxBitonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a= new int[n];
        int i=0;
         while(i<n){
             a[i]=sc.nextInt();
             i++;

         }
         int l=0,h=n-1,m;

         int res=-1;

         while(l<=h){

             m = l+(h-l)/2;

             if(a[m]>a[m+1] && a[m]>a[m-1]){
                res = a[m];
                break;

             }
             else {
                 if(a[m+1]>a[m] && m<n-1){
                        l=m+1;
                 }
                 else if(a[m-1]>a[m] && m>0){
                     h=m-1;
                 }
             }
         }
         System.out.println("Maximum element :"+res);
    }
}
