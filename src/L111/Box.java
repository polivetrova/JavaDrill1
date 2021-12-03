package L111;

import java.util.*;

public class Box<T extends Fruit>{

    private List<T> contents = new ArrayList<>();

    public List<T> getContents(){
        return contents;
    }

    public float getWeight(){
        if(contents.size() > 0){
        return contents.size() * contents.get(0).getWeight();
        }
        return 0F;
    }

    public boolean compare(Box<? extends Fruit> box){
        return  box.getWeight() == getWeight();
    }

    public void pourIntoOtherBox(Box<T> other){
        getContents().addAll(other.getContents());
        other.getContents().clear();
    }

    public void add(T fruit){
        contents.add(fruit);
    }
}
