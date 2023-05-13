import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductFeatures productFeatures = new ProductFeatures (); //объект класса ProductFeatures
        System.out.println("Сколько счетов у Вас будет?");
        int howPeople = 0;
        while (true){
            howPeople = scanner.nextInt();
            if (howPeople <=1) {
                System.out.println("Введено некорректное значение для подсчёта, введите число больше 1");
            }
            if(howPeople > 1) {
                System.out.println("Счет будет разделен на:" + howPeople);
                break;
            }
        }
        productFeatures.product(scanner);
        // - Фарматерр:
        double finalScorePeople = productFeatures.finalProductPrice/howPeople;
        String RUB;
        String RUB2;
        int endingRubles = (int) productFeatures.finalProductPrice;// % 100 / 10;
        int endingRubles2 = (int) finalScorePeople;// % 100 / 10;
        if (endingRubles % 100 >= 11 && endingRubles % 100 <= 14) {
            RUB = "рублей";
        } else

            switch (endingRubles %10){
                case 1:
                    RUB = "рубль";
                    break;
                case 2:
                case 3:
                case 4:
                    RUB = "рубля";
                    break;
                default:
                    RUB = "рублей";
                    break;
            }
        if (endingRubles2 % 100 >= 11 && endingRubles2 % 100 <= 14) {
            RUB2 = "рублей";
        } else
            switch (endingRubles2 % 10){
                case 1:
                    RUB2 = "рублю";
                    break;
                case 2:
                case 3:
                case 4:
                    RUB2 = "рубля";
                    break;
                default:
                    RUB2 = "рублей";
                    break;
            }
        System.out.println("Список продуктов:\n"+productFeatures.listProducts+"\n");
        String format = "Общая стоимость составила:  %.2f "+RUB+ "\nна каждого по: %.2f " +RUB2+".";
        System.out.println(String.format(format, productFeatures.finalProductPrice, finalScorePeople));
    }
}
