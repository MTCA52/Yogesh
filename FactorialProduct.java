import java.util.Scanner;

class Number {
    private int n1;

    public void setn1(int n1) {
        this.n1 = n1;
    }

    public int getn1() {
        return this.n1;
    }

    public int factorial() {
        int fact = 1;
        for (int i = 1; i <= n1; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public int productDigit() {
        int product = 1;
        int n = n1;
        while (n > 0) {
            product = product * (n % 10);
            n = n / 10;
        }
        return product;
    }
}

class FactorialProduct {
    public static void main(String[] args) {
        Number ob1 = new Number();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int temp = sc.nextInt();
        ob1.setn1(temp);
        int fact = ob1.factorial();
        int product = ob1.productDigit();
        System.out.println("Factorial of " + ob1.getn1() + " is " + fact);
        System.out.println("Product of digits of " + ob1.getn1() + " is " + product);
    }
}