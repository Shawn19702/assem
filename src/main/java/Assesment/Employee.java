package Assesment;

public abstract class Employee extends Customer{

    public Employee(String name, char size) {
        super(name, size);

    }

    public double getDiscount() {
        return .15;
    }

    public abstract void printEmpPriceAfterDisc(Clothing clothing);

}
