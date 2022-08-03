package academy.mindswap;


import academy.mindswap.Fruits.Fruit;

import java.util.*;



public class DupeFinder<T>{

    TreeSet<T> filteredList;
    LinkedList<T> originalList;

    public DupeFinder(List<T> filteredList) {
        this.filteredList = new TreeSet();
        this.filteredList.addAll(filteredList);
        this.originalList = new LinkedList<>(filteredList);

    }

    public int checkDupes() {
        return originalList.size() - filteredList.size();
    }

    public List<T> getDupes() {
        List<T> tempArray = new LinkedList<T>(originalList);
        for (T element : filteredList) {
            tempArray.remove(element);
        }

        return tempArray;
        }




    public List<T> sortedDupes() {
        if(!(getDupes().get(0) instanceof Comparable)){
            throw new RuntimeException("Need to have comparable implemented");
        }
        LinkedList tempList= new LinkedList<>(getDupes());
       Collections.sort(tempList, Collections.reverseOrder());
        return tempList;
    }



}