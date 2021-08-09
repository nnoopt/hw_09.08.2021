package homeWork;

import java.util.ArrayList;
import java.util.List;

public class Fruit {
}

class Apple extends Fruit {
}

class Orange extends Fruit {
}

class Box<T> {
    List<T> arr = new ArrayList<>();
    final float weight_apple = 1.0f;
    final float weight_orange = 1.5f;
    public void addFruit ( T obj ){
        arr.add(obj);
    }

    public float getWeight() {

        if (arr.size()==0) return 0;
        float x = 0;
        if ( arr.get(0) instanceof Apple) x=weight_apple;
        if ( arr.get(0) instanceof Orange) x=weight_orange;
        return arr.size()*x;
    }

    public boolean compare (Box <?> box ){
        return getWeight()==box.getWeight();
    }

    public void pouring (Box <T> box){
        box.arr.addAll(this.arr);
        this.arr.clear();
    }
}

class FruitApp{

    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box <Apple> box1 = new Box <>();
        Box <Orange> box2 = new Box <>();
        Box <Orange> box3 = new Box <>();
        Box <Orange> box4 = new Box <>();

        box1.addFruit(apple);
        box1.addFruit(apple);
        box1.addFruit(apple);
        box2.addFruit(orange);
        box2.addFruit(orange);
        box3.addFruit(orange);
        box4.addFruit(orange);

// Сравнивание веса коробок
        System.out.println(box1.compare(box2));

// Перекладывание из коробок
        box3.pouring(box4);
    }
}


