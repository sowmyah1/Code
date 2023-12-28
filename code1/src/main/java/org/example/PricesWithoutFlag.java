package  org.example;
class PricesWithoutFlag{
    public static int[] finalPrices(int[] prices) {
        int[] a = new int[prices.length];

        for(int i=0;i<prices.length;i++){
            int dis=0;
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]>=prices[j]){
                    dis = prices[j];
                    break;
                }
            }
            a[i]=prices[i]-dis;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a =finalPrices(new int[]{8,4,6,2,3});
        for (int q:a){
            System.out.println(q);
        }

    }
}