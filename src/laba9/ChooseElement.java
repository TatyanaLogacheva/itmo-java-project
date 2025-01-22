package laba9;

import java.util.*;

public class ChooseElement {
    public static void addition(List<Integer> items) {
        for (int i = 0; i <= 1000000; i++) {
            Random randomaizer = new Random();
            items.add(randomaizer.nextInt(1000));
        }
    }

    public static void chooseItem(List<Integer> items) {
        for (int i = 0; i <= 100000; i++) {
            Random randomaizer = new Random();
            items.get(randomaizer.nextInt(items.size()));
        }
    }

    public static void main(String[] args) {
        List<Integer> aList = new ArrayList<>();
        List<Integer> lList = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        addition(aList);
        long endTime = System.currentTimeMillis();
        System.out.println("Время добавления элементов ArrayList: " + (endTime - startTime));

        long startTime2 = System.currentTimeMillis();
        addition(lList);
        long endTime2 = System.currentTimeMillis();
        System.out.println("Время добавления элементов LinkedList: " + (endTime2 - startTime2));
        //Немного дольше т.к. обновляет пару указателей и создает ссылку на вставляемый объект

        long startTime3 = System.currentTimeMillis();
        chooseItem(aList);
        long endTime3 = System.currentTimeMillis();
        System.out.println("Время выбора элементов ArrayList: " + (endTime3 - startTime3));
        //Сразу ищет элемент по индексу, время выполнения O(1)

        long startTime4 = System.currentTimeMillis();
        chooseItem(lList);
        long endTime4 = System.currentTimeMillis();
        System.out.println("Время выбора элементов LinkedList: " + (endTime4 - startTime4));
        //Намного дольше, для поиска нужного элемента каждый раз требуется проходить весь список сначала,
        // т.к. элементы содержат указатели на предыдущий и следующий элемент
        //        время выполнения O(n)

    }
}
