public class App {
    public static void main(String[] args) {
        Par p1 = new Par<String, String>("#kdjv3q", "Dino");
        Par p2 = new Par<String, Double>("PI", 3.14);
        Par p3 = new Par<Integer, String>(1, "Um");
        Par p4 = new Par<Float, Float>(2.4f, 2.5f);
        Par p5 = new Par<Integer, Integer>(2, 3);

        p1.toString();
        p2.toString();
        p3.toString();
        p4.toString();
        p5.toString();
    }
}