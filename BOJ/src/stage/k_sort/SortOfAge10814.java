package stage.k_sort;

/*
     문제 10814번 : 나이순 정렬
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortOfAge10814 {

    public static class Person{
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        Person[] arr = new Person[n];

        for(int i=0; i<n; i++) {
            arr[i] = new Person(kb.nextInt(), kb.next());
        }

        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });

        for(Person x : arr) {
            System.out.println(x.age + " " + x.name);
        }


    }
}
