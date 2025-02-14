import java.util.ArrayList;
import java.util.List;

public class Bud {
    private List<Petal> petals;
    private boolean isBloomed;

    public Bud() {
        this.petals = new ArrayList<>();
        this.isBloomed = false;
    }

    public void addPetal(Petal petal) {
        petals.add(petal);
    }

    public void bloom() {
        this.isBloomed = true;
    }

    public void wither() {
        this.isBloomed = false;
    }

    public void showColor() {
        if (petals.isEmpty()) {
            System.out.println("Бутон не имеет лепестков.");
        } else {
            System.out.println("Цвет бутона: " + petals.get(0).getColor());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bud bud = (Bud) o;
        return isBloomed == bud.isBloomed && petals.equals(bud.petals);
    }

    @Override
    public int hashCode() {
        return petals.hashCode() + Boolean.hashCode(isBloomed);
    }

    @Override
    public String toString() {
        return "Bud{petals=" + petals + ", isBloomed=" + isBloomed + "}";
    }
}