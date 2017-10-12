import java.util.Scanner;

//Create a Java console application that allows the user a sales record.
        //Each sales record includes customer number, name, sales amount and a tax cod


public class Salesrecord {
    public static void main(String[] args) {

        int customerid;
        String customername, taxcode,yes;
        double amount, tax = 0.00, total, subtotal;


      Scanner scan = new Scanner(System.in);


        do {

            System.out.println("Enter Customer ID?:"); //Store Customer ID from user input
            customerid = scan.nextInt();
            scan.nextLine();

            System.out.println("Enter Customer Name?:");//Store customer name as string
            customername = scan.next();
            scan.nextLine();


            System.out.println("Enter Sales Amount?:");//Store sales amount as double
            amount = scan.nextDouble();
            scan.nextLine();

            System.out.println("Enter Tax code?: (NRM,NPF,BIZ)");//Store tax code entered by user
            taxcode = scan.next();
            scan.nextLine();

            //Check to see which taxcode was typed and apply total amount due using exception for lowercase
            switch (taxcode.toUpperCase()) {
                case "NRM":
                    tax = 0.06;
                    break;

                case "NPF":
                    tax = 0.00;
                    break;

                case "BIZ":
                    tax = 0.45;
                    break;

            }

            subtotal = amount * tax;//Apply tax from switch
            total = amount + subtotal;

            //Print out

            System.out.println("Customer ID:" + customerid);
            System.out.println("Customer Name:" + customername);
            System.out.println("Sales Amount:" + amount);
            System.out.println("Tax Code:" + taxcode.toUpperCase());
            System.out.println("Total Amount Due: $" + total);

//Prompt user to enter another record if yes then run loop on line 18
            System.out.println("Would you like to enter another Sales Record ? (Yes or No)");//Prompt user for another answer
            yes = scan.nextLine();
        }while (yes.equalsIgnoreCase("Yes"));//If user enters Yes run loop)
    }
}