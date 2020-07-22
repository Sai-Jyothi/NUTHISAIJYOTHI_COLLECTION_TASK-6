package com.collectionsTask;

public class App{
	public static void main(String[] args) 
    {
        Datalist<Integer> data_list = new Datalist<Integer>();
        data_list.add(1);
        data_list.add(2);
        data_list.add(3);
        System.out.println("The list elements are :");
        System.out.println(data_list);
        data_list.remove(2);
        System.out.println("List after removing element at index 2 : ");
        System.out.println(data_list);

        System.out.println("Getting the elemtent from the list at index 0 : "+ data_list.get(0) );
        System.out.println("Getting the elemtent from the list at index 1 : "+ data_list.get(1) );
 
        System.out.println("Size of list is : "+data_list.size());
    }
}