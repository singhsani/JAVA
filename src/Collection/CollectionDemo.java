package Collection;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        /**
         * Arraylist order preserved
         * duplicate are allowed
         * insertion and deletion in middle  not best choice Array
         * Growable in nature
         * hectrogenous is allowed
         * arrayList implements RandomAccess
         * initial capcity 10 if capacity increase then newCapacity=(capacity*3/2)+1
         */
        List<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(3);
        l.add(5);
        l.add(2);
        System.out.println(l.toString());
        /**
         * Linkedlist insertion order preserved
         * insertion and delection in middle then linkedList is best choice
         * growable in nature
         * if our frequent operation is retrival then linkedList is worst choice
         * null insertion are possible
         * duplicate are allowed
         * implement serializable and clonable but not randomAccess
         */

        List<Integer> ll=new LinkedList<>();
        ll.add(1);
        ll.add(4);
        ll.add(5);
        ll.add(9);
        ll.add(3);
        System.out.println(ll.toString());
        /**
         * insertion order preserved
         * duplicate are allowed
         * Vector implements RandomAccess,serilaziable and cloneable interface
         * every method in vector synchronized and thread safe
         * initial capacity 10 increase newCapacity=capacity*2
         */
        Vector<Integer> v=new Vector<>();
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        v.addElement(5);
        System.out.println(v.toString());
        /**
         * when user required first in and last out then we should go to stack
         * it is child of vector
         */
        Stack<Character> st=new Stack<>();
        st.push('a');
        st.push('b');
        st.push('c');
        System.out.println(st.toString());

        /**
         * Cursor
         * if user want to one by one object then we should go for cursor
         * three type of cursor
         * Enumeration
         * iterator
         * ListIterartor
         */
        /**
         * Enumeration
         * we can use Enumeration get one by one object from legacy collection object
         * Enumeration concept alowed only legacy classes it is not a universal cursor
         */
        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            Integer i= (Integer) e.nextElement();
            System.out.println(i);

        }
        /**
         * Iterator
         * we can use iterator when one by one object then we should go for iterator
         * iterator can perform both read and remove operation
         * iterator have three method
         * Object next()
         * boolean hasNext()
         * void remove()
         */
        Iterator itr=l.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        /**
         * ListIterator
         * listIterator can perform backward direction or forward direction opetation
         * it is bi-directional cursor
         * while using listiterator then we can perform add new object and remove object
         * by using listIterator method we can create object
         */
        ListIterator itrs=l.listIterator();
        itrs.add(10);
        System.out.println(l.toString());


    }

}
