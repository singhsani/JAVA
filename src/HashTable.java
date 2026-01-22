import java.util.ArrayList;

public class HashTable {
        // Number of buckets
        private final int bucket;

        // Hash table of size bucket
        private final ArrayList<Integer>[] table;

        public HashTable(int bucket)
        {
            this.bucket = bucket;
            this.table = new ArrayList[bucket];
            for (int i = 0; i < bucket; i++) {
                table[i] = new ArrayList<>();
            }
        }

        // hash function to map values to key
        public int hashFunction(int key)
        {
            return (key % bucket);
        }

        public void insertItem(int key)
        {
            // get the hash index of key
            int index = hashFunction(key);
            // insert key into hash table at that index
            table[index].add(key);
        }

        public void deleteItem(int key)
        {
            // get the hash index of key
            int index = hashFunction(key);

            // Check if key is in hash table
            if (!table[index].contains(key)) {
                return;
            }

            // delete the key from hash table
            table[index].remove(Integer.valueOf(key));
        }
        public  void getValueUsingKey(int key){
            int index=hashFunction(key);
            System.out.println(index);
        }

        // function to display hash table
        public void displayHash()
        {
            for (int i = 0; i < bucket; i++) {
                System.out.print(i);
                for (int x : table[i]) {
                    System.out.print(" --> " + x);
                }
                System.out.println();
            }
        }

        // Drive Program
        public static void main(String[] args)
        {
            // array that contains keys to be mapped
            int[] a = { 15, 11, 27, 8, 12,400 };

            // Create a empty has of BUCKET_SIZE
            HashTable h = new HashTable(7);

            // insert the keys into the hash table
            for (int x : a) {
                h.insertItem(x);
            }

            // delete 12 from the hash table
            h.deleteItem(12);

            // Display the hash table
            h.displayHash();
            h.getValueUsingKey(400);
//            String str=new String("java");
//            String str1=new String("java");
//            System.out.println(str==str1);
//            System.out.println(str.equals(str1));
            String str="Hello";
            str=str.concat("world");
            System.out.println(str);

        }
    }

