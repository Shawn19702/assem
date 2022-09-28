package Assesment;

import java.util.ArrayList;
import java.util.Collections;

public class ShoppingApp {

    public static double calcTotal(Clothing[] Manger) {
        double sum = 0;
        for (Clothing manger : Manger) {
            sum += manger.getPrice();

        }
        System.out.println(sum + "\n");
        return sum;
    }


    public static boolean isAFit(Customer customer, Clothing clothing) {
        boolean fit;
        if (customer.getSize() == clothing.getSize()) {
            fit = true;
        } else {
            fit = false;
        }
        System.out.println(fit + "\n");
        return fit;
    }
    public static void sortAndPrintClothingByPrice(ArrayList<Clothing> clothes) {
        Collections.sort(clothes, new SortingComparator());
        for (Clothing i: clothes) {
            System.out.println(i);
        }
    }

    public static void printEmployeeName(Employee employee) {
        System.out.println(employee.getName() + "\n");

    }

    public static void printDiscAmtOff(Discountable[] discountables, Clothing clothing) {
        for (Discountable i: discountables) {
            System.out.println("\n" + i.calcDiscount(clothing));


    }
}
}

//    public static void sortAndPrintClothingByPrice(ArrayList<Clothing> clothes) {
//        Collections.sort(clothes)
//        couldn't figure out

//    }
//}









