package Assesment;

public class HourlyEmployee extends Employee implements Discountable{

    public HourlyEmployee(String name, char size) {
        super(name, size);
    }

    @Override
    public double calcDiscount(Clothing clothing) {
        return (clothing.getPrice() * getDiscount());
    }


    public void printEmpPriceAfterDisc(Clothing clothing) {

        System.out.println(clothing.getPrice() - clothing.getPrice() * getDiscount() + "\n");
        // return Price - Price * discountAmount/100;

    }
}
