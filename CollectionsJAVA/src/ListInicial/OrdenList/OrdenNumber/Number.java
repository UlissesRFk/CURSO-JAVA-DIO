package ListInicial.OrdenList.OrdenNumber;

public class Number implements Comparable<Number>{
    private int number;

    public Number(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        
        return "\n Numero: " + number;
    }

    @Override
    public int compareTo(Number n) {
        return Integer.compare(number, n.getNumber());
    }
}
