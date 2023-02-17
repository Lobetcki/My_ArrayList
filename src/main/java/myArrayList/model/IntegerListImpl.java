package myArrayList.model;


import myArrayList.exeption.FoundNullException;
import myArrayList.exeption.IndexNotFoundException;

import java.util.Arrays;

/* Реализация интерфейса IntegerList.
   В качестве хранилища используется массив.
   В конструкторе задаеться размер массива внутри. */
public class IntegerListImpl implements IntegerList {

    private static final int DEFAULT_CAPACITY = 10;
    private Integer[] array;
    private int size = -1;
                                                                                // КОНСТТРУКТОРЫ
    public IntegerListImpl() {
        this.array = new Integer[DEFAULT_CAPACITY];
    }

    public IntegerListImpl(Integer[] array) {
        this.array = array;
    }

    public IntegerListImpl (int initialCapacity) {
        this.array = new Integer[initialCapacity];
    }

                                                                                // Проверка на наличие индекса
    private void isThereIndex(int index) {
        if (index > size || index < 0)
            throw new IndexNotFoundException("Index: "+index+", Size: " + size);
    }

                                                                                // Увеличение массива
    private Integer[] grow() {
        size++;
        if (array.length <= size) {
            array = Arrays.copyOf(array, (int) (array.length * 1.5));
           // array = newArray20;
        }
        return array;
    }

                                            // Добавление элемента. Вернуть добавленный элемент в качестве результата выполнения.
    @Override
    public Integer add(Integer item) {
        grow();
        array[size] = item;
        return array[size];
    }

                                                                // Добавление элемента на определенную позицию списка.
    @Override
    public Integer add(int index, Integer item) {
        isThereIndex(index);
        grow();

        Integer[] newArray = new Integer[array.length];
        System.arraycopy(array, index, newArray, 0, (size - index));
        System.arraycopy(newArray, 0, array, index + 1, (size - index));
        array[index] = item;
        return array[index];
    }

                                            // Установить элемент на определенную позицию, затерев существующий.
    @Override
    public Integer set(int index, Integer item) {
        isThereIndex(index);
        array[index] = item;
        return array[index];
    }

                                                                                // Удаление элемента.
    @Override
    public Integer remove(int item) {
        try {
            for (int i = 0; i < size; ++i) {
                if (item == array[i]) {
                    System.arraycopy(array, (i + 1), array, i, size - i+1);
                    size--;
                    return item;
                }
            } throw new FoundNullException("Нет такого в массиве");
        } catch (FoundNullException e) { throw new FoundNullException("Нет такого в массиве");
        }
    }

                                                                        // Удаление элемента по индексу.
    @Override
    public Integer removeIndex(int index) {
        isThereIndex(index);
        System.arraycopy(array, (index + 1), array, index, size - index+1);
        size--;
        return array[index];
    }

                                                                                // Проверка на существование элемента.
    @Override
    public boolean contains(int item) {
        for (int i = 0; i < size; ++i) {
            if (item == array[i]) {
                return true;
            }
        }
        return false;
    }

                                                        // Сортировка
    public void sortInsertion() {

        for (int i = 1; i < array.length; i++) {

            int temp = array[i];
            int j = i;

            while (j > 0 && array[j - 1] >= temp) {
                array[j] = array[j - 1];
                j--;
            }

            array[j] = temp;
        }
    }
                                                        // Рукурсивная сортировка
    public static void mergeSort(Integer[] arr) {
        if (arr.length < 2) {
            return;
        }
        int mid = arr.length / 2;
        Integer[] left = new Integer[mid];
        Integer[] right = new Integer[arr.length - mid];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = arr[mid + i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }
                                                        // MERGE
    public static void merge(Integer[] arr, Integer[] left, Integer[] right) {

        int mainP = 0;
        int leftP = 0;
        int rightP = 0;
        while (leftP < left.length && rightP < right.length) {
            if (left[leftP] <= right[rightP]) {
                arr[mainP++] = left[leftP++];
            } else {
                arr[mainP++] = right[rightP++];
            }
        }
        while (leftP < left.length) {
            arr[mainP++] = left[leftP++];
        }
        while (rightP < right.length) {
            arr[mainP++] = right[rightP++];
        }
    }


                                                    // Бинарный поиск
    public boolean contains2(int element) {
        mergeSort(array);
        int min = 0;
        int max = array.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (element == array[mid]) {
                return true;
            }

            if (element < array[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }
                                                                                        // Поиск элемента.
    @Override
    public int indexOf(Integer item) {
        for (int i = 0; i < size; ++i) {
            if (item == array[i]) {
                return i;
            }
        }
        return -1;
    }

                                                                                // Поиск элемента с конца.
    @Override
    public int lastIndexOf(int item) {
        for (int i = size; i >= 0; --i) {
            if (item == array[i]) {
                return i;
            }
        }
        return -1;
    }

                                                                                    // Получить элемент по индексу.
    @Override
    public Integer get(int index) {
        isThereIndex(index);
        return array[index];
    }

                                                                                // Вернуть фактическое количество элементов.
    @Override
    public int size() {
        return this.size+1;
    }

                                                                    // Вернуть true, если элементов в списке нет, иначе false.
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

                                                                                            // Удалить все элементы из списка.
    @Override
    public void clear() {
        size = 0;
        this.array = new Integer[size];
    }

                                                                            // Создать новый массив из строк в списке и вернуть его.
    @Override
    public Integer[] toArray() {
        return Arrays.copyOf(array, size+1);

    }

                                                                                        // Сравнить текущий список с другим.
    @Override
    public boolean equalsArr(IntegerListImpl otherList) {
        if (otherList == null) throw new FoundNullException(" Список отсутствует ");
        if (size+1 == otherList.size()) {
            for (int i = 0; i < size; ++i) {
                if (array[i] != otherList.get(i)) {
                    return false;
                }
            } return true;
        }
        return false;
    }



    @Override
    public String toString() {
        return "IntegerListImpl{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}
