package takeout;
import java.util.Scanner;
public class Takeout {

    public static void displayMainMenu()
    {
        System.out.println("Choose a type of meal: ");
        System.out.println("1. Italian");
        System.out.println("2. Chinese");
        System.out.println("3. American");
    }

    public static void displayItalianFoodMenu()
    {
        System.out.println("Choose one from the menu: ");
        System.out.println("1. Lasagna Tray - Feeds 5 - 17.99");
        System.out.println("2. Pizza Pack - Feeds 7 - 15.99");
        System.out.println("3.Gazpacho Soup, salad and bread sticks pack - Feeds 4 - 12.99");
    }

    public static void displayChineseFoodMenu()
    {
        System.out.println("Choose one from the menu: ");
        System.out.println("1.Chicken and Broccoli Tray (includes7 wonton soups,7 egg rolls)- feeds 7 - 18.99");
        System.out.println("2. Sweet and Sour Pork Tray (includes 7 hot and sour soups,7 egg rolls)- feeds 7- 18.99");
        System.out.println("3. Shrimp Fried Rice Tray (includes 10 egg rolls) - Feeds 5- 10.99");
    }

    public static void displayAmericanFoodMenu()
    {
        System.out.println("Choose one from the menu: ");
        System.out.println("1.Hamburger and Hot Dog Tray - includes buns and condiments- feeds 8- 21.99");
        System.out.println("2.Grilled Chicken Sandwich and Mozzarella Sticks Tray- includes dipping sauces -Feeds 5-22.99");
        System.out.println("3.Barbeque Tray - includes buns and peach cobbler - Feeds 10- 26.99");
    }

    public static int determineTrays(int people, int feed)
    {
        int number_of_trays= people/feed;
        int remainder=people%feed;
        if(remainder==0) {
            return number_of_trays;
        }
        else{
            return number_of_trays+1;
        }
    }

    public static double getSubtotal(double price, int trays)
    {
        double subtotal= price*trays;
        return subtotal;
    }

    public static double getTax(double subtotal, double taxrate) {

        double tax= subtotal*taxrate;
        return tax;

    }

    public static double getTip(double subtotal, double tipRate) {

        double tip= tipRate*subtotal;
        return tip;

    }

    public static double getGrandTotal(double subtotal, double tax, double tip) {

        double total= subtotal+tax+tip;
        return total;

    }

    public static double pricePerPerson(double grandTotal, int people) {

        double per_person= grandTotal/people;
        return per_person;

    }

    public static int determineLeftOvers(int feeds, int trays, int people) {

        int leftover= feeds*trays-people;
        return leftover;
    }

    public static void main(String[] args) {

        int number_of_guests;
        int food_type;
        int feeds=0;
        double price=0;
        int number_of_trays=0;
        double tip=0;
        double tip_rate=0.15;
        double tax=0;
        double subtotal=0;
        double tax_rate=0.07;
        double net_total=0;
        double price_per=0;
        int left_overs=0;

        Scanner input = new Scanner(System.in);

        while (true){

            System.out.println("Enter the number of guests for takeout: ");
            number_of_guests = input.nextInt();

            if (number_of_guests >= 10) {

                Takeout.displayMainMenu();
                food_type=input.nextInt();

                switch(food_type){

                    case 1:
                        Takeout.displayItalianFoodMenu();
                        System.out.println("Enter a number for meal: ");
                        food_type=input.nextInt();
                        if(food_type==1){
                            feeds=5;
                            price=17.99;
                        }
                        else if(food_type==2){
                            feeds=7;
                            price=15.99;
                        }
                        else if(food_type==3){
                            feeds=4;
                            price=12.99;
                        }
                        else{

                        }
                        break;
                    case 2:
                        Takeout.displayChineseFoodMenu();
                        System.out.println("Enter a number for meal: ");
                        food_type=input.nextInt();
                        if(food_type==1){
                            feeds=7;
                            price=18.99;
                        }
                        else if(food_type==2){
                            feeds=7;
                            price=18.99;
                        }
                        else if(food_type==3){
                            feeds=5;
                            price=10.99;
                        }
                        else{

                        }
                        break;
                    case 3:
                        Takeout.displayAmericanFoodMenu();
                        System.out.println("Enter a number for meal: ");
                        food_type=input.nextInt();
                        if(food_type==1){
                            feeds=8;
                            price=21.99;
                        }
                        else if(food_type==5){
                            feeds=7;
                            price=22.99;
                        }
                        else if(food_type==3){
                            feeds=10;
                            price=26.99;
                        }
                        else{

                        }
                        break;
                    default:
                        System.out.println("Enter valid number.");

                }

                number_of_trays=Takeout.determineTrays(number_of_guests, feeds);

                subtotal=Takeout.getSubtotal(price, number_of_trays);

                tax=Takeout.getTax(subtotal,tax_rate);

                tip=Takeout.getTip(subtotal, tip_rate);

                net_total= getGrandTotal(subtotal, tax, tip);

                price_per= pricePerPerson(net_total, number_of_guests);

                left_overs=determineLeftOvers(feeds, number_of_trays, number_of_guests);

                System.out.println("You need "+number_of_trays+" trays");
                System.out.println("Feeds: "+feeds);
                System.out.println("Price for "+number_of_guests+" people ("+number_of_trays+"): "+subtotal);
                System.out.format("Tax: %.2f\n", tax);
                System.out.format("Tip: %.2f\n", tip);
                System.out.format("Total(Food, tax, tip): %.2f\n", net_total);
                System.out.format("Price per person: %.2f\n", price_per);
                System.out.println("leftover for delivery person: "+left_overs);



            } else {
                System.out.println("Minimum of 10 guests");
            }
        }
    }
}