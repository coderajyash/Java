import java.util.Scanner;

public class RotatedCount {
    public static void main(String[] args) {
        int i,n=8;
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements : ");
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int l=0,m,h=n-1,res=0,prev,next;
        while(l<=h) {

            m = l + (h - l) / 2;
            prev = (m + n - 1) % n; // Avoids index out of bounds issue
            next = (m + 1) % n; // Avoids index out of bounds issue

            if (a[m] <= a[prev] && a[m] <= a[next]) {// Minimum element will smaller than former and later
                res = n - m;
                break;
            } else if (a[m] <= a[l]) {
                h = m - 1;

            } else if (a[m] >= a[h]) {
                l = m + 1;
            }
        }
        System.out.println("Array is rotated : "+res+" times");
    }
}
