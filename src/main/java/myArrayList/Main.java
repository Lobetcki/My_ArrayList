package myArrayList;

import myArrayList.model.IntegerListImpl;
import myArrayList.model.StringListImpl;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        IntegerListImpl integerListImpl = new IntegerListImpl();
//        IntegerListImpl integerListImpl = new IntegerListImpl(15);


        System.out.println(integerListImpl.add(5));
        System.out.println(integerListImpl.add(65));
        System.out.println(integerListImpl.add(84));
        System.out.println(integerListImpl.add(321));
        System.out.println(integerListImpl.add(684));
        System.out.println(integerListImpl.add(65));
        System.out.println(integerListImpl.add(784));
        System.out.println(integerListImpl.add(9847));
        System.out.println(integerListImpl.add(584));
        System.out.println(integerListImpl.add(9874));

        System.out.println(integerListImpl.add(684));
        System.out.println(integerListImpl.add(165));

        //        System.out.println(integerListImpl.add(null));
        System.out.println(integerListImpl);

        System.out.println("Кол-во элементов " + integerListImpl.size());
        System.out.println("______________________________________");

        System.out.println(integerListImpl.add(2,6847684));
        System.out.println(integerListImpl);

        System.out.println("Кол-во элементов " + integerListImpl.size());
        System.out.println("______________________________________");

        System.out.println("Замена " + integerListImpl.get(5) + " на " + integerListImpl.set(5, 6544684));

        System.out.println(integerListImpl);
        System.out.println("Кол-во элементов " + integerListImpl.size());
        System.out.println("______________________________________");

        System.out.println(integerListImpl.removeIndex(9));
//        System.out.println(integerListImpl.remove());
        System.out.println(integerListImpl.remove(321));

        System.out.println(integerListImpl);
        System.out.println("Кол-во элементов " + integerListImpl.size());
        System.out.println("______________________________________");

        System.out.println(integerListImpl.contains(784));
        System.out.println(integerListImpl.contains(4));

        System.out.println("______________________________________");

        System.out.println(integerListImpl.indexOf(784));
        System.out.println(integerListImpl.indexOf(4));

        System.out.println("______________________________________");

        System.out.println(integerListImpl.lastIndexOf(784));
        System.out.println(integerListImpl.lastIndexOf(4));

        System.out.println("______________________________________");

        Integer[] integerListImpl2 = integerListImpl.toArray();

        System.out.println(Arrays.toString(integerListImpl2));

        System.out.println("______________________________________");

        IntegerListImpl integerListImpl3 = new IntegerListImpl();
        System.out.println(integerListImpl3.add(1));
        System.out.println(integerListImpl3.add(2));

        IntegerListImpl integerListImpl4 = new IntegerListImpl();
        System.out.println(integerListImpl4.add(1));
        System.out.println(integerListImpl4.add(2));


        System.out.println(integerListImpl3);
        System.out.println(integerListImpl4);

        System.out.println("Сравнение " + integerListImpl4.equalsArr(integerListImpl3));

        System.out.println("______________________________________");

        integerListImpl.clear();
        System.out.println(integerListImpl);

        System.out.println(integerListImpl.isEmpty());




//        StringListImpl stringListImpl = new StringListImpl();
////        StringListImpl stringListImpl = new StringListImpl(15);
//
//        System.out.println(stringListImpl.add("вперед"));
//        System.out.println(stringListImpl.add("Труба"));
//        System.out.println(stringListImpl.add("Зовет"));
//        System.out.println(stringListImpl.add("Пора"));
//        System.out.println(stringListImpl.add("Двигаться"));
//        System.out.println(stringListImpl.add("вперед"));
//        System.out.println(stringListImpl.add("Труба"));
//        System.out.println(stringListImpl.add("Зовет"));
//        System.out.println(stringListImpl.add("Пора"));
//        System.out.println(stringListImpl.add("Двигаться"));
//
//        System.out.println(stringListImpl.add("вперед"));
//        System.out.println(stringListImpl.add("Пора"));
////
////        System.out.println(stringListImpl.add(null));
////        System.out.println(stringListImpl.add(""));
//
//        System.out.println(stringListImpl);
//        System.out.println("Кол-во элементов " + stringListImpl.size());
//        System.out.println("______________________________________");
//
//        System.out.println(stringListImpl.add(2,"Еу"));
//        System.out.println(stringListImpl);
//
//        System.out.println("Кол-во элементов " + stringListImpl.size());
//        System.out.println("______________________________________");
//
//        System.out.println("Замена " + stringListImpl.get(2) + " на " + stringListImpl.set(2, "EuaEua"));
//
//        System.out.println(stringListImpl);
//        System.out.println("Кол-во элементов " + stringListImpl.size());
//        System.out.println("______________________________________");
//
//        System.out.println(stringListImpl.remove("Труба"));
////        System.out.println(stringListImpl.remove("Та"));
//        System.out.println(stringListImpl.remove(6));
//
//        System.out.println(stringListImpl);
//        System.out.println("Кол-во элементов " + stringListImpl.size());
//        System.out.println("______________________________________");
//
//        System.out.println(stringListImpl.contains("Двигаться"));
//        System.out.println(stringListImpl.contains("Двиься"));
//
//        System.out.println("______________________________________");
//
//        System.out.println(stringListImpl.indexOf("Двигаться"));
//        System.out.println(stringListImpl.indexOf("Двиься"));
//
//        System.out.println("______________________________________");
//
//        System.out.println(stringListImpl.lastIndexOf("Двигаться"));
//        System.out.println(stringListImpl.lastIndexOf("Двиься"));
//
//        System.out.println("______________________________________");
//
//        String[] stringListImpl2 = stringListImpl.toArray();
//
//        System.out.println(Arrays.toString(stringListImpl2));
//
//        System.out.println("______________________________________");
//
//        StringListImpl stringListImpl3 = new StringListImpl();
//        System.out.println(stringListImpl3.add("Труба"));
//        System.out.println(stringListImpl3.add("Зовет"));
//
//        StringListImpl stringListImpl4 = new StringListImpl();
//        System.out.println(stringListImpl4.add("Труба"));
//        System.out.println(stringListImpl4.add("Зовет"));
//
//
//        System.out.println(stringListImpl3);
//        System.out.println(stringListImpl4);
//
//        System.out.println("Сравнение " + stringListImpl4.equalsArr(stringListImpl3));
//
//        System.out.println("______________________________________");
//
//        stringListImpl.clear();
//
//        System.out.println(stringListImpl.isEmpty());





    }
}