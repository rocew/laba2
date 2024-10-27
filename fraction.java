public class fraction {
    // Свойства класса
    private int numerator;
    private int denominator;

    public fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public fraction add(fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new fraction(newNumerator, newDenominator);
    }

    public fraction add(int number) {
        return add(new fraction(number, 1));
    }

    public fraction subtract(fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new fraction(newNumerator, newDenominator);
    }

    public fraction subtract(int number) {
        return subtract(new fraction(number, 1));
    }

    public fraction multiply(fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new fraction(newNumerator, newDenominator);
    }

    public fraction multiply(int number) {
        return multiply(new fraction(number, 1));
    }

    public fraction divide(fraction other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно.");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new fraction(newNumerator, newDenominator);
    }

    public fraction divide(int number) {
        if (number == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно.");
        }
        return divide(new fraction(number, 1));
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        this.denominator = denominator;
    }
}
