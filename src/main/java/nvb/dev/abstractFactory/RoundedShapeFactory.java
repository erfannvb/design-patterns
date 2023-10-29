package nvb.dev.abstractFactory;

public class RoundedShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(ShapeType shapeType) {
        if (shapeType.equals(ShapeType.SQUARE)) {
            return new RoundedSquare();
        } else if (shapeType.equals(ShapeType.RECTANGLE)) {
            return new RoundedRectangle();
        }
        return null;
    }

}
