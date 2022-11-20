public class Beasts implements Animals {
    String name;
    String feature;



    public Beasts(String name, String feature) {
    this.name = name;
    this.feature = feature;
}
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String breathe() {
        return "I breathe with my lungs";
    }

    @Override
    public String move() {
        return "I move on the ground";
    }

    @Override
    public String toString() {
        return name + ": " + breathe() + ", " + move() + ", " + feature;
    }

}
