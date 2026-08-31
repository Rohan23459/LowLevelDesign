package TICTACTOE.Model;

public final class Pair<K,V>{
    private final K first;
    private final V second;

    public Pair(K first, V second){
        this.first = first;
        this.second = second;
    }

    public K first(){
        return first;
    }

    public V second(){
        return second;
    }



}