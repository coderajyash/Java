import java.util.Scanner;

public class MinDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int i=0;
        while (i<n){
            a[i] = sc.nextInt();
            i++;
        }
        int k = sc.nextInt();
        int l=0,h=n-1,m;
        int prev,next;
        int res = Integer.MAX_VALUE;
        while(l<=h){
            m = l+(h-l)/2;
            // if we use previous , a[m] will get ignored and can give wrong ans in some cases
            next = (m+1)%n;
            if(a[m]==k){
                res = 0;
                break;
            }
            else if(k<a[next] && k>a[m]){
                res = Math.min(a[next]-k,k-a[m]);
                break;
                }
            else if(a[m]>k){
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        System.out.println("Minimum Difference : "+res);
    }
}
