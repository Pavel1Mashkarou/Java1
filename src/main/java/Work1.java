import java.util.Random;

public class Work1 {

    static int searchRandomInt() {
        int i = new Random().nextInt(2001);
        return i;
    }

    static int getIndex(int i){
        if (i==0) return 0;
        int len = Integer.toBinaryString(i).length();
        Integer index = Integer.toBinaryString(i).indexOf('1');
        return len - index -1;
    }

    static int[] getArray1(int i, int n){
        int count = 0;
        for (int j = i;j <= Short.MAX_VALUE; j++){
            if ( j%n == 0) count++;
        }

        int[] array1 = new int[count];

        int index = 0;

        for (int j = i;j <= Short.MAX_VALUE; j++){
            if ( j % n == 0){
                array1[index] = j;
                index++;
            }
        }
        return array1;
    }

    static int[] getArray2(int i, int n){
        int count = 0;
        for (int j = Short.MIN_VALUE;j <= i; j++){
            if ( j%n != 0) count++;
        }

        int[] array2 = new int[count];

        int index = 0;

        for (int j = Short.MIN_VALUE;j <= i; j++){
            if ( j % n != 0){
                array2[index] = j;
                index++;
            }
        }
        return array2;
    }
    static void printArr(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        //1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int i = searchRandomInt();
        System.out.println("i= "+ i);
        //2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n = getIndex(i);
        System.out.println("n= "+n);
        //3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        int[] array1 = getArray1(i,n);
        printArr(array1);
        //4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        int[] array2 = getArray2(i,n);
        printArr(array2);
    }


}

