package com.learnJava.JavaCrashCourse.collectionInJava;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

    public void linkedListEx(){
//      Create a simple linked list
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
//      simple adding value to the linked list
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(2);

        System.out.println("LinkedList:"+ linkedList);

//      Adding an element to the First position
        linkedList.addFirst(1);
        System.out.println("Adding an element to the First position:"+linkedList);

//      Adding an element to the Last position
        linkedList.addLast(6);
        System.out.println("Adding an element to the Last position:"+linkedList);

        /*Note:
        LinkedList performs the worst if the operation is retrieval of data.
        Hence if our requirement is to fetch data, then we should use ArrayList.
        But Linked list is the best choice for if we have a requirement to add and remove a data frequently.
        In this case we should avoid ArrayList
        */

//      Get the First value from the list
        System.out.println("Get the First value from the list:"+linkedList.getFirst());

//      Get the Second value using index position from the list
        System.out.println("Get the Second value using index position from the list:"+linkedList.get(1));

        /*
        Now get the third value of the list.
        Since LinkedList has the data structure of doubly Linked List, the value of third index is
            known only to the link present in the second index. Internally, ther program will traverse to
            index number 2 and then only it can retrieve the value of index 3. so Linked list is not suitable for
            search operations.
        */
        System.out.println("Get the Second value using index position from the list:"+linkedList.get(3));

        /* update the values using set().
        Integer newFirst = linkedList.get(0);
        linkedList.set(0, newFirst);
        System.out.println("After 0th position updated: "+linkedList);
              */

//      Remove first and Remove Last
        System.out.println("Remove first :"+linkedList.removeFirst());
        System.out.println(linkedList);
        System.out.println("Remove Last :"+linkedList.removeLast());
        System.out.println(linkedList);

//      Poll Method: Poll() and PollFirst() deletes the first element in the list
        linkedList.poll();
        System.out.println("Poll and PollFirst:"+ linkedList);

//      Poll Last deletes the last element in the list
        linkedList.pollLast();
        System.out.println("Poll last:"+ linkedList);

//      remove deletes the first element in the list
        System.out.println("Remove First: "+ linkedList.removeFirst());
        System.out.println(linkedList);

//      remove deletes the first element in the list
        System.out.println("Remove : "+ linkedList.remove());
        System.out.println(linkedList);

//      remove First occurrence
        linkedList.removeFirstOccurrence(3);
        System.out.println("remove First occurrence: "+linkedList);

//      remove Last occurrence
        linkedList.removeLastOccurrence(5);
        System.out.println("remove Last occurrence: "+linkedList);

//      Iterator in Linked List
//      Create a simple linked list
        LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
//      simple adding value to the linked list
        linkedList1.add(2);
        linkedList1.add(3);
        linkedList1.add(4);
        linkedList1.add(5);
        linkedList1.add(2);

        System.out.println("LinkedList:"+ linkedList);

//      Normal For Loop
        for (int i=0;i<linkedList1.size();i++){
            System.out.println("Normal for loop for Linked List: "+linkedList1.get(i));
        }

//      Advance For Loop
        for (Integer value: linkedList1) {
            System.out.println("Advance for loop for Linked List: "+linkedList1);
        }

//      Iterator in Linked List
        Iterator<Integer> iteratorEX = linkedList1.iterator();
        while(iteratorEX.hasNext()){
            System.out.println("Iterator in Linked List:"+ iteratorEX.next());
        }

//      List Iterator
        ListIterator<Integer> listIteratorEx = linkedList1.listIterator();
//      Forward Iteration
        while(listIteratorEx.hasNext()){
            System.out.println("Forward listIteratorEx in Linked List:"+ listIteratorEx.next());
        }

//      Reverse iteration
        while(listIteratorEx.hasPrevious()){
            System.out.println("Reverse listIteratorEx in Linked List:"+ listIteratorEx.previous());
        }
    }

    public static void main(String [] args){
        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.linkedListEx();
    }
}
