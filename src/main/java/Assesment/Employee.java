package Assesment;

public abstract class Employee extends Customer implements Discountable{

    private final double discount  = .1;

    public double getDiscount() {
        return discount;
    }

    public Employee(String name, char size) {
        super(name, size);

    }



    public abstract void printEmpPriceAfterDisc(Clothing clothing);

}


