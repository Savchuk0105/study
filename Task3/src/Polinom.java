import java.util.Arrays;

class Polynom {
    private double[] coeff;

    public Polynom(double[] coeff) {
        this.coeff = coeff;
    }

    public int degree() {
        return coeff.length - 1;
    }
    public Polynom summPolynoms(Polynom other) {
        int maxDegree = Math.max(this.degree(), other.degree());
        double[] resultCoeff = new double[maxDegree + 1];

        for (int i = 0; i <= this.degree(); i++) {
            resultCoeff[i] += this.coeff[i];
        }

        for (int i = 0; i <= other.degree(); i++) {
            resultCoeff[i] += other.coeff[i];
        }

        return new Polynom(resultCoeff);
    }

    public Polynom subtractPolynoms(Polynom other) {
        int maxDegree = Math.max(this.degree(), other.degree());
        double[] resultCoefficients = new double[maxDegree + 1];

        for (int i = 0; i <= this.degree(); i++) {
            resultCoefficients[i] += this.coeff[i];
        }

        for (int i = 0; i <= other.degree(); i++) {
            resultCoefficients[i] -= other.coeff[i];
        }

        return new Polynom(resultCoefficients);
    }

    public Polynom multiplyPolinoms(Polynom other) {
        int resultDegree = this.degree() + other.degree();
        double[] resultCoefficients = new double[resultDegree + 1];

        for (int i = 0; i <= this.degree(); i++) {
            for (int j = 0; j <= other.degree(); j++) {
                resultCoefficients[i + j] += this.coeff[i] * other.coeff[j];
            }
        }

        return new Polynom(resultCoefficients);
    }

    public Polynom[] dividePolynoms(Polynom other) {
        if (other.degree() == 0 && other.coeff[0] == 0) {
            throw new ArithmeticException("Деление на нулевой полином");
        }

        int quotientDegree = this.degree() - other.degree();
        if (quotientDegree < 0) {
            return new Polynom[] { new Polynom(new double[] {0}), this };
        }

        double[] quotientCoeff = new double[quotientDegree + 1];
        double[] remainderCoeff = Arrays.copyOf(this.coeff, this.coeff.length);

        for (int i = quotientDegree; i >= 0; i--) {
            double coeff = remainderCoeff[i + other.degree()] / other.coeff[other.degree()];
            quotientCoeff[i] = coeff;

            for (int j = 0; j <= other.degree(); j++) {
                remainderCoeff[i + j] -= coeff * other.coeff[j];
            }
        }

        return new Polynom[] { new Polynom(quotientCoeff), new Polynom(remainderCoeff) };
    }

    public static Polynom sum(Polynom[] polynomials) {
        if (polynomials.length == 0) {
            return new Polynom(new double[] {0});
        }

        Polynom result = polynomials[0];
        for (int i = 1; i < polynomials.length; i++) {
            result = result.summPolynoms(polynomials[i]);
        }

        return result;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = degree(); i >= 0; i--) {
            if (coeff[i] != 0) {
                if (sb.length() > 0) {
                    sb.append(" + ");
                }
                sb.append(coeff[i]);
                if (i > 0) {
                    sb.append("x^").append(i);
                }
            }
        }
        return sb.toString();
    }
}