public class frequency {
    public static void main(String[] args) {
        int a[]={1,1,1,2,2,2,2,2,3,4,4,5,5,5,6};
        
        int n=0;
        int i=0;
        for(i=0;i<a.length;i++){
            int k=0;
            for( int j=i;j<a.length;j++){
             if(a[i]==a[j]){
                k++;
             }
              
            }
                if(n!=a[i]){
                    n=a[i];
                    System.out.print(a[i]);
                    System.out.println(","+k);
            }
            
            
        }
            
                

                

                
                
     }

}
        
        
    


