public class sortminuselement {
    public static void main(String[] args) {
        int arr[]={-2,-6,3,-8,-1,7,0};
        int i=0;
        int temp=0;
        for(i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
