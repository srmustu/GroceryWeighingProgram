import java.util.Scanner;
public class GroceryWeighingProgram {
    public static void main(String[] args) {
        /* bu program
        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
         */

        Scanner input = new Scanner(System.in);

        double pearPrice,applePrice,tomatoPrice,bananaPrice,auberginePrice;
        double pearGrammage,appleGrammage,tomatoGrammage,bananaGrammage,aubergineGrammage;
        double pearCalculator,appleCalculator,tomatoCalculator,bananaCalculator,aubergineCalculator,total;

        String message1,message2,message3,message4,message5,message6,message7,message8;

        pearPrice = 2.14;
        applePrice = 3.67;
        tomatoPrice = 1.11;
        bananaPrice = 0.95;
        auberginePrice = 5.00;


        message1 = "Welcome to the automatic cash register ";
        message2 = "Please enter the weight of the product you purchased in grams";
        message3 = "Weight of pear : ";
        message4 = "Weight of apple : ";
        message5 = "Weight of tomato : ";
        message6 = "Weight of banana : ";
        message7 = "Weight of aubergine : ";
        message8 = "Total price : ";

        System.out.println(message1 + "\n" + message2 );
        System.out.print(message3);
        pearGrammage = input.nextDouble();
        System.out.print(message4);
        appleGrammage = input.nextDouble();
        System.out.print(message5);
        tomatoGrammage = input.nextDouble();
        System.out.print(message6);
        bananaGrammage = input.nextDouble();
        System.out.print(message7);
        aubergineGrammage = input.nextDouble();

        pearCalculator = (pearPrice/1000) * pearGrammage;
        appleCalculator = (applePrice/1000) * appleGrammage;
        tomatoCalculator = (tomatoPrice/1000) * tomatoGrammage;
        bananaCalculator = (bananaPrice/1000) * bananaGrammage;
        aubergineCalculator = (auberginePrice/1000) * aubergineGrammage;

        total = pearCalculator + appleCalculator + tomatoCalculator + bananaCalculator + aubergineCalculator;

        System.out.println(message8 + total);


    }
}
