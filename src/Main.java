public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("");
        double[] arrayTwoo = {1.57, 7.654, 9.986};
        System.out.println(arrayTwoo[0]);
        System.out.println(arrayTwoo[1]);
        System.out.println(arrayTwoo[2]);
        System.out.println("");
        int[] arrayThree = {5, 8, 63, 46, 86, 563};
        for (int i = 0; i < arrayThree.length; i++) {
            System.out.println(arrayThree[i]);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        System.out.print(array[0] + ", ");
        System.out.print(array[1] + ", ");
        System.out.print(array[2]);
        System.out.println("");
        double[] arrayTwoo = {1.57, 7.654, 9.986};
        System.out.print(arrayTwoo[0] + ", ");
        System.out.print(arrayTwoo[1] + ", ");
        System.out.print(arrayTwoo[2]);
        System.out.println("");
        int[] arrayThree = {5, 8, 63, 46, 86, 563};
        for (int i = 0; i < arrayThree.length; i++) {
            if (i < arrayThree.length-1) {
                System.out.print(arrayThree[i] + ", ");
            } else {
                System.out.print(arrayThree[i]);
            }
        }
    }
}