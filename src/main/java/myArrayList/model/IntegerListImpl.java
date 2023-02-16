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

    public IntegerListImpl (int initialCapacity) {
        this.array = new Integer[initialCapacity];
    }

                                                                                // Проверка на наличие индекса
    private void isThereIndex(int index) {
        if (index > size || index < 0)
            throw new IndexNotFoundException("Index: "+index+", Size: " + size);
    }

                                                                                // Увеличение массива
    private Integer[] increasingArray() {
        size++;
        if (array.length <= size) {
            Integer[] newArray20 = Arrays.copyOf(array, array.length * 2);
            array = newArray20;
        }
        return array;
    }

                                            // Добавление элемента. Вернуть добавленный элемент в качестве результата выполнения.
    @Override
    public Integer add(Integer item) {
        increasingArray();
        array[size] = item;
        return array[size];
    }

                                                                // Добавление элемента на определенную позицию списка.
    // Если выходит за пределы фактического количества элементов или массива, выбросить исключение.
    // Вернуть добавленный элемент в качестве результата выполнения.
    @Override
    public Integer add(int index, Integer item) {
        isThereIndex(index);
        increasingArray();

        Integer[] newArray = new Integer[array.length];
        System.arraycopy(array, index, newArray, 0, (size - index));
        System.arraycopy(newArray, 0, array, index + 1, (size - index));
        array[index] = item;
        return array[index];
    }

                                            // Установить элемент на определенную позицию, затерев существующий.
    // Выбросить исключение, если индекс больше фактического количества элементов
    // или выходит за пределы массива.
    @Override
    public Integer set(int index, Integer item) {
        isThereIndex(index);
        array[index] = item;
        return array[index];
    }

                                                                                // Удаление элемента.
    // Вернуть удаленный элемент или исключение, если подобный
    // элемент отсутствует в списке.
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
    // Вернуть удаленный элемент или исключение, если подобный
    // элемент отсутствует в списке.
    @Override
    public Integer removeIndex(int index) {
        isThereIndex(index);
        System.arraycopy(array, (index + 1), array, index, size - index+1);
        size--;
        return array[index];
    }

                                                                                // Проверка на существование элемента.
    // Вернуть true/false;
    @Override
    public boolean contains(Integer item) {
        for (int i = 0; i < size; ++i) {
            if (item.equals(array[i])) {
                return true;
            }
        }
        return false;
    }

                                                                                        // Поиск элемента.
    // Вернуть индекс элемента или -1 в случае отсутствия.
    @Override
    public int indexOf(Integer item) {
        for (int i = 0; i < size; ++i) {
            if (item.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

                                                                                // Поиск элемента с конца.
    // Вернуть индекс элемента или -1 в случае отсутствия.
    @Override
    public int lastIndexOf(Integer item) {
        for (int i = size; i >= 0; --i) {
            if (item.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

                                                                                    // Получить элемент по индексу.
    // Вернуть элемент или исключение, если выходит за рамки фактического
    // количества элементов.
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
    // Вернуть true/false или исключение, если передан null.
    @Override
    public boolean equalsArr(IntegerListImpl otherList) {
        // if (otherList == null) throw new FoundNullException(" Список отсутствует ");
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
