package lesson6.lesson.enums;

public class Program {

    public static void main(String[] args) {

        Operation op = Operation.SUM;
        System.out.println(op.action(10, 4));
        op = Operation.MULTIPLY;
        System.out.println(op.action(6, 4));
        op = Operation.SUBTRACT;
        System.out.println(op.action(11, 5));
    }
}

enum Operation {
    SUM {
        public int action(int x, int y) {
            return x + y;
        }
    },
    SUBTRACT {
        public int action(int x, int y) {
            return x - y;
        }
    },
    MULTIPLY {
        public int action(int x, int y) {
            return x * y;
        }
    };

    public abstract int action(int x, int y);
}