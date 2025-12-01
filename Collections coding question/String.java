// Write a Java program to find the first non-repeated character in a given string?


package p1;

import java.util.LinkedHashMap;
import java.util.Map;

public class CollectionCode {
public static void main(String[] args) {
	String input= "swiss";
	
	Map<Character,Integer> lhm = new LinkedHashMap<>();
	
	 for( char ch : input.toCharArray()) {
		 lhm.put(ch, lhm.getOrDefault(ch, 0)+ 1);
	 }
	 
	 for( Map.Entry<Character, Integer> entry : lhm.entrySet()) {
		 if(entry.getValue()==1) {
			 System.out.println("first non-repeated character:" + entry.getKey());
		return;
		 }
	 }
	 
}
}

//Write a Java program to remove duplicate elements from an ArrayList while maintaining the original insertion order.
package p1;

import java.util.*;

public class CollectionCode {
public static void main(String[] args) {
List<Integer> list = Arrays.asList(1,2,4,3,2,1,4);

Set<Integer> st= new LinkedHashSet<>(list);
System.out.println(st);
}
}
// You are given an array of integers. Write a Java program to find the first duplicate element in the array using Java Collections.
public static int findFirstDuplicate(int[] arr){
	set<Integer> set = new HashSet<>();
	for (int num : arr){
		if(!set.add(num)){
			return num;
		}
	}
	retrun -1;
}
public static void main(String[] args ){
	int[] arr = {4,5,1,2,5,3,2}
	System.out.println(findFirstDuplicate(arr));// output: 5
}
// key points HashSet.add() return false if the element already exists

//Q. You are given an array of integers. Write a Java program to find the k largest elements using Collections.

Public static List<Integer> findLargest(int[] , int k){
    priorityQueue<Integer> minHeap= new priorityQueue<>();

	for (int num: arr){
		minHeap.add(num);
		if(minHeap.size()>k){
			minHeap.poll();
		}
	}

List<Integer> result= new ArrayList<>(minHeap);
return result;

}
public static void main(String[] args){
	int[] arr= {3,1,5,12,2,11};
	system.out.println(findLargest(arr,k)); 
}