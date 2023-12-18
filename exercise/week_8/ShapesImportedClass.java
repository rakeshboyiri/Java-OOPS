import javax.sound.midi.Track;

import org.Shapes.Circle;
import org.Shapes.Square;
import org.Shapes.Triangle;
public class ShapesImportedClass {
    public static void main(String args[]){
        Circle c = new Circle();
        c.area(10);

        Square square = new Square();
        square.area(10);

        Triangle triangle = new Triangle();
        triangle.area(10,20);
    }
}
