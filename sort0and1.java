public class sort0and1 {
    public static void main(String[] args) {
        int a[]={0,0,0,1,0,1,0,1,0,1,0,0};
        for(int i=0;i<a.length;i++){
            int k=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    k=a[i];
                    a[i]=a[j];
                    a[j]=k;

                }

            }
            
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    
        
    }
}
