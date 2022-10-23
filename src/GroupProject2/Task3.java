package GroupProject2;
/*
Create a Class Car that would have the
following fields: carPrice and color and method
calculateSalePrice() which should be returning
a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck
class has a field as weight and has its own
implementation of calculateSalePrice() method
in which returned price is calculated as
following: if weight>2000 then returned price
car should include 10% discount, otherwise 20%
discount.
The Sedan class has field as length and also
does it is own implementation of
calculateSalePrice(): if length of sedan is >20
feet then returned car price should include 5%
discount, otherwise 10% discount
 */
public class Task3 {
    public static void main(String[] args) {

        Sedan sedan= new Sedan(30000,15);
        sedan.calculateSalePrice();

        Truck truck= new Truck(40000,2100);
        truck.calculateSalePrice();

    }
}

class Car{
    double carPrice;
    String color;

        public Car(double carPrice) {
        this.carPrice=carPrice;
    }

    public double calculateSalePrice(){
            return 0;
    }
}

class Truck extends Car{

double weight;
    public Truck(double carPrice, double weight) {
        super(carPrice);
        this.weight=weight;
    }

    @Override
    public double calculateSalePrice() {

        if (weight > 2000) {
        System.out.println(carPrice - (carPrice * 0.1));
      } else {
        System.out.println(carPrice - (carPrice * 0.2));
    }
        return carPrice;
    }
    }

    class Sedan extends Car {

        double length;

        public Sedan(double carPrice, double length) {
            super(carPrice);
            this.length = length;
        }

        @Override
        public double calculateSalePrice() {
            if (length > 20) {
                System.out.println(carPrice - (carPrice * 0.05));
            } else {
                System.out.println(carPrice - (carPrice * 0.1));
            }
            return carPrice;
        }
    }




