package Part1Demonstrations;
public class Part1Demonstrations {
    public static void main(String[] args) {
        printNumberBackward(9);
        System.out.println();
        printNumber(9);
        //errorDem(1);
    }
    public static void printNumberBackward(int n) {
        if (n < 1) {
        } else {
            System.out.println(n);
            printNumberBackward(n - 1);
            }
        }
        public static void printNumber(int n) {
        if (n < 1) {
        } else {
            printNumber(n-1);
            System.out.println(n);
        }
        }
        public static void errorDem(int n) {
        System.out.println(n);
        errorDem(n + 1);
        }
    }