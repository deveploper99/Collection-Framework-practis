package org.rtxrassel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        ArrayList<String> product = new ArrayList<>();
        product.add("Monitor");
        product.add("Mouse");
        product.add("KeyBoad");
        product.add("Pc");
        product.add("Laptop");


        Iterator<String> it = product.iterator();
        while (it.hasNext()){
            String s = it.next();
            if (s.equals("Laptop")){
                it.remove();
            }



        }

        System.out.println("============================");

        for(String finalProduct: product){
            System.out.println("Final Product Name: "+finalProduct);
        }


        ListIterator<String> listIterator = product.listIterator();
        while (listIterator.hasNext()){
            int indexofMouse = listIterator.nextIndex();
            String name = listIterator.next();

            if (name.contains("Mouse")){
                System.out.println("Index of Mouse: "+indexofMouse);
            }

            if (name.equals("KeyBoad")){
                listIterator.set("Mecanical Keyboard");
            }

        }

        for(String f: product){
            System.out.println("Final Product Name: "+f);
        }


        System.out.println("\n\n=====================");
        while (listIterator.hasPrevious()){
            String preview1 = listIterator.previous();
            System.out.println("previeous value: "+preview1);
        }
    }
}
