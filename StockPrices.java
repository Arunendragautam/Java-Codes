public class StockPrices {
    public static int buyAndShellStock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;
        for(int i = 0 ; i <prices.length; i++){
            
            if (buyPrice< prices[i] ){
                int profit = prices[i] - buyPrice;
                MaxProfit = Math.max(MaxProfit, profit);


            }else{
                buyPrice = prices[i];
            }
        }
        return MaxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndShellStock(prices));
            
        }
}
