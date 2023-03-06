package Programm;

import java.util.HashMap;

public class hw5 {
    public static void main(String[] args) {
        // Создать множество, ключ и значение строки. 
        //Добавить шесть элементов. Вывести в консоль значения.
        HashMap<String, String> name1 = new HashMap<>();
        name1.put("Первый", "Хороший");
        name1.put("Второй", "Качественный");
        name1.put("Третий", "Простой");
        name1.put("Четвертый", "Бюджетный");
        name1.put("Пятый", "Дорогой");
        name1.put("Шестой", "Красивый");
        name1.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println(name1);

        // Добавить ко всем значениям символ "!".
        for (String key : name1.keySet()) {
            name1.compute(key, (k, v) -> v + "!");
        }
        System.out.println(name1);


        // Создать второе множество с таким же обобщением. 
        //Ключи второго множества частично совпадают с ключами первого.
        HashMap<String, String> name2 = new HashMap<>();
        name2.put("Первый", "Чайник");
        name2.put("Четвертый", "Тостер");
        name2.put("Пятый", "Пылесос");
        name2.put("Седьмой", "Кружка");
        name2.put("Восьмой", "Утюг");
        name2.put("Девятый", "Миска");
        System.out.println(name2);

        // Объединить значения во втором множестве и первом, если ключи совпадают. 
        //Вывести результат в консоль.
        for (String item : name2.keySet()) {
            name2.merge(item, name1.getOrDefault(item, "Def"), (nV, tV) -> nV + tV);
        }
        System.out.println("*".repeat(30));
        System.out.println(name2);
        name2.forEach((k, v) -> System.out.println(k + " " + v));
    }
}