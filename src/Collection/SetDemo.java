package Collection;

import java.util.*;

/**
 * Set
 * if we want group of individual objects where  insertion order not preserved and duplicate are not allowed then we should go for set
 * set does not contain any new method we have to only collection interface methods
 * -> hashset
 * -> LinkedHashSet
 *
 * -> sortedHashSet
 * -> navigableSet
 * ->TreeSet
 *
 */
class Student{
    String name="He";
    int id=5;
    Student(String name,int id){
        this.name=name;
        this.id=id;
    }
}
class TreeSetDemo<E> {
    private transient NavigableMap<E, Object> m;
    private static final Object P = new Object();
    public TreeSetDemo(){
        this(new TreeMap<>());
        }
    public TreeSetDemo(NavigableMap<E,Object> m) {
       this.m=m;
    }
    public boolean add(E a){
        return m.put(a,P)==null;
    }
}

/**
 * @param <E>
 *     hashset indirectly implement to hashMap
 *     when create HashSet object indirectly reference to hashMap
 */
class HashSetDemo<E>{
    private transient HashMap<E,Object> map;
    private static final Object PRESENT=new Object();
    public HashSetDemo(){
        map=new HashMap();
    }
    public boolean add(E e){
        return map.put(e,PRESENT)==null;
    }
    public Iterator<E> iterator(){return map.keySet().iterator();}
}
public class SetDemo {
    public static void main(String[] args) {
        /**
         * HashSet
         * insertion order not preserved
         * duplicate objects are not allowed
         * null insertion are possible
         * implements serializable ,clonable but randomAccess not allowed
         * initial capacity 16
         * default fill ratio .75
         * new HashSet(13,.09)
         */
        HashSet h=new HashSet<>();
        h.add("a");
        h.add("b");
        h.add("c");
        h.add("d");
        h.add("e");
        System.out.println(h.toString());
        HashSetDemo hd=new HashSetDemo<>();
        hd.add(4);
        hd.add(6);
        hd.add(4);
        Iterator its=hd.iterator();
        while(its.hasNext()){
            System.out.println(its.next());
        }
        System.out.println(hd.toString());
        /**
         * LinkedHashSet
         * combination of  LinkedHashSet => LinkedList + Hashtable
         * insertion order preserved
         */
        LinkedHashSet linkedHashSet=new LinkedHashSet();
        linkedHashSet.add("1");
        linkedHashSet.add("3");
        linkedHashSet.add("4");
        linkedHashSet.add("5");
        System.out.println(linkedHashSet.toString());

        /**
         * SortedSet
         * if we want to group of unique objects in sorted manner then  we should go with sorted set
         *
         */

        /**
         * Tree Set
         * it is child of set interface
         * duplicate objects are not allowed
         * null is allowed only one time
         * hectrogenous objects are not allowed
         */
        TreeSet t=new TreeSet();
        t.add(2);
        t.add(3);
        t.add(1);
        //t.add(new Student("Hello",4));
        Iterator itr=t.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        TreeSetDemo td=new TreeSetDemo();
        td.add(9);
        td.add(10);
        td.add(12);


    }

}
