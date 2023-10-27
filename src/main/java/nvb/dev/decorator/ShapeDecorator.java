package nvb.dev.decorator;

public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    protected ShapeDecorator(Shape decoratedShape) {
        super();
        this.decoratedShape = decoratedShape;
    }

}
