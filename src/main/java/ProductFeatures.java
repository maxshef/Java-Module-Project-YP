import java.util.Scanner;
public class ProductFeatures {
    double finalProductPrice = 00.00;
    double productPrice = 00.00;
    String listProducts = "";
    public void product(Scanner scanner) {
        while (productPrice <= 0 ) {
            System.out.println("Введите название товара");
            String product = scanner.next();
            listProducts += product + "\n";
            System.out.println("Введите цену товара в формате ХХ,ХХ");
            String chekProductPrice = null;
            double productPrice = 0;
                try {
                    chekProductPrice = scanner.nextLine();
                    productPrice = Integer.parseInt(chekProductPrice);
                }
                catch (Exception error) {
                    System.out.println("Введена неверная цена, цена должна быть больше 0.00");
                }

            System.out.println("Хотите продолжить ввод товаров или введите завершить");
            finalProductPrice = finalProductPrice + productPrice;
            String complete = scanner.next();
            if (complete.equalsIgnoreCase("Завершить")) {
                System.out.println("Добавление товаров завершено, произведен расчет:");
                break;
            }
        }
    }
}

