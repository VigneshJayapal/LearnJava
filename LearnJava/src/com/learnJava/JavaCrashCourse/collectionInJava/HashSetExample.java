package com.learnJava.JavaCrashCourse.collectionInJava;


import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    /**
     * 	Set(I)-> HashSet (C) and LinkedHashSet(C) are implementations
     *  Set(I) -> SortedSet(Child Interface)->NavigableSet(I)=> TreeSet(C) is the implementation
     *Important points to remember:
     *1. To store group of individual objects.
     *2. Duplicates not allowed
     *3.Insertion order will not be maintained
     *4.Set(I) doesn't have any new methods other than given in Collection(I).
     *5. DS for HashSet is Hash table
     *6. If we add duplicate value to HashSet, simply it will return false to the
     *add() and it won't throw any error or exception.
     *7. We can insert null values
     *8. Heterogeneous values can be added.
     *9. Implements Serializable and Cloneable?-> Yes
     *10. Data are stored based on hashcode, so search is very effective.
     *11. Fill Ratio or Load factor:0.75 or 75%
     *12.Default capacity-16
     */

    /*
     * Number Constructors available in HashSet=4
     * 1. HashSet hs= new HashSet();// size-16 and fill ratio is 0.75
     * 2. HashSet hs= new HashSet(int initialSize);size as declared and fill ratio is 0.75(default)
     * 3. HashSet hs= new HashSet(int initialSize, float fillRatio);//size and fill ratio can be declared
     * 4. HashSet hs= new HashSet(Collection c);// creates a HashSet for any given Collection (Acts as interconversion)
     */

    public void hashSetExamples(){
        HashSet<String> hashSet = new HashSet<String>();
//      Normal adding value to the Set
        hashSet.add("PRANAV");
        hashSet.add("VARU");
        hashSet.add("VIKKY");
        hashSet.add(null);
        hashSet.add("VARU");  //this duplicate value will not be added in set value
                              // the return type of add() is boolean. Since "VARU" is already there it will return false and won't add

//      We have no control on maintaining the insertion order, bcoz it stored the data in the form of hashcode value.
//      This make the hashset to perform very efficient on Search operations
        System.out.println("Hashset value: "+hashSet);

//      Removing the value from the set
        hashSet.remove(null);
        System.out.println("Hashset value: "+hashSet);

//      contains method: checks whether the provide object exist in hashset
        System.out.println(hashSet.contains("VIKKY"));
        System.out.println(hashSet.contains("AAA"));

//      Copying one collection to another collection using hashset
        HashSet<String> hashSet1 = new HashSet<String>();
        hashSet1.addAll(hashSet);
        System.out.println("Copying from another Hashset: "+hashSet1);

//      Clearing the set values
        hashSet1.clear();

//      To check whether set is empty or not
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet1.isEmpty());

//      To know the size of the Set value
        System.out.println(hashSet.size());

    /* Iterate using Iterator in Set
     */
        HashSet<Integer> hashSet2 = new HashSet<Integer>();
        hashSet2.add(1);
        hashSet2.add(2);
        hashSet2.add(3);
        hashSet2.add(4);
        hashSet2.add(1);// the return type of add() is boolean. Since 1 is already there it will return false and won't add

        Iterator<Integer> iteratorEx = hashSet2.iterator();
        while(iteratorEx.hasNext()){
            System.out.println("Hashset using Iterator: "+ iteratorEx.next());
        }

    }

    public static void main(String [] args){
        HashSetExample hashSetExample = new HashSetExample();
        hashSetExample.hashSetExamples();
    }
}
