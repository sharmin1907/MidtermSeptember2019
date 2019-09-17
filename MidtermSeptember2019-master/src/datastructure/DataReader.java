package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class DataReader {
    public String readMyTextFile(String filePath)  {
        String container;
        String text = null;
        //try {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((container = bufferedReader.readLine()) != null) {
                text = container;
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }


        return text;

    }

    public static void main(String[] args) {
        /*
         * User API to read the below textFile and print to console.
         * Use BufferedReader class.
         * Use try....catch block to handle Exception.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
         * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
         * order from LinkedList and retrieve as FILO order from Stack.
         *
         * Demonstrate how to use Stack that includes push,peek,search,pop elements.
         * Use For Each loop/while loop/Iterator to retrieve data.
         */
        String read = null;
        DataReader dataReader = new DataReader();
        String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
        System.out.println("Read my text: " + read);

        System.out.println("LinkedList store");
        //LinkedList linkedList = new LinkedList();
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Read");
        linkedList.add("the");
        linkedList.add("file");
        linkedList.add("for");
        linkedList.add("surprise");
        linkedList.add("quiz");
        /*for(int i=0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i));
        }*/

        //for each loop
        System.out.println("for each loop");
        for (String s : linkedList) {
            System.out.println(s);
        }

        //for while loop
        System.out.println("for while loop");
        int i = 0;
        while (linkedList.size() > i) {
            System.out.println(linkedList.get(i));
            i++;
        }

        //for Iterator
        System.out.println("for iterator loop");
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        //ArrayList
        System.out.println("ArrayList store");

        //ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Read");
        arrayList.add("the");
        arrayList.add("file");
        arrayList.add("for");
        arrayList.add("surprise");
        arrayList.add("quiz");

        //for each loop-Array
        System.out.println("for each loop");
        for (String s : arrayList) {
            System.out.println(s);
        }

        //for while loop-Array
        System.out.println("for while loop");
        int num = 0;
        while (arrayList.size() > num) {
            System.out.println(arrayList.get(num));
            num++;
        }

        //for Iterator-Array
        System.out.println("for iterator loop");
        Iterator text = arrayList.iterator();
        while (text.hasNext()) {
            System.out.println(text.next());
        }

    }

    }

