package academy.mindswap;

import academy.mindswap.Fruits.Fruit;


import java.util.*;



public class DupeFinder{

    TreeSet<Fruit> fruitList;
    LinkedList<Fruit> originalList;

    public DupeFinder(List<Fruit> fruitList) {
        this.fruitList = new TreeSet();
        this.fruitList.addAll(fruitList);
        this.originalList = new LinkedList<>(fruitList);

    }

    public int checkDupes() {
        return originalList.size() - fruitList.size();
    }

    public Fruit[] getDupes() {
        LinkedList<Fruit> tempArray = new LinkedList<Fruit>(originalList);
        for (Fruit fruit:fruitList) {
            tempArray.remove(fruit);
        }
            return tempArray.toArray(new Fruit[0]);
        }




    public Fruit[] sortedDupes() {
        List tempList = List.of(getDupes());
        PriorityQueue<Fruit> priorityQueue = new PriorityQueue<>(tempList.size(),comparatorByAcidity);
        priorityQueue.addAll(tempList);

        return priorityQueue.toArray(new Fruit[0]);
    }
    Comparator<Fruit> comparatorByAcidity = new Comparator<>() {
        @Override
        public int compare(Fruit o1, Fruit o2) {
            return  o2.getAcidity()- o1.getAcidity();
        }
    };


}