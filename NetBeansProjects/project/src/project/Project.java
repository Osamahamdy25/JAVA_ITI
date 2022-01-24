/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;

public class Project extends Application {

    /* Important Variables */
    boolean motorMode;
    boolean motorDirection;
    int motorSpeed;

    /* Buttons */
    Button onButton;
    Button offButton;
    Button clkButton;
    Button aclkButton;

    /* Slider */
    Slider speedSlider;

    /* Labels */
    Label speedLabel;
    Label ModeLabel;
    Label DirLabel;


    /* Text */
    Text title;

    /* Images */
    Image imgBackground;
    Image imgDirection1;
    Image imgDirection2;
    ImageView imgviewBackground;
    ImageView imgviewDirection1;
    ImageView imgviewDirection2;

    /* Background */
    BackgroundSize backgroundSize;
    Background background;
    
    /* Panes */
    BorderPane borderPane;
    VBox vb;
    HBox hb;


    @Override
    public void init() throws FileNotFoundException {
        /* ------------------------- Initializing Variables ------------------------- */
        motorMode = false;            // Default Mode is motor OFF
        motorDirection = false;       // Default Direction is Direction1 (Clockwise)
        motorSpeed = 0;               // Default Speed is 0

        /* ------------------------- Initializing Images ------------------------- */
        // Background
        imgBackground = new Image(new FileInputStream("C:\\Users\\hp\\Documents\\NetBeansProjects\\project\\src\\Bk.jpg"));
        imgviewBackground = new ImageView(imgBackground);
        imgviewBackground.setX(0);
        imgviewBackground.setY(0);
        imgviewBackground.setFitHeight(800);
        imgviewBackground.setFitWidth(1300);
        imgviewBackground.setPreserveRatio(true);

        // Direction1 (Clockwise) Button
        imgDirection1 = new Image(new FileInputStream("C:\\Users\\hp\\Documents\\NetBeansProjects\\project\\src\\1.png"));
        imgviewDirection1 = new ImageView(imgDirection1);
        imgviewDirection1.setFitHeight(200);
        imgviewDirection1.setFitWidth(200);

        // Direction2 (Anticlockwise) Button
        imgDirection2 = new Image(new FileInputStream("C:\\Users\\hp\\Documents\\NetBeansProjects\\project\\src\\2.png"));
        imgviewDirection2 = new ImageView(imgDirection2);
        imgviewDirection2.setFitHeight(200);
        imgviewDirection2.setFitWidth(200);

        /* ------------------------- Initializing Texts ------------------------- */
        // Title
        title = new Text("Motor Speed Controller");
        title.setFont(Font.font("Verdana", 50));
        title.setFill(Color.WHITE);
        title.setTranslateY(20);

        /* ------------------------- Initializing Labels ------------------------- */
        // Speed Label
        speedLabel = new Label("0");
        speedLabel.setTextFill(Color.WHITE);
        speedLabel.setFont(Font.font("Verdana", 100));
        speedLabel.setCache(true);
        speedLabel.setFont(Font.font(null,FontWeight.BOLD, 150));
        Reflection r = new Reflection();
        r.setFraction(0.5f);
        r.setTopOffset(-70);
        speedLabel.setEffect(r);

        //Direction Label
        DirLabel = new Label("");
        DirLabel.setTextFill(Color.WHITE);
        DirLabel.setTranslateY(300);
        DirLabel.setTranslateY(-70);
        DirLabel.setTranslateX(550);

        //Mode Label
        ModeLabel = new Label(" Motor Is OFF");
        ModeLabel.setTranslateY(-80);
        ModeLabel.setTranslateX(600);
        ModeLabel.setTextFill(Color.WHITE);

        /* ------------------------- Initializing Buttons ------------------------- */
        // ON Button
        onButton = new Button("ON");
        onButton.setTranslateY(-120);
        onButton.setTranslateX(600);
        onButton.setOnAction(e -> {
            ModeLabel.setText(" Motor Is ON ");
            DirLabel.setText(" Motor Is Working ClockWise ");
        });

        // OFF Button
        offButton = new Button("OFF");
        offButton.setTranslateY(-120);
        offButton.setTranslateX(600);
        offButton.setOnAction(e -> {
            ModeLabel.setText(" Motor Is OFF ");
            DirLabel.setText("");
        });

        // Direction1 (Clockwise) Button
        clkButton = new Button();
        clkButton.setGraphic(imgviewDirection1);
        clkButton.setTranslateX(150);
        clkButton.setTranslateY(250);
        clkButton.setStyle("-fx-background-color: transparent;");
        Reflection rc = new Reflection();
        rc.setFraction(0.4f);
        rc.setTopOffset(-35);
        clkButton.setEffect(rc);

        // Directoin2 (Anticlockwise) Button
        aclkButton = new Button();
        aclkButton.setGraphic(imgviewDirection2);
        aclkButton.setTranslateX(-150);
        aclkButton.setTranslateY(250);
        aclkButton.setStyle("-fx-background-color: transparent;");
        Reflection ra = new Reflection();
        ra.setFraction(0.4f);
        ra.setTopOffset(-35);
        aclkButton.setEffect(ra);

        /* ------------------------- Initializing Slider ------------------------- */
        // Speed Slider
        speedSlider = new Slider();
        speedSlider.setMin(0);
        speedSlider.setMax(100);
        speedSlider.setValue(0);
        speedSlider.setShowTickMarks(true);
        speedSlider.setMaxWidth(500);
        speedSlider.setTranslateY(-100);
        speedSlider.setTranslateX(400);

        /* ------------------------- Initializing Background ------------------------- */
        // Background
        backgroundSize = new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false);
        background = new Background(new BackgroundImage(imgBackground,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                backgroundSize));

	/* ------------------------- Initializing Panes ------------------------- */
        // BorderPane
        borderPane = new BorderPane();

    }

    @Override
    public void start(Stage stage) {
        // Reading speed value from slider
        speedSlider.valueProperty().addListener((ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
            motorSpeed = newValue.intValue();
            speedLabel.setText("" + motorSpeed + "");
        });
        
        
        // Setting Motor Direction as Clockwise
        clkButton.setOnAction((ActionEvent event) -> {
            DirLabel.setText(" Motor Is Working ClockWise ");
            motorDirection = false;
        });

        // Setting Motor Direction as Anticlockwise
        aclkButton.setOnAction((ActionEvent event) -> {
            DirLabel.setText(" Motor Is Working Anti-ClockWise ");
            motorDirection = true;
        });

        /* ------------------------- Nodes Placement ------------------------- */
        // Title
        hb = new HBox(onButton, offButton);
        hb.setSpacing(20);
       
        vb = new VBox(hb,speedSlider, ModeLabel, DirLabel);
       
        borderPane.setTop(title);
        BorderPane.setAlignment(title, Pos.TOP_CENTER);

        // Buttons
        borderPane.setLeft(clkButton);
        borderPane.setRight(aclkButton);

        // Speed Slider
        borderPane.setBottom(vb);
        BorderPane.setAlignment(vb, Pos.BOTTOM_CENTER);

        // Speed Label
        borderPane.setCenter(speedLabel);

        // Background
        borderPane.setBackground(background);

        Scene scene = new Scene(borderPane, 1300, 800);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {

        // Launch Application
        Application.launch(args);
    }
}
