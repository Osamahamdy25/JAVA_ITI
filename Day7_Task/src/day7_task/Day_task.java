/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7_task;


import java.io.File;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class Day_task extends Application {

    /* Text Area */
    TextArea TA = new TextArea();

    /* The Menu Bar */
    MenuBar bar = new MenuBar();

    /* File Menu */
    Menu file = new Menu("File");
   
    MenuItem cnew = new MenuItem("New");
    MenuItem open = new MenuItem("Open...");
    MenuItem save = new MenuItem("Save");
    MenuItem exit = new MenuItem("Exit");

    /* Edit Menu */
    Menu edit = new Menu("Edit");

    MenuItem undo = new MenuItem("Undo");
    MenuItem cut = new MenuItem("Cut");
    MenuItem copy = new MenuItem("Copy");
    MenuItem paste = new MenuItem("Paste");
    MenuItem delete = new MenuItem("Delete");
    MenuItem sall = new MenuItem("Select All");
    //SeparatorMenuItem sep = new SeparatorMenuItem();

    /* Help Menu */
    Menu help = new Menu("Help");

    MenuItem anp = new MenuItem("About Notepad");
    MenuItem cmp = new MenuItem("Java Compile");
    Alert alert = new Alert(AlertType.INFORMATION);
    /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

    @Override
    public void start(Stage primaryStage) {
       
        /* Hotkeys */ // Shortcuts 
        cnew.setAccelerator(KeyCombination.keyCombination("Ctrl+N"));
        open.setAccelerator(KeyCombination.keyCombination("Ctrl+O"));
        save.setAccelerator(KeyCombination.keyCombination("Ctrl+S"));
        
        /* MenuItems Action */
        
        /* Creating New File */
        cnew.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                TA.clear();
            }
        });
        
        /* Opening a File */
        open.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
             
                FileChooser fc = new FileChooser();

               FileChooser.ExtensionFilter exf = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
                fc.getExtensionFilters().add(exf);
                
                 File f=fc.showOpenDialog(primaryStage);
               
                System.out.println(f.getAbsoluteFile());
            }
        });
        

        /* Saving a File */
        save.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
             
                FileChooser fc = new FileChooser();

                FileChooser.ExtensionFilter exf = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
                fc.getExtensionFilters().add(exf);
                
             File f=  fc.showSaveDialog(primaryStage);
                System.out.println(f.getAbsolutePath());
            }
        });
        

        /* Exiting The file */
        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                Platform.exit();
            }
        });
        
        /* Undo Text */
        undo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                TA.undo();
            }
        });
        
        /* Cut Text */
        cut.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                TA.cut();
            }
        });
        
        /* Copy Text */
        copy.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                TA.copy();
            }
        });
        
        /* Paste Text */
        paste.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                TA.paste();
            }
        });
        
        /* Delete Text */
        delete.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                TA.deleteText(TA.getSelection());
            }
        });
        
        /* Select All Text */
        sall.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                TA.selectAll();
            }
        });
        
        /* About Notepad Dialog */
        anp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                
               
                alert.setTitle("About Notepad");
                alert.setHeaderText("Created by Osama Hamdy ");
                alert.setContentText("Version 0.1");

                alert.showAndWait();
            }
        });        


        cmp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
             
            }
        });        
        
        /* Adding SubMenus in Menus */
        file.getItems().addAll(cnew, open, save, exit);
        edit.getItems().addAll(undo, cut, copy, paste, delete, sall);
        help.getItems().addAll(anp, cmp);
        
        /* Adding Menus in MenuBar */
        bar.getMenus().addAll(file, edit, help);
        
        /* Creating a panel */
        BorderPane pane = new BorderPane();
        pane.setTop(bar); // Setting the bar in top
        pane.setCenter(TA); // Setting the Text in Center
        Scene scene = new Scene(pane, 700, 400);
        primaryStage.setTitle("Untitled - NotePad"); // Naming the Application
        primaryStage.setScene(scene); 
        primaryStage.show(); 
    };
        

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
