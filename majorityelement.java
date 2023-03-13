public class majorityelement {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,2,4,2,2};
        int majority=0;
        int count=0;
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                majority=arr[i];

            }
            if(majority==arr[i]){
                count++;
            }
            else{
                count--;

            }
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==majority){
                k++;

            }

        }
        if(k==(arr.length/2)){
            System.out.print(majority);
        }
    }
    
}
