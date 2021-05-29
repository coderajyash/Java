

class NegativeTogether{
    public static void main(String[] args) {
        
        int a[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };

        int i =0,j=1;
        while(j<a.length){
            if(a[j]<0){
                if(a[i]<0){
                    i++;
                    j++;
                }
                else{
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                    i++;
                    j++;
                }
            }
            j++;
        }
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}