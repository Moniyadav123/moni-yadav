public class peak {
    public static void main(String[] args) {
        int a[]={2,4,5,6,2,8,6,10};
        int max=0;
        for(int i=1;i<a.length-1;i++){
            int peak=0;
            if((a[i]>a[i-1])&&(a[i]>a[i+1])){
                peak=a[i];
            
                if(max<peak){
                    max=peak;
                    
                }
            }

        }
        System.out.println(max);
    }
}

