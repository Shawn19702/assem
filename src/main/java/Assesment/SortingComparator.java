package Assesment;

import java.util.Comparator;

public class SortingComparator implements Comparator<Clothing> {
    @Override
    public int compare(Clothing clothing1, Clothing clothing2) {
        if (clothing1.getPrice() > clothing2.getPrice()){
            return 1;
        }
        return -1;
    }
}
