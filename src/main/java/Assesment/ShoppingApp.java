package Assesment;

import java.util.ArrayList;
import java.util.Collections;

public class ShoppingApp {

    public static double calcTotal(Clothing[] Manger) {
        double sum = 0;
        for (int i = 0; i < Manger.length; i++) {
            sum += Manger[i].getPrice();

        }
        return sum;
    }

    public static boolean isAFit(Customer customer, Clothing clothing) {
        boolean fit;
        if (customer.getSize() == clothing.getSize()) {
            fit = true;
        } else {
            fit = false;
        }
        return fit;
    }

    public static void printEmployeeName(Employee employee) {
        System.out.println(employee.getName());

    }

    public static void printDiscAmtOff(Discountable[] discount, Clothing [] clothing) {
        for (int x =0; x < discount.length; x++) {
            System.out.println(clothing[x].getPrice());


    }
}
}

//    public static void sortAndPrintClothingByPrice(ArrayList<Clothing> clothes) {
//        Collections.sort(clothes)
//        couldn't figure out

//    }
//}









