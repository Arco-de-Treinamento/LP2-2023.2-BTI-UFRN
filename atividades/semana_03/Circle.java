public class Circle {
    float radius;
    
    public Circle(float _radius) {
        radius = _radius;
    }

    public double area() {
        return(Math.PI * Math.pow(radius, 2));
    }

    public double circumference() {
        return(2 * Math.PI * radius);
    }
}
