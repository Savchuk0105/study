public class Flower {
    private Bud bud;

    public Flower(Bud bud) {
        this.bud = bud;
    }

    public void bloom() {
        bud.bloom();
        System.out.println("Цветок расцвел.");
    }

    public void wither() {
        bud.wither();
        System.out.println("Цветок завял.");
    }

    public void displayBudColor() {
        bud.showColor();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return bud.equals(flower.bud);
    }

    @Override
    public int hashCode() {
        return bud.hashCode();
    }

    @Override
    public String toString() {
        return "Flower{bud=" + bud + "}";
    }
}