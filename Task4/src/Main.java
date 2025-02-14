public class Main {
    public static void main(String[] args) {
        Petal petal1 = new Petal("Red");
        Petal petal2 = new Petal("Yellow");

        Bud bud = new Bud();
        bud.addPetal(petal1);
        bud.addPetal(petal2);

        Flower flower = new Flower(bud);

        flower.displayBudColor();
        flower.bloom();
        flower.wither();
    }
}