public class Square implements Shape {

    private double oldalMeretCm;

    public Square(double oldalMeret) {
        this.oldalMeretCm = oldalMeret;
    }

    @Override
    public double getPerimeter() {
        return 4 * oldalMeretCm;
    }

    @Override
    public double getArea() {
        return oldalMeretCm * oldalMeretCm;
    }

    public double getOldalMeret() {
        return oldalMeretCm;
    }

    public void setOldalMeret(double oldalMeret) {
        this.oldalMeretCm = oldalMeret;
    }
}
