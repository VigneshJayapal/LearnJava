package com.learnJava.JavaCrashCourse.collectionInJava;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExamples{

    /**
     * TreeSet is the implementation class of SortedSet Interface.
     * Does not allow duplicates.
     * Sorts the elements
     * It has 6 methods like first,last,headSet,tailSet,subSet and comparator.
     * Difference between Hashset and Treeset, hash doesnt maintain order
     * but Treeset maintains ascending or alphabetical order.
     * DS-> Balanced Tree
     * Heterogeneous data not allowed. If added Exception, ClassCast will occur
     * For default natural sorting order,the objects should be homogeneous and comparable else class cast exception
     * To say any class is comporable or not, the class should implement comparable interface.
     */
    /*
     * Constructors present are 4
     * 1. TreeSet ts= new TreeSet();// default sort order
     * 2. TreeSet ts= new TreeSet(Comparator c);// customized sorting order defined by comparator object
     * 3. TreeSet ts= new TreeSet(Collection c);// equivalent tree set of any collection will be created
     * 4. TreeSet ts= new TreeSet(SortedSet s);// creates tree set for given sorted set
     */

   public void TreeSetExamples() {
       TreeSet<Integer> treeSet = new TreeSet<Integer>();
       treeSet.add(10);
       treeSet.add(1);
       treeSet.add(3);
       treeSet.add(5);
       treeSet.add(7);
       treeSet.add(9);
       treeSet.add(10);

        System.out.println("TreeSet values showing in ascending order: "+treeSet);

//      First
        System.out.println("First Element: "+treeSet.first());
//      Last
       System.out.println("Last Element: "+treeSet.last());
//     Headset
        System.out.println("Values are lesser than the given value:"+ treeSet.headSet(5));
//     Tailset
       System.out.println("Values are equal to and higher than the given value:"+ treeSet.tailSet(5));
//     Subset
       System.out.println("Values are between the given value and its from element, if that exist in the set:"+ treeSet.subSet(3, 9));
//     Comparator
        System.out.println("Comparator returns null if the sorting is default sorting order:"+ treeSet.comparator());
//      Adding null to a non empty tree set causes null pointer excpetion
       //treeSet.add(null);
       /*null can be easily added if the tree set is empty. If there are any elements present, the
        * comparator will check for the sorting order between the previosly added element and
        * the null. Since it compares null with the objects exisiting we are getting NPE.
        * Same is the case, if we add null first and add other elements, NPE will happen.
        */

//     Higher method
      System.out.println("Higher Value: "+ treeSet.higher(5));
//     Lower method
      System.out.println("Lower Value: "+ treeSet.lower(5));
//    Poll first
      System.out.println("Poll First: "+treeSet.pollFirst());
//    Poll last
       System.out.println("Poll Last: "+treeSet.pollLast());
//    After polling
       System.out.println("After Polling set: "+ treeSet);
//    Descending Order Set
       System.out.println("Descending Order Set: "+ treeSet.descendingSet());

//     Iterating the iterator
//     Ascending Iterator
     Iterator<Integer> iterator =  treeSet.iterator();
     while(iterator.hasNext()){
         System.out.println("Ascending Iterator value is :"+iterator.next());
     }

//    Descending Iterator
      Iterator<Integer> iterator1 = treeSet.descendingIterator();
     while(iterator1.hasNext()){
         System.out.println("Descending Iterator value is: "+ iterator1.next());
     }

//   Most of the wrapper class implements comparable class
//   String Buffer concept
       TreeSet<StringBuffer> treesetBuffer = new TreeSet<StringBuffer>();
       treesetBuffer.add(new StringBuffer("dummmy"));
       treesetBuffer.add(new StringBuffer("dummmy1"));
       System.out.println(treesetBuffer);

   }

   public static void main(String [] args){
       TreeSetExamples treeSetExamples = new TreeSetExamples();
       treeSetExamples.TreeSetExamples();
   }

}
