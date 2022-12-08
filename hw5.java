package date221121.HW5;

// 1. Создать словарь HashMap. Обобщение <Integer, String>.
// 2. Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
// 3. Изменить значения дописав восклицательные знаки. 
// 4. *Создать TreeMap, заполнить аналогично.
// 5. *Увеличить количество элементов таблиц до 1000 случайными ключами и общей строкой.
// 6. **Сравнить время прямого и случайного перебора тысячи элементов словарей.

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;

public class hw5 {
    public static void main(String[] args) {
        // 1. Создать словарь HashMap. Обобщение <Integer, String>.
        Map<Integer,String> hmSomeOne = new HashMap<>();
        // 2. Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
        hmSomeOne.put(0, "blue");
        hmSomeOne.put(1, "yellow");
        hmSomeOne.put(2, "brown");
        System.out.println("Стартовый hash" + hmSomeOne);
        // 3. Изменить значения дописав восклицательные знаки. 
        for (var item : hmSomeOne.entrySet()) {
            item.setValue(item.getValue()+"!");
        }
        System.out.println("Модифицированный hash" + hmSomeOne);
        // 4. *Создать TreeMap, заполнить аналогично.
        //TreeMap<Integer,String> tmOhNoOne = new TreeMap<>();
        TreeMap<Integer, String> tmOhNoOne = new TreeMap<>();
        tmOhNoOne.put(0, "black");
        tmOhNoOne.put(1, "white");
        tmOhNoOne.put(2, "walter white");
        System.out.println("Стартовый tree" + tmOhNoOne);
        for (var item : tmOhNoOne.entrySet()) {
            item.setValue(item.getValue()+"!");
        }
        System.out.println("Стартовый tree" + tmOhNoOne);
        // 5. *Увеличить количество элементов таблиц до 1000 случайными ключами и общей строкой.
        for (int i = 0; i < 1000; i++) {
            hmSomeOne.put(i, "unknown");
            tmOhNoOne.put(i, "unknown");            
        }
        // 6. **Сравнить время прямого и случайного перебора тысячи элементов словарей.
        // прямой 
        String index = "";
        long timeSHM = System.nanoTime();
        for (var item : hmSomeOne.entrySet()) {
            index=item.getValue();
        }
        long timeSHMend = System.nanoTime() - timeSHM;
        
        long timeSTM = System.nanoTime();
        for (var item : tmOhNoOne.entrySet()) {
            index = item.getValue();
        }
        long timeSTMend = System.nanoTime() - timeSTM;
        System.out.print("Прямой перебор: hash = " + timeSHMend + " и tree = " + timeSTMend);
        
        // случайный
     

    }
}
