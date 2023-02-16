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
        System.out.println(stringListImpl.add("Зовет"));
        System.out.println(stringListImpl.add("Пора"));
        System.out.println(stringListImpl.add("Двигаться"));

        System.out.println(stringListImpl.add("вперед"));
        System.out.println(stringListImpl.add("Пора"));
//
//        System.out.println(stringListImpl.add(null));
//        System.out.println(stringListImpl.add(""));

        System.out.println(stringListImpl);
        System.out.println("Кол-во элементов " + stringListImpl.size());
        System.out.println("______________________________________");

        System.out.println(stringListImpl.add(2,"Еу"));
        System.out.println(stringListImpl);

        System.out.println("Кол-во элементов " + stringListImpl.size());
        System.out.println("______________________________________");

        System.out.println("Замена " + stringListImpl.get(2) + " на " + stringListImpl.set(2, "EuaEua"));

        System.out.println(stringListImpl);
        System.out.println("Кол-во элементов " + stringListImpl.size());
        System.out.println("______________________________________");

        System.out.println(stringListImpl.remove("Труба"));
//        System.out.println(stringListImpl.remove("Та"));
        System.out.println(stringListImpl.remove(6));

        System.out.println(stringListImpl);
        System.out.println("Кол-во элементов " + stringListImpl.size());
        System.out.println("______________________________________");

        System.out.println(stringListImpl.contains("Двигаться"));
        System.out.println(stringListImpl.contains("Двиься"));

        System.out.println("______________________________________");

        System.out.println(stringListImpl.indexOf("Двигаться"));
        System.out.println(stringListImpl.indexOf("Двиься"));

        System.out.println("______________________________________");

        System.out.println(stringListImpl.lastIndexOf("Двигаться"));
        System.out.println(stringListImpl.lastIndexOf("Двиься"));

        System.out.println("______________________________________");

        String[] stringListImpl2 = stringListImpl.toArray();

        System.out.println(Arrays.toString(stringListImpl2));

        System.out.println("______________________________________");

        StringListImpl stringListImpl3 = new StringListImpl();
        System.out.println(stringListImpl3.add("Труба"));
        System.out.println(stringListImpl3.add("Зовет"));

        StringListImpl stringListImpl4 = new StringListImpl();
        System.out.println(stringListImpl4.add("Труба"));
        System.out.println(stringListImpl4.add("Зовет"));


        System.out.println(stringListImpl3);
        System.out.println(stringListImpl4);

        System.out.println("Сравнение " + stringListImpl4.equalsArr(stringListImpl3));

        System.out.println("______________________________________");

        stringListImpl.clear();

        System.out.println(stringListImpl.isEmpty());





    }
}