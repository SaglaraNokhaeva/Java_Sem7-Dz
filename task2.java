// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list1.add(random.nextInt(10));
        }
        System.out.println(list1);
        int max_item = list1.get(0);
        int min_item = list1.get(0);
        float srednee_arif = 0;
        for (int i = 0; i < list1.size(); i++) {
            srednee_arif = srednee_arif + list1.get(i);
            if (list1.get(i) > max_item) {
                max_item = list1.get(i);
            } else {
                if (list1.get(i) < min_item) {
                    min_item = list1.get(i);
                }
            }            
        }
        srednee_arif = srednee_arif / list1.size();
        System.out.printf("максимальное значение = %d \n",max_item);
        System.out.printf("максимальное значение = %d \n",min_item);
        System.out.printf("среднее арифметическое = %f \n",srednee_arif);
    }
}
