package org.rtxrassel.Linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist {
    static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Rassel Hassan");
        linkedList.add("Siam");
        linkedList.add("bod");
        linkedList.addFirst("Habibur Rahman");
        linkedList.addLast("Karimul Islam");
        linkedList.removeFirst();





        Iterator<String> it = linkedList.iterator();
        while(it.hasNext()){
            String nextItem = it.next();
            if (nextItem.contains("Karimul Islam")){
                it.remove();
            }
        }

        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            int indextofNext = listIterator.nextIndex();
            int indextofprevieus = listIterator.previousIndex();
            String listIteratorItem = listIterator.next();
            if (listIteratorItem.contains("Siam")){
                listIterator.set("Akbal Hosen");
                System.out.println("main index"+indextofNext);
                System.out.println("previeus index"+indextofprevieus);
            }
        }



        //Collections.sort(linkedList);
        //linkedList.sort((a,b)->a.compareTo(b));
        linkedList.sort(String::compareTo);

//        while (listIterator.hasPrevious()){
//            System.out.println(listIterator.previous());
//        }

        for(String s: linkedList){
            System.out.println(s);
        }
    }
}
