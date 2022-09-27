import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //System.out.println("TaskOne");
        int[] integers = new int[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;
        double[] fractionalNumbers = new double[] {1.57, 7.654, 9.986};
        String[] integerArray = {"A","B","C"};

        System.out.println();
        System.out.println("TaskTwo");

        int lenghtIntegers = integers.length -1;
        for (int i = 0; i <= lenghtIntegers; i++) {
            if(i < lenghtIntegers) {
                System.out.print(integers[i] + ",");
            }
            else if (i == lenghtIntegers) {
                System.out.print(integers[i]);
            }
        }
        System.out.println();

        int lenghtFractionalNumbers = fractionalNumbers.length -1;
        for (int i = 0; i <= lenghtFractionalNumbers; i++) {
            if(i < lenghtFractionalNumbers) {
                System.out.print(fractionalNumbers[i] + ",");
            }
            else if (i == lenghtFractionalNumbers) {
                System.out.print(fractionalNumbers[i]);
            }
        }
        System.out.println();

        int lenghtIntegerArray = integerArray.length -1;
        for (int i = 0; i <= lenghtIntegerArray; i++) {
            if(i < lenghtIntegerArray) {
                System.out.print(integerArray[i] + ",");
            }
            else if (i == lenghtIntegerArray) {
                System.out.print(integerArray[i]);
            }
        }
        System.out.println();
        System.out.println("TaskThree");
        for (int i = lenghtIntegers; i >= 0; i--) {
            if(i > 0) {
                System.out.print(integers[i] + ",");
            }
            else if (i == 0) {
                System.out.print(integers[i]);
            }
        }
        System.out.println();
        for (int i = lenghtFractionalNumbers; i >= 0; i--) {
            if(i > 0) {
                System.out.print(fractionalNumbers[i] + ",");
            }
            else if (i == 0) {
                System.out.print(fractionalNumbers[i]);
            }
        }
        System.out.println();
        for (int i = lenghtIntegerArray; i >= 0; i--) {
            if(i > 0) {
                System.out.print(integerArray[i] + ",");
            }
            else if (i == 0) {
                System.out.print(integerArray[i]);
            }
        }
        System.out.println();
        System.out.println("TaskFour");
        // Вариант 1 - код громосткий, но с учетом полученных знаний.
        for (int i = 0; i <= lenghtIntegers; i++) {
            if(i < lenghtIntegers) {
                if (integers[i] % 2 == 0 ) {
                    System.out.print(integers[i] + ",");
                }
                else{
                    integers[i] += 1;
                    System.out.print(integers[i] + ",");
                }
            }
            else if (i == lenghtIntegers) {
                if(integers[i] % 2 == 0 ) {
                    System.out.print(integers[i]);
                }
                else{
                    integers[i] += 1;
                    System.out.print(integers[i]);
                }
            }
        }
        //Вариант 2 намного лаконичнее,но мы еще не изучали библиотеки.
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 != 0 ) {
                integers[i] += 1;
                }
        }
        System.out.println(Arrays.toString(integers));
    }
}