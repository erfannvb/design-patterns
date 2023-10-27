package nvb.dev.decorator;

public class LineStyleDecorator extends ShapeDecorator {

    protected LineStyle lineStyle;

    public LineStyleDecorator(Shape decoratedShape, LineStyle lineStyle) {
        super(decoratedShape);
        this.lineStyle = lineStyle;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Line style : " + lineStyle);
    }

    // no change in the functionality
    @Override
    public void resize() {
        decoratedShape.resize();
    }

    @Override
    public String description() {
        return decoratedShape.description() + " drawn with " + lineStyle + " style.";
    }

    // no change in the functionality
    @Override
    public boolean isHidden() {
        return decoratedShape.isHidden();
    }
}
