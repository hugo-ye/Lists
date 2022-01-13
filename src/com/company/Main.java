package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*LinkedList<String> list1 = new LinkedList<>(Arrays.asList("abc", "xy"));
        LinkedList<String> list2 = new LinkedList<>(Arrays.asList("cde", "rar"));
        LinkedList<String> resultList = merge(list1, list2);
        System.out.println(resultList);

         */
        homework4();
    }

    public static void example2() {
        LinkedList<Integer> list = new LinkedList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                int j = 0; // index of list element
                while (j < list.size() && i >= list.get(j)) {
                    j++;
                }
                list.add(j, i);
            }

        } catch (Exception e) {
            System.out.printf("got exception %s", e);
        }
        System.out.println(list.toString());
    }

    public static LinkedList<String> merge(LinkedList<String> l1, LinkedList<String> l2) {
        LinkedList<String> resultList = new LinkedList<>();

        while (!l1.isEmpty() || !l2.isEmpty()) {
            LinkedList<String> selectedList;

            if (l1.isEmpty()) {
                selectedList = l2;
            } else if (l2.isEmpty()) {
                selectedList = l1;
            } else if (l1.peekFirst().compareTo(l2.peekFirst()) < 0) {
                selectedList = l1;
            } else {
                selectedList = l2;
            }

            resultList.add(selectedList.removeFirst());
        }


        return resultList;
    }

    public static void example4() {
        ArrayList<Double> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("give a set of numbers");
            while (scanner.hasNextDouble()) {
                list.add(scanner.nextDouble());
            }
        } catch (Exception e) {
            System.out.println(e);
            System.exit(-1);
        }
        for (int i = list.size() - 1; i > 0; i--) {
            System.out.printf("%f ", list.get(i));
        }
    }

    public static void example5() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(11);
        list.add(7);
        ListIterator<Integer> it = list.listIterator();
        it.add(20);
        it.next();
        it.remove();
        System.out.println(list);
    }

    public static void example6() {
        LinkedList<String> wordList = new LinkedList<>();
        wordList.add("abc");
        wordList.add("xyzwsk");
        wordList.add("what");

        ListIterator<String> it = wordList.listIterator();
        while (it.hasNext()) {
            if (it.next().length() <= 5) {
                it.set("done");
            }
        }
        System.out.println(wordList);

    }

    public static void homework3() {
        LinkedList<String> list = new LinkedList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                String x = scanner.next();
                if (x.equals("!")) {
                    break;
                } else {
                    list.add(x);
                }
            }
            while (scanner.hasNext()) {
                String x = scanner.next();
                if (x.equals("!")) {
                    break;
                } else {
                    for (String a : list) {
                        if (a.equals(x)) {
                            System.out.println("hit");
                        }
                    }
                }
            }
        }

    }

    public static void homework4() {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            for (int a: list) {
                if (a == x) {
                    list.removeLast();
                    break;
                }

            }
            list.addFirst(x);
        }
        System.out.println(list);
    }

}
class ListJarmo <T>
{
    public ListJarmo (T[] array)
    {
        elements = array;
        maxSize = array.length;
        size = 0;
    }

    public boolean isFull ()
    {
        return size >= maxSize;
    }

    public boolean isEmpty ()
    {
        // code to be written
        return true;
    }

    public void addFirst (T element)
    {
        for (int i = size - 1; i >= 0; i--)
            elements [i + 1] = elements [i];
        elements [0] = element;
        size++;
    }

    public void addLast (T element)
    {
        // code to be written
    }

    public void add (int index, T element)
    {
        // code to be written
    }

    public T removeLast ()
    {
        size--;
        return elements [size];
    }


    // code to be written
    // public T removeFirst ()
    // {
    // }

    public String toString ()
    {
        StringBuffer strBuf = new StringBuffer ();
        for (int i = 0; i < size; i++)
        {
            strBuf.append (elements [i]);
            if (i < size - 1)
                strBuf.append (", ");
        }
        return strBuf.toString ();
    }

    private int maxSize;
    private int size;
    private T[] elements;
}