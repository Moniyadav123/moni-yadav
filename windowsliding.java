public class windowsliding {
    public static void main(String[] args) {
        int a[]={1,40,30,10,20,5};
        int n=a.length;
        int k=3;
        int sum=0;
        int max=0;
        
        for(int i=0;i<k;i++){
            sum=sum+a[i];
            max=sum;
        }
        for(int i=k;i<n;i++){
            sum=sum+a[i]-a[i-k];
            if(sum>max){
                max=sum;
            }
        }
        System.out.print(max);
    }
    
}
