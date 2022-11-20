public class Fish implements Animals {
    String name;
    String feature;

    public Fish(String name, String feature) {
        this.name = name;
        this.feature = feature;
        }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String breathe() {
        return "I breathe gills";
    }

    @Override
    public String move() {
        return "I swim";
    }

    @Override
    public String toString() {
        return name + ": " + breathe()+", " + move() + ", " + feature;
    }


}
