public class Main {
    public static void main(String[] args) {
        int[] arrayInt = new int[5];
        arrayInt[0] = -34;
        arrayInt[1] = 237;
        arrayInt[2] = 41;
        arrayInt[3] = 7;
        arrayInt[4] = 1;

        double[] arrayDouble = {34.6, 0.66, 17.9, -64.3};

        boolean[] arrayBool = {true, false, false};

//        for (int i = 0; i < arrayInt.length - 1; i++) {
//            System.out.print(arrayInt[i] + ", ");
//        }
//        System.out.println(arrayInt[arrayInt.length - 1]);
//
//        for (int i = 0; i < arrayDouble.length; i++) {
//            if (i == arrayDouble.length - 1) {
//                System.out.print(arrayDouble[i]);
//            } else {
//                System.out.print(arrayDouble[i] + ", ");
//            }
//        }
//        System.out.println();
//        int counter = arrayBool.length-1;
//        while (counter>0){
//            System.out.println(arrayBool[counter]+",");
//            counter--;
//        }
//        System.out.println(arrayBool[0]);

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 != 0) arrayInt[i]++;
            System.out.print(arrayInt[i]+" ");
        }
    }
}

