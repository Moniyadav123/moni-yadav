public class Leader {
    public static void main(String[] args) {
        int a[]={2,30,10,7,8,40,1};
        int max=a[a.length-1];
        System.out.println(a[a.length-1]);
        for(int j=a.length-2;j>0;j--){
            if(a[j]>a[j+1]){
            
                if(max<a[j]){
                    max=a[j];
                System.out.println(a[j]);
            }
        }
             

        }
    }
}


