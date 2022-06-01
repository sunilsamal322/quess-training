public class Q9PriceCalculation {
    public static void main(String[] args) {
        float price_per_item = Float.parseFloat(args[0]);
        int quantity = Integer.parseInt(args[1]);
        double total_amount=quantity*price_per_item;
        double discount=0;
        if (quantity >= 10)
        {
            discount=total_amount/10;
            total_amount=total_amount-discount;
            System.out.println("Final amount to be paid "+total_amount);
        }
        else
        {
            System.out.println("Final amount to be paid "+total_amount);
        }
    }
}
