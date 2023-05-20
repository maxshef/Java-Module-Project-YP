import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductFeatures productFeatures = new ProductFeatures (); //объект класса ProductFeatures
        Farmaterr farmaterr = new Farmaterr ();//объект класса Farmaterr
        int howPeople = 0;
        String chek4num;
        while (howPeople <=1){
            System.out.println("Сколько счетов у Вас будет?");
                try {
                    chek4num = scanner.nextLine();
                    howPeople = Integer.parseInt(chek4num);
                }
                catch (Exception error){
                    System.out.println("Введите чиловое значение больше 1");
            }
        }
        System.out.println("Счет будет разделен на:" + howPeople);
        productFeatures.product(scanner);
        //farmaterr.formatRub();
        double finalScorePeople = productFeatures.finalProductPrice / howPeople;
        String RUB = farmaterr.formatRub(howPeople, productFeatures.finalProductPrice);
        System.out.println("Список продуктов:\n"+productFeatures.listProducts+"\n");
        String format = "Общая стоимость составила:  %.2f "+RUB+ "\nс каждого по:";
        //String format = "Общая стоимость составила:  %.2f "+RUB+ "\nс каждого по: %.2f " +RUB+".";
        System.out.println(String.format(format, productFeatures.finalProductPrice));
    }
}
