package exercise.lsp;
import exercise.ocp.*;
import org.junit.Test;

public class LspTest {

    @Test
    public void resizeRectangleTest() {

       exercise.ocp.Rectangle rec = new Rectangle(4, 5);
       RectangleResizer.resize(rec,7,8);
       assert(rec.getHeight()==5);
       assert (rec.getWidth()==6);
    }

    @Test
    public void resizeSquareTest() {

        assert false;
    }
}