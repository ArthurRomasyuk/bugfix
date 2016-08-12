package bug_6;

public class IncorrectCalculating {


    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(new Calculator(a, b).add(a, b, 2));
    }


}


class Calculator {

    private int number1;
    private int number2;

    public Calculator() {
    }

    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }


    public int add(int a, int b) {
        return a + b;
    }

    public int add() {
        return this.number1 + this.number2;
    }

    public int add(int... numbers) {
        int sum = 0;
        try {
            for (int n : numbers) {
                sum += n;
            }

        } finally {
            return sum;
        }

    }
    //не понял, что здесь исправлять, если и так понятно, что изза finally нам выкидывается рэндомное число, я решил
    //просто убрать return (int) (Math.random() * 10 + 1); и вставить return sum; вместо него



}