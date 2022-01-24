/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class JavaFXApplication4 extends Application {
    BorderPane p;
    @Override
    public void start(Stage stage){
     p=new BorderPane();
     MenuBar bar=new MenuBar();
     p.setTop(bar);
     
     Scene s=new Scene(bar, 700,700);
     stage.setScene(s);
     stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
