package awt;
import javafx.*;

import javafx.scene.control.Button;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import static javafx.scene.paint.Color.BLUE;
import javafx.scene.paint.*;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AWT extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        
        javafx.geometry.Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
        double x = bounds.getMinX() + (bounds.getWidth() - stage.getWidth()) / 2.0;
        double y = bounds.getMinY() + (bounds.getHeight() - stage.getHeight()) / 2.0;
        
        Button button1 = new Button("dugme");
        
        StackPane layout = new StackPane();
        layout.getChildren().add(button1);
        Scene scene = new Scene(layout, 500, 500);
        scene.setFill(Color.BLUE);
        
        stage.setScene(scene);
        stage.setX(x);
        stage.setY(y);
        stage.initStyle(StageStyle.DECORATED);
        
        stage.show();
        
    }
}
