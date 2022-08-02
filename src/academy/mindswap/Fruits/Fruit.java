package academy.mindswap.Fruits;

import java.util.Comparator;
import java.util.Objects;

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
        if( this.equals(o)){
            return 0;
        }
        return this.getAcidity() > o.getAcidity()? 1:-1;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return acidity == fruit.acidity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(acidity);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "acidity=" + acidity +
                '}';
    }


}
