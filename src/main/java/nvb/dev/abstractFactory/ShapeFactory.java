package nvb.dev.abstractFactory;

public class ShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(ShapeType shapeType) {
        if (shapeType.equals(ShapeType.SQUARE)) {
            return new Square();
        } else if (shapeType.equals(ShapeType.RECTANGLE)) {
            return new Rectangle();
        }
        return null;
    }

}
