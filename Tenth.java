public class Tenth {
    public static void main(String[] args) {
        int stocks[] = {7,1,5,3,6,4};
        int buyPrice = Integer.MAX_VALUE;
        int max = 0 ;
        for(int i = 0;i<stocks.length;i++){
            if(buyPrice<stocks[i]){
                int profit = stocks[i]- buyPrice;
                max = Math.max(profit,max);
            }
            else{
                buyPrice = stocks[i];
            }
                    System.out.println(max);
        }

    }
}
