package Assesment;

public class Manger extends Employee implements Discountable{
    public Manger(String name, char size) {
        super(name, size);
    }

    private final double managerDiscount = .25;

    public double getManagerDiscount() {
        return managerDiscount;
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {
        System.out.println(calcDiscount(clothing));

    }

    @Override
    public double calcDiscount(Clothing clothing) {
        return (clothing.getPrice() * (getManagerDiscount() / 100));

    }
}

