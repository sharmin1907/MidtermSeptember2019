package datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */

        //ArrayList arrayList=new ArrayList();
        String[] name = {"Ron", "Don", "Fox", "Kim"};
        // List al= Arrays.asList(name);
        //create new arrayList and pass Arrays.asList
        List al = new ArrayList(Arrays.asList(name));
        System.out.println(al);
        al.add("Mimi");
        al.add("Jin");
        System.out.println(al);
        //Create linkedList
        LinkedList link = new LinkedList(Arrays.asList(name));
        for (int i = 0; i < link.size(); i++) {
            System.out.println(link.get(i));
        }
        //peek
        System.out.println(link.peek());

        //remove
        al.remove(2);
        System.out.println(al);



        //add
        /*arrayList.add(name.;
        arrayList.add("Don");
        arrayList.add("Fox");
        arrayList.add("Kim");

        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        System.out.println("*********************");

        //remove
        arrayList.remove(2);
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }*/


    }

}

