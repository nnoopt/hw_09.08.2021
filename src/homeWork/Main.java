package homeWork;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] mas = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(mas));

// Выполнение первого задания
        new Replacement().replace(0, 1, mas);
        System.out.println(Arrays.toString(mas));

// Выполнение второго задания
        ArrayList list = new Replacement().toArrayList(mas);
        }
}

class Replacement <T> {
    public void replace(int index_first, int index_last, T[] mas) {
        if (index_first > mas.length || index_last > mas.length) {
            System.out.println("Не верные индексы");
        } else {
            T x = mas[index_first];
            mas[index_first] = mas[index_last];
            mas[index_last] = x;
        }
    }

    public ArrayList<T> toArrayList (T [] mas){
        return new ArrayList<>(Arrays.asList(mas));
    }
}