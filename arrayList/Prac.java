package arrayList;

import java.util.ArrayList;

public class Prac {
    // Write a program to create an ArrayList of integers. Add five numbers to it
    // and print all the elements.

    // defining ArrayList as global variable
    static ArrayList<Integer> numlist = new ArrayList<>();
    static ArrayList<String> nameList = new ArrayList<>();

    public static void nums() {
        numlist.add(1);
        numlist.add(1);
        numlist.add(1);
        numlist.add(2);
        numlist.add(3);
        numlist.add(4);
        numlist.add(5);
        System.out.println(numlist);
    }

    public static void names() {
        // Create an ArrayList of strings. Add several names, then remove a specific
        // name from the numlist.
        nameList.add("A");
        nameList.add("S");
        nameList.add("EPSUM");
        nameList.add("LOREM");
        nameList.add("JOHN");
        nameList.add("DOE");
        System.out.println("Before removing " + nameList);
        nameList.remove("EPSUM");
        nameList.removeLast();
        System.out.println("After removing " + nameList);
    }

    public static void maximum() {
        // Write a method that takes an ArrayList of integers and returns the maximum
        // value.
        int max = java.util.Collections.max(numlist);
        System.out.println("Maximum value of numlist: " + max);
    }

    public static void search() {
        // Write a function to check if a given string exists in an ArrayList of
        // strings.
        String Key = "JOHN";
        if (nameList.contains(Key)) {
            System.out.println(Key + " Exist in String ArrayList");
        } else {
            System.out.println("string does not exist");
        }
    }

    public static void reverse() {
        // Write code to reverse the elements of an ArrayList of integers.
        java.util.Collections.reverse(numlist);
        System.out.println("Reversed numlist -> " + numlist);
    }

    public static void sort() {
        //sort the string numlist
        java.util.Collections.sort(nameList);
        System.out.println("sorted namelist -> " + nameList);
    }

    public static void sum() {
        //finding sum of num numlist
        int total = 0;
        for (int num : numlist) {
            total += num;
        }
        System.out.println("sum of numlist is -> " + total);
    }

    public static void removeDuplicates() {
        // removing same numbers from numlist , this can also be done for strings
        ArrayList<Integer> unique = new ArrayList<>(new java.util.LinkedHashSet<>(numlist));
        numlist.clear();
        numlist.addAll(unique);
        System.out.println("After removing duplicates -> " + numlist);
    }

    public static void main(String[] args) {
        //calling all the funtions
        nums();
        names();
        maximum();
        search();
        reverse();
        sort();
        sum();
        removeDuplicates();
    }
}