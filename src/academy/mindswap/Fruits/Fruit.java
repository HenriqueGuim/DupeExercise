package academy.mindswap.Fruits;

public abstract class Fruit implements Comparable<Fruit> {
    private int acidity;

    public Fruit(int acidity){
        this.acidity = acidity;
    }

    public int getAcidity() {
        return acidity;
    }

    @Override
    public int compareTo(Fruit o) {
        if(this.getClass() == o.getClass() && this.getAcidity()== o.getAcidity()){ return 0;}
        return this.getAcidity() > o.getAcidity()? 1: -1;

    }

    @Override
    public String toString() {
        return "Fruit{" +
                "acidity=" + acidity +
                '}';
    }
}
