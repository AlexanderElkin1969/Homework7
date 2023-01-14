public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        int salary =15_000, total =0, i =1;
        System.out.println("Задача 1");
        while (total <=2_459_000) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            i++;
        }
    }
    public static void task2() {
        int i =1;
        System.out.println("Задача 2");
        while (i <=10){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        for (i =10; i>= 1; i--) System.out.print(i+" ");
    }
    public static void task3() {
        int population =12_000_000, birthrate =17, mortality =8;
        System.out.println("\n"+"Задача 3");
        for (int i =1; i <=10; i++) {
            population = population + population*(birthrate - mortality)/ 1000;
            System.out.println("Год " + i + " , численность населения составляет " + population);
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
    }
    public static void task5() {
        System.out.println("Задача 5");
    }
    public static void task6() {
        System.out.println("Задача 6");
    }
    public static void task7() {
        System.out.println("Задача 7");
    }
    public static void task8() {
        System.out.println("Задача 8");
    }
}
