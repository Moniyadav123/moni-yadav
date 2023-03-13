public class consecutive {
    public static void main(String[] args) {
        int a[]={1,40,30,10,20,5};
        int n=a.length;
        int k=3;
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(k>0){
                sum=sum+a[i];
                k--;
                if(max<sum)
                    max=sum;
            }
            
            else {
                
                    k=3;
                sum=0;
                i=i-3;
                   
                }
                
                
            }
            System.out.print("Maximum sum is:"+max);
        }
        

        
    }
    

