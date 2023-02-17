package myArrayList;

import myArrayList.model.IntegerListImpl;
import myArrayList.model.StringListImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
                                                                        // Методы сортировки
//    private static void swapElements(int[] arr, int indexA, int indexB) {
//        int tmp = arr[indexA];
//        arr[indexA] = arr[indexB];
//        arr[indexB] = tmp;
//    }
//
//    public static void sortBubble(int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    swapElements(arr, j, j + 1);
//                }
//            }
//        }
//    }
//
//    public static void sortSelection(int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            int minElementIndex = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[minElementIndex]) {
//                    minElementIndex = j;
//                }
//            }
//            swapElements(arr, i, minElementIndex);
//        }
//    }
//
//    public static void sortInsertion(int[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            int temp = arr[i];
//            int j = i;
//            while (j > 0 && arr[j - 1] >= temp) {
//                arr[j] = arr[j - 1];
//                j--;
//            }
//            arr[j] = temp;
//        }
//    }


    public static void main(String[] args) {

        Random random = new Random(); // Массивы рандомных чисел
        int asd = 100_000;
        //        IntegerListImpl integerListImpl = new IntegerListImpl();
//        IntegerListImpl integerListImpl = new IntegerListImpl(asd);
//
//        for (int i = 0; i < asd; i++) {
//            integerListImpl.add(random.nextInt(asd));
//        }
//
//        IntegerListImpl integerListImpl5 = new IntegerListImpl(integerListImpl.size());
//        for (int i = 0; i < integerListImpl.size(); i++) {
//            integerListImpl5.add(integerListImpl.get(i));
//        }
//
//       // integerListImpl5.sortInsertion();
//
//        System.out.println(integerListImpl5);

       // integerListImpl.sortInsertion();



//        long start4 = System.currentTimeMillis();
//        System.out.println(integerListImpl.contains2(75));
//        System.out.println(System.currentTimeMillis() - start4);
//
//        System.out.println(integerListImpl);

                                                            //  Самый быстрый метод сортировки
        Integer[] randomArray1 = new Integer[100];

        for (int i = 0; i < randomArray1.length; i++) {
            randomArray1[i] = random.nextInt();
        }

        long start1 = System.currentTimeMillis();
        IntegerListImpl.mergeSort(randomArray1);
        System.out.println(System.currentTimeMillis() - start1);

        System.out.println(Arrays.toString(randomArray1));

//        int[] randomArray2 = Arrays.copyOf(randomArray1, randomArray1.length);
//
//        int[] randomArray3 = Arrays.copyOf(randomArray1, randomArray1.length);





//        long start1 = System.currentTimeMillis();
//        sortBubble(randomArray1);
//        System.out.println(System.currentTimeMillis() - start1);
//
//        long start2 = System.currentTimeMillis();
//        sortSelection(randomArray2);
//        System.out.println(System.currentTimeMillis() - start2);
//
//        long start3 = System.currentTimeMillis();
//        sortInsertion(randomArray3);
//        System.out.println(System.currentTimeMillis() - start3);









//        //        System.out.println(integerListImpl.add(null));
//        System.out.println(integerListImpl);
//
//        System.out.println("Кол-во элементов " + integerListImpl.size());
//        System.out.println("______________________________________");
//
//        System.out.println(integerListImpl.add(2,6847684));
//        System.out.println(integerListImpl);
//
//        System.out.println("Кол-во элементов " + integerListImpl.size());
//        System.out.println("______________________________________");
//
//        System.out.println("Замена " + integerListImpl.get(5) + " на " + integerListImpl.set(5, 6544684));
//
//        System.out.println(integerListImpl);
//        System.out.println("Кол-во элементов " + integerListImpl.size());
//        System.out.println("______________________________________");
//
//        System.out.println(integerListImpl.removeIndex(9));
////        System.out.println(integerListImpl.remove());
//        System.out.println(integerListImpl.remove(321));
//
//        System.out.println(integerListImpl);
//        System.out.println("Кол-во элементов " + integerListImpl.size());
//        System.out.println("______________________________________");
//
//        System.out.println(integerListImpl.contains(784));
//        System.out.println(integerListImpl.contains(4));
//
//        System.out.println("______________________________________");
//
//        System.out.println(integerListImpl.indexOf(784));
//        System.out.println(integerListImpl.indexOf(4));
//
//        System.out.println("______________________________________");
//
//        System.out.println(integerListImpl.lastIndexOf(784));
//        System.out.println(integerListImpl.lastIndexOf(4));
//
//        System.out.println("______________________________________");
//
//        Integer[] integerListImpl2 = integerListImpl.toArray();
//
//        System.out.println(Arrays.toString(integerListImpl2));
//
//        System.out.println("______________________________________");
//
//        IntegerListImpl integerListImpl3 = new IntegerListImpl();
//        System.out.println(integerListImpl3.add(1));
//        System.out.println(integerListImpl3.add(2));
//
//        IntegerListImpl integerListImpl4 = new IntegerListImpl();
//        System.out.println(integerListImpl4.add(1));
//        System.out.println(integerListImpl4.add(2));
//
//
//        System.out.println(integerListImpl3);
//        System.out.println(integerListImpl4);
//
//        System.out.println("Сравнение " + integerListImpl4.equalsArr(integerListImpl3));
//
//        System.out.println("______________________________________");
//
//        integerListImpl.clear();
//        System.out.println(integerListImpl);
//
//        System.out.println(integerListImpl.isEmpty());




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