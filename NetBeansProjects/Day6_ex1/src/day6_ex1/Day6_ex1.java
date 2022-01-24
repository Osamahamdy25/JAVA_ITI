/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6_ex1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Osama Hamdy
 */
public class Day6_ex1 extends Application {
    
    /**
     *
     * @param primaryStage
     */
    @Override
    public void start(Stage primaryStage) {
        Reflection reflect = new Reflection();
        reflect.setFraction(0.8);
        
        Stop[] stop = {new Stop(0, Color.BLACK), 
                       new Stop(0.5, Color.WHITE), 
                       new Stop(1, Color.BLACK)};
        
        LinearGradient lg = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE, stop);
        
        Text txt = new Text("Hello World");
        txt.setFill(Color.RED);
        txt.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.BOLD, 25));
        txt.setEffect(reflect);
        
        Rectangle rect = new Rectangle(0,0,500,350);
        rect.setFill(lg);
        
        StackPane root = new StackPane();
        root.getChildren().add(rect);
        root.getChildren().add(txt);
        
        Scene scene = new Scene(root, 500, 350);
        
        primaryStage.setTitle("OSAMA25");
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
