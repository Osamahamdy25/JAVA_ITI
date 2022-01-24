
/*******************GUI Using CSS************************/
package day6_ex2;

import java.io.File;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Osama Hamdy
 */
public class Day6_ex2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Reflection  reflect = new Reflection();
        reflect.setFraction(0.8);
       
        Text txt = new Text("Hello World");
        txt.setId("text");
        txt.setEffect(reflect);
        
        Rectangle rect = new Rectangle(0,0,500,350);   
        rect.setId("rectangle");
        
        StackPane root = new StackPane();
        root.getChildren().add(rect);
        root.getChildren().add(txt);
        
        Scene scene = new Scene(root, 500, 350);
      /*  scene.getStylesheets().clear();
        scene.getStylesheets().add(getClass().getResource("/CSS/CSS_EX2.css").toExternalForm());*/
      
         File  f=new File("src/csspkg/CSS_EX2.css");
        scene.getStylesheets().clear();
        scene.getStylesheets().add("file:///"+f.getAbsolutePath().replace("\\","/"));
        primaryStage.setTitle("OSAMA");
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}