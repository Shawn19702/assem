package Assesment;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Clothing pants = new Clothing("Jeans", 20.00, 'S');

        Clothing shirt = new Clothing("Polo shirt", 10.00, 'L');

        Clothing belt = new Clothing("Gucci belt", 200.00, 'L');

        Clothing[] MangerCart = {pants, shirt, belt};

        Manager manger = new Manager("Shawn", 's');

        System.out.println("Getting total of manager cart \n");


        ShoppingApp.calcTotal(MangerCart);

        Clothing[] EmployeeCart = {pants, shirt, belt};

        Clothing clothing1 = new Clothing("Nike shirt", 15.00, 'L');

        Customer customer = new Customer("john", 's') {
            @Override
            public void setSize(char size) {
                super.setSize(size);
            }
        };

        System.out.println("Seeing if clothing fits \n");


        ShoppingApp.isAFit(customer, clothing1);

        Clothing shirt1 = new Clothing("T-shirt", 10.00, 'L');

        Clothing belt1 = new Clothing(" belt", 20.0, 'L');

        HourlyEmployee hourlyEmployee = new HourlyEmployee("jim", 'm');

        System.out.println("Printing price after discount for employee and manager \n");

        System.out.println("Shirts: \n");


        hourlyEmployee.printEmpPriceAfterDisc(shirt1);

        manger.printEmpPriceAfterDisc(shirt1);

        System.out.println("Belts: \n");


        hourlyEmployee.printEmpPriceAfterDisc(belt1);

        manger.printEmpPriceAfterDisc( belt1 );


        ArrayList<Clothing> Clothes = new ArrayList<>();
        Clothes.add(belt);
        Clothes.add(shirt);
        Clothes.add(pants);

        System.out.println("Printing array list" + "\n" );


        for (int i = 0; i < Clothes.size(); i++) {
            System.out.println(Clothes.get(i) + "\n");

        }

        System.out.println("Printing employee names \n");

        ShoppingApp.printEmployeeName(manger);
        ShoppingApp.printEmployeeName(hourlyEmployee);

        Clothing jeans = new Clothing("Jeans", 20.00, 'm');


        Discountable[] discountables = {hourlyEmployee, manger};

        System.out.println("Getting manager and employee discount prices \n");



        ShoppingApp.printDiscAmtOff(discountables, jeans);

        System.out.println("\n");



        System.out.println("Sorting clothing by price \n");



        ShoppingApp.sortAndPrintClothingByPrice(Clothes);


    }
}










