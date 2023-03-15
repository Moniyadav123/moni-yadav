import java.util.*;
public class smallerfromcurrentnumber {
    public static void main(String[] args) {
        int a[]={1,2,3,4,4,4,5,6,6};
        Arrays.sort(a);
        int k=0;
        System.out.println("0");
        for(int i=1;i<a.length;i++){
            if(a[i-1]<a[i]){
                k++;
                System.out.println(k);

            }


        }
    }
    
}
