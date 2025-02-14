public class Main {
    public static void main(String[] args) {
        Polynom p1 = new Polynom(new double[] {1, 2, 3});
        Polynom p2 = new Polynom(new double[] {0, 1, 4});

        Polynom sum = p1.summPolynoms(p2);
        Polynom difference = p1.subtractPolynoms(p2);
        Polynom product = p1.multiplyPolinoms(p2);
        Polynom[] divisionResult = p1.dividePolynoms(p2);

        System.out.println("Сумма полиномов: " + sum);
        System.out.println("Разность полиномов: " + difference);
        System.out.println("Произведение полиномов: " + product);
        System.out.println("Частное: " + divisionResult[0]);
        System.out.println("Остаток: " + divisionResult[1]);

        Polynom[] polynomials = {p1, p2};
        Polynom totalSum = Polynom.sum(polynomials);
        System.out.println("Сумма всех полиномов: " + totalSum);
    }
}