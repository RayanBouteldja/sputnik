package pl.touk.sputnik;

public class NewFunction {
    private int num1;
    private int num2;

    public NewFunction(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sum() {
        return num1 + num2;
    }

    public int substraction() {
        return num1 - num2;
    }

    public int multiplication() {
        return num1 * num2;
    }

    public void setNum1(int number) {
        num1 = number;
    }

    public void setNum2(int number) {
        num2 = number;
    }

    public int getNum1() {
        return this.num1;
    }

    public int getNum2() {
        return this.num2;
    }
}