package nvb.dev.decorator;

public class FillColorDecorator extends ShapeDecorator {

    protected Color color;

    public FillColorDecorator(Shape decoratedShape, Color color) {
        super(decoratedShape);
        this.color = color;
    }


    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Fill color : " + color);
    }

    // no change in the functionality
    @Override
    public void resize() {
        decoratedShape.resize();
    }

    @Override
    public String description() {
        return decoratedShape.description() + " filled with " + color + " color.";
    }

    // no change in the functionality
    @Override
    public boolean isHidden() {
        return decoratedShape.isHidden();
    }
}
