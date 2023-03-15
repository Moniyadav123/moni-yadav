public class nnacciseries {
    public static void main(String[] args) {
        int arr[]={0,0,0,0,0,0,0,0,0,0,0,0};
        int n=5;
        arr[n-1]=arr[n]=1;
        for(int i=n+1;i<arr.length;i++){
            for(int j=1;j<=n;j++){
            arr[i]=arr[i]+arr[i-j];


        }
       


    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        

    }
    
}
}
