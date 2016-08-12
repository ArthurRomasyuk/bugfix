package bug_5;

public class ArrayOutOfBoundExceptionTest {

    public static void main(String args[]) {
        int ram[] = {1, 2, 3, 4, 5};
        changeArray(ram);
        for (int y : ram) System.out.println(y);

    }

    public static void changeArray(int x[]) {
        for (int count = 0; count < x.length; count++) {
            x[count] += 5;
        }

        for (int j : x) {
            System.out.println(j);
        }

        /**проблема была в
         *         for (int j : x) {System.out.println(x[j]);}
         *         так как в данной форме цикла for  переменная j принимает значение каждой ячейки массива по очереди, а не
         *         порядковый номер его каждой ячейки, по этому для вывода массива на экран необхдимо использовать
         *                     System.out.println(j);
         */
    }

}
