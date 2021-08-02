import java.util.Scanner;

public class FloorElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of elements :");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter Array elements");

        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Search Element : ");
        int s = sc.nextInt();
        int l=0,h=n-1,m;
        int res = -1;
        //[1,2,3,5,7,8,9,10] for element 4 floor will be 3
        while(l<=h){
            m = l+(h-l)/2;

           if(a[m]==s){
               res = a[m];
               break;

           }
           else if(a[m]>s){
               h=m-1;

           }
           else{
               res = Math.max(res,a[m]);
               l=m+1;
           }

        }
        System.out.println("Floor of Element is  :"+res);
    }
}
