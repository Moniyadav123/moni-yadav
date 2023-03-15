public class pairsum {
    public static void main(String[] args) {
        
        int a[]={1,2,5,3,6};
        int k=11;
        int sum=0;
        int i=0;
        for(i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
            sum=a[j]+a[i];
            if(sum==k){
                System.out.print(a[i]);
                System.out.print(a[j]);

            }


        }
    }
    
}
}
