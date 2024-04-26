package MapDemo;

import java.util.*;

class Test{
    int i;
    Test(int i){
        this.i=i;
    }
    Test(){}
    public String toString(){
        return "TEMP";
    }
    public void finalize(){
        System.out.println("the finalize() are called");
    }
}
class MyComprator implements Comparator{
    public int compare(Object o1, Object o2) {
        String s=o1.toString();
        String str=o2.toString();
        return s.compareTo(str);
    }
}

/**
 * Map
 *if we want to group of object in key-value pair then we should go for map interface
 * Each key-value pair are called Entry
 * duplicate key are not allowed but  value are allowed
 */
public class MapExample {
    public static void main(String[] args) throws InterruptedException {
        /**
         * HashMap underlying data structure hashtable
         * insertion order not preserved based on hash code of key
         * null are allowed as key only once time
         * duplicate keys are not allowed but value are allowed
         */
        HashMap hashMap=new HashMap();
        hashMap.put("Ram",200);
        hashMap.put("Shyam",300);
        hashMap.put("Mohan",400);
        hashMap.put("Ram",600);
        System.out.println(hashMap);
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.entrySet());
        System.out.println(hashMap.values());
        Set s=hashMap.keySet();
        System.out.println(s);
        Iterator itr=hashMap.entrySet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        /**
         * Linked hash map
         * LinkedHashMap underlying data structure LinkedList + HashTable
         * LinkedList using double link list
         * LinkedHashMap and LinkedHashSet using for cache application
         */
        LinkedHashMap linkedHashMap=new LinkedHashMap();

        /**
         * IdentityHashMap         *
         * IdentityHashMap same as HashMap in case of hashMap JVM using .equal() for check duplicate and IdentityHashMap using "=="
         */
        HashMap hm=new HashMap();
        Integer i=new Integer(4);
        Integer j=new Integer(4);
        hm.put(i,"10");
        hm.put(j,"20");
        System.out.println(hm);
        IdentityHashMap identityHashMap=new IdentityHashMap();
        identityHashMap.put(i,"10");
        identityHashMap.put(j,"20");
        System.out.println(identityHashMap);

        /**
         * WeakHashMap
         * it is exactly same as HashMap except some following difference
         * in the case normal hashMap Objects are not eligible for GC even though it doesn't have any reference
         * but in the case of weakHashMap if object does not have any reference then eligible for GC
         */
        Test t=new Test();
        WeakHashMap weakHashMap=new WeakHashMap();
        weakHashMap.put(t,"Hello");
        weakHashMap.put(t,"Hi");
        System.out.println(weakHashMap);
        t=null;
        System.gc();
        Thread.sleep(2000);
        System.out.println(weakHashMap);

        /**
         * TreeMap
         * TreeMap underlying data structure Red-black Tree
         * duplicate keys not allowed but value are allowed
         * insertion order not preserved all entreis insert according to some sorting order
         * if we are depending default sorting order the key should be homogenous
         * if we are defining our own sorting order defining comparator then keys can be heterogeneous
         */
        //default natural sorting
        TreeMap treeMap=new TreeMap();
        treeMap.put("z",10);
        treeMap.put("a",20);
        treeMap.put("k",30);
        treeMap.put("j",40);
        System.out.println(treeMap);

        /**
         * HashTable
         * hashtable underlying data structure hashtable
         * insertion order not preserved
         * heterogenouse data allowed both key and value
         * null key or null value not allowed
         * initial capcity 11
         */
        Hashtable hashtable=new Hashtable();
        hashtable.put(new Test(1),"A");
        hashtable.put(new Test(15),"B");
        hashtable.put(36,"A");
        System.out.println(hashtable);

    }

}
