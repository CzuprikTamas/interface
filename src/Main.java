public class Main {
    public static void main(String[] args) {
        Shape myShape = new Circle(3);
        System.out.println("A kor kerülete: " + myShape.getPerimeter());
        System.out.println("A kor területe: " + myShape.getArea());

        Shape yourShape = new Square(46);
            System.out.println("A negyzet kerülete: " + yourShape.getPerimeter());
            System.out.println("A negyzet területe: " + yourShape.getArea());
    }
}
