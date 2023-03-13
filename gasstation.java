public class gasstation {
    public static void main(String[] args) {
        int gas[]={1,2,3,4,5};
        int cost[]={3,4,5,1,2};
        int n=cost.length;
        int loss=0;
        int start=0;
        int res=0;
        for(int i=0;i<n;i++){
             res=res+gas[i]-cost[i];
            if(res<0){
                start=i+1;
                loss=loss+res;
                res=0;


            }


        }
        if((loss+res)>=0){
            System.out.println(start);

        }

    }
    
}
