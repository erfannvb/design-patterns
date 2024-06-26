package nvb.dev.abstractFactory;

public class FactoryProducer {

    private FactoryProducer() {
    }

    public static AbstractFactory getFactory(boolean isRounded) {
        if (isRounded) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }

}
