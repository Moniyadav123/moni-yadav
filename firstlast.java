public class firstlast {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,5,5,5,5,5};
        int n=arr.length;
        int serch=5;
        int low=0;
        int k=0;
        int r=0;
        for(int i=0;i<n;i++){
            if(arr[i]==serch){
                if(serch!=low){
                low=serch;
                k=i;
                
                }
                r=i;
                 
            }
        }
        System.out.println(k);
        System.out.print(r);
    }
    
}
