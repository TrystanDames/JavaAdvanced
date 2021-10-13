public class NumericFns<T> {
    T num;

    // Pass the constructor a reference to
    // a numeric object.
    NumericFns(T n) {
        num = n;
    }

    // Return the reciprocal.
    double reciprocal() {
        return 1 / num.doubleValue(); // Error!
    }

    // Return the fractional component.
    double fraction() {
        return num.doubleValue() - num.intValue(); // Error!
    }
}
