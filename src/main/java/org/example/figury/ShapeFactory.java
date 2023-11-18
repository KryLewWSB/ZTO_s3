package org.example.figury;

public class ShapeFactory {
    public Shape createShape(ShapeType shapeType) {
        if (shapeType == null) {
            return null;
        }
        switch (shapeType) {
            case CIRCLE: return new Circle();
            case SQUARE: return new Square();
            default: return null;
        }
    }
}