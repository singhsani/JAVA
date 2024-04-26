/**
 * Abstraction
 * Encapculation
 * Inheritance
 * PolyMorphism
 */
abstract class Abstraction{
    int paymentPerHours=0;
    String name;
    public Abstraction(int paymentPerHours, String name) {
        this.paymentPerHours = paymentPerHours;
        this.name = name;
    }

    public int getPaymentPerHours() {
        return paymentPerHours;
    }

    public String getName() {
        return name;
    }

    public void setPaymentPerHours(int paymentPerHours) {
        this.paymentPerHours = paymentPerHours;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public int calculateSalary();
}
class Test extends Abstraction{
    String lastName;
    public  Test(int paymentPerHours,String name,String lastName){
        super(paymentPerHours,name);
        this.lastName=lastName;
    }
    @Override
    public int calculateSalary(){
        return paymentPerHours*5;
    }
}

class Person{
    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    Person(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int areaOfRectangle(){
        return x*y;
    }
}
interface Payment{
    public void pay();
}
class Cash implements Payment{
    @Override
    public void pay(){
        System.out.println("Cash payment");
    }
}
class Checque implements Payment{
    @Override
    public void pay(){
        System.out.println("Cheque Payment");
    }
}

public class OPPSCONCEPT {
    public static void main(String[] args) {
        Test test=new Test(8,"Ram","Singh");
        System.out.println(test.calculateSalary());
        Person p=new Person(5,6);
        System.out.println(p.areaOfRectangle());
        Cash cash=new Cash();
        cash.pay();
        Checque checque=new Checque();
        checque.pay();

    }
}
