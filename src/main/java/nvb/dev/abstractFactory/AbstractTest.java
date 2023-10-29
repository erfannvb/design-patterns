package nvb.dev.abstractFactory;

public class AbstractTest {
    public static void main(String[] args) {

        AbstractFactory factory = FactoryProducer.getFactory(true);
        Shape square = factory.getShape(ShapeType.SQUARE);
        square.draw();

        AbstractFactory factory2 = FactoryProducer.getFactory(false);
        Shape rect = factory2.getShape(ShapeType.RECTANGLE);
        rect.draw();

    }
}
