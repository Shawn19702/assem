package Assesment;

public class Manager extends Employee implements Discountable{

    private final double managerDiscount = .25;

    public Manager(String name, char size) {
        super(name, size);
    }


    public double getManagerDiscount() {
        return managerDiscount;
    }




    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {
        System.out.println(clothing.getPrice() - clothing.getPrice() * getManagerDiscount() + "\n");

    }

    @Override
    public double calcDiscount(Clothing clothing) {
        return (clothing.getPrice() * getManagerDiscount());
    }
}




