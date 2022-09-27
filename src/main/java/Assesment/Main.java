package Assesment;

public class Main {
    public static void main(String[] args) {
        Clothing pants = new Clothing("Jeans", 20.00, 'S');

        Clothing shirt = new Clothing("Polo shirt", 10.00, 'L');

        Clothing belt = new Clothing("Gucci belt", 200.00, 'L');

        Clothing[] MangerCart = {pants, shirt, belt};

        Manger manger = new Manger("Shawn", 'L');

        ShoppingApp.calcTotal(MangerCart);

        Clothing[] EmployeeCart = {pants, shirt, belt};


    }

}






