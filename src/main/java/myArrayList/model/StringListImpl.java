package myArrayList.model;

import myArrayList.exeption.FoundNullException;
import myArrayList.exeption.IndexNotFoundException;
import java.util.Arrays;

/* Реализация интерфейса StringList.
   В качестве хранилища используется массив.
   В конструкторе задаеться размер массива внутри. */
public class StringListImpl implements StringList {

    private static final int DEFAULT_CAPACITY = 10;
    private String[] array;
    private int size = -1;
                                                                // КОНСТТРУКТОРЫ
    public StringListImpl() {
        this.array = new String[DEFAULT_CAPACITY];
    }

    public StringListImpl(int initialCapacity) {
        this.array = new String[initialCapacity];
    }

                                                                // Проверка на Null
    private void isThereNull(String item) {
        if (item == null || item == "")
            throw new FoundNullException("Вы не ввели ни одной буквы");
    }
                                                                 // Проверка на наличие индекса
    private void isThereIndex(int index) {
        if (index > size || index < 0)
            throw new IndexNotFoundException("Index: "+index+", Size: " + size);
    }

                                                                 // Увеличение массива
    private String[] increasingArray() {
        String[] newArray20 = new String[array.length * 2];
        size++;
        if (array.length <= size) {
            System.arraycopy(array, 0, newArray20, 0, size);
            array = newArray20;
        }
        return array;
    }


                                // Добавление элемента. Вернуть добавленный элемент в качестве результата выполнения.
    @Override
    public String add(String item) {
        isThereNull(item);
        increasingArray();
        array[size] = item;
        return array[size];
    }

                                                            // Добавление элемента на определенную позицию списка.
    // Если выходит за пределы фактического количества элементов или массива, выбросить исключение.
    // Вернуть добавленный элемент в качестве результата выполнения.
    @Override
    public String add(int index, String item) {
        isThereIndex(index);
        isThereNull(item);
        increasingArray();

        //String[] newArray = new String[array.length];
            //System.arraycopy(this.array, index, newArray, 0, (size - index));
            System.arraycopy(array, index, array, index + 1, (size - index));
            array[index] = item;
        return array[index];
    }

                                                    // Установить элемент на определенную позицию, затерев существующий.
    // Выбросить исключение, если индекс больше фактического количества элементов
    // или выходит за пределы массива.
    @Override
    public String set(int index, String item) {
        isThereNull(item);
        isThereIndex(index);
        array[index] = item;
        return array[index];
    }

                                                            // Удаление элемента.
    // Вернуть удаленный элемент или исключение, если подобный
    // элемент отсутствует в списке.
    @Override
    public String remove(String item) {
        isThereNull(item);
        try {
            for (int i = 0; i < size; ++i) {
                if (item.equals(array[i])) {
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
    public String remove(int index) {
        isThereIndex(index);
        System.arraycopy(array, (index + 1), array, index, size - index+1);
        size--;
        return array[index];
    }

                                                            // Проверка на существование элемента.
    // Вернуть true/false;
    @Override
    public boolean contains(String item) {
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
    public int indexOf(String item) {
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
    public int lastIndexOf(String item) {
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
    public String get(int index) {
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
        array = new String[size];
    }

                                                 // Создать новый массив из строк в списке и вернуть его.
    @Override
    public String[] toArray() {
        return Arrays.copyOf(array, size+1);

    }

                                                        // Сравнить текущий список с другим.
    // Вернуть true/false или исключение, если передан null.
    @Override
    public boolean equalsArr(StringListImpl otherList) {
        if (otherList == null) throw new FoundNullException(" Список отсутствует ");
        if (size+1 == otherList.size()) {
            for (int i = 0; i < size; ++i) {
                if (!array[i].equals(otherList.get(i))) {
                    return false;
                }
            } return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "StringListImpl{" +
                "array=" + Arrays.toString(array) +
         //       "array=" + Arrays.toString(Arrays.copyOf(array, size)) +
                '}';
    }
}
