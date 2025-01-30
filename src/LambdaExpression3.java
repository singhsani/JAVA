package TestProgram;

import java.util.*;
/*
Method	Usage	Returns	Key Notes
== (Primitive)	Compare primitive int values	true if equal, false otherwise	Works for primitive types only.
== (Wrapper Objects)	Compare references of Integer objects	true if references are same, false otherwise	Compares object references, not values.
.equals()	Compare Integer values	true if values are equal, false otherwise	Works for Integer objects to compare values.
Integer.compare()	Compare primitive int values	0, positive, or negative depending on the comparison	Useful for sorting or custom comparison logic.
compareTo()	Compare Integer values	0, positive, or negative depending on the comparison	Similar to Integer.compare() but used on an Integer instance.
 */
class Product{
    int prise=0;
    String name;
    int id;
    public Product(int prise,String name,int id){
        this.id=id;
        this.name=name;
        this.prise=prise;
    }
}

public class LambdaExpression3 {
    public static void main(String[] args) {
        List<Product> list=new ArrayList<>();
        list.add(new Product(1500,"Dell",1001));
        list.add(new Product(15003,"HP",999));
        list.add(new Product(1503,"lenvo",1003));
        list.add(new Product(1550,"Dell 12",1002));
        list.add(new Product(1550,"Apple",5));

        Collections.sort(list,(p1,p2)->{
            return Integer.compare(p1.id,p2.id);
        });
        for(Product p:list){
            System.out.println(p.id+" "+p.prise+" "+p.name);
        }
    }
}
