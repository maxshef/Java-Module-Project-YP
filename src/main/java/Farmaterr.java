import java.util.Scanner;
public class Farmaterr {
    public String formatRub(int howPeople, double finalProductPrice) {
        //double finalScorePeople = finalProductPrice / howPeople;
        String RUB;
        //String RUB2;
        int endingRubles = (int) finalProductPrice;// % 100 / 10;
        //int endingRubles = (int) finalScorePeople;// % 100 / 10;
        if (endingRubles % 100 >= 11 && endingRubles % 100 <= 14) {
            RUB = "рублей";
        } else
            switch (endingRubles % 10) {
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
        return RUB;
    }
}
       // if (endingRubles2 % 100 >= 11 && endingRubles2 % 100 <= 14) {
       //     RUB2 = "рублей";
        // } else
           // switch (endingRubles2 % 10){
             //   case 1:
               //     RUB2 = "рублю";
                 //   break;
                 //case 2:
                //case 3:
                //case 4:
                //    RUB2 = "рубля";
                //    break;
                //default:
                 //   RUB2 = "рублей";
                 //   break;
            //}
    //}

