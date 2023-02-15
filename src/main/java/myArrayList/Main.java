package myArrayList;

import myArrayList.model.StringListImpl;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        StringListImpl stringListImpl = new StringListImpl();
//        StringListImpl stringListImpl = new StringListImpl(15);

        System.out.println(stringListImpl.add("вперед"));
        System.out.println(stringListImpl.add("Труба"));
        System.out.println(stringListImpl.add("Зовет"));
        System.out.println(stringListImpl.add("Пора"));
        System.out.println(stringListImpl.add("Двигаться"));
        System.out.println(stringListImpl.add("вперед"));
        System.out.println(stringListImpl.add("Труба"));
//        System.out.println(stringListImpl.add("Зовет"));
//        System.out.println(stringListImpl.add("Пора"));
//        System.out.println(stringListImpl.add("Двигаться"));

//        System.out.println(stringListImpl.add("вперед"));
//        System.out.println(stringListImpl.add("Пора"));

//        System.out.println(stringListImpl.add(null));
//        System.out.println(stringListImpl.add(""));

        System.out.println(stringListImpl);
        System.out.println("Кол-во элементов " + stringListImpl.size());
        System.out.println("______________________________________");

        System.out.println(stringListImpl.add(2,"Еу"));
        System.out.println(stringListImpl);

        System.out.println("Кол-во элементов " + stringListImpl.size());
        System.out.println("______________________________________");

        System.out.println("Замена " + "stringListImpl[2]" + " на " + stringListImpl.set(2, "EuaEua"));

        System.out.println(stringListImpl);
        System.out.println("Кол-во элементов " + stringListImpl.size());
        System.out.println("______________________________________");




   /* Список не должен добавлять или хранить в себе null. Т. е. в случае удаления элемента нужно смещать все элементы на ячейку влево,
     а при добавлении в середину или начало — на ячейку вправо.

    По желанию можно реализовать расширение массива.

    Рекомендуется написать свои исключения и выбрасывать их в тех ситуациях, которые описаны в интерфейсе.
    Если в какой-то из методов в качестве параметра приходит null, выбросить исключение.

    */



    }
}