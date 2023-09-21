package com.example.animalguesser.view;

import com.example.animalguesser.Main;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class Home {

    private Scene homeScene;

    public Home() {
        Pane container = new Pane();
        container.setStyle("-fx-background-color: #d3d3d3");

        int center = Main.applicationSize[0]/2;
        int barWidth = Main.applicationSize[0];

        Text title = new Text("Animal Akinator");
        title.setStyle("-fx-font-size: 30px");
        title.relocate(center-85, 30);
        title.setTextAlignment(TextAlignment.CENTER);
        title.setFill(Color.WHITE);

        Pane topBar = new Pane();
        topBar.setStyle("-fx-background-color: #4b4b4b; ");
        topBar.setPrefSize(barWidth, 60);
        topBar.relocate(0, 0);
        topBar.getChildren().add(title);

        TextField searchbar = new TextField("");
        searchbar.setPrefSize(400, 50);
        searchbar.setStyle("-fx-font-size:18");
        searchbar.relocate(center-315,80);

        GridPane grMovies = new GridPane();
        grMovies.setPrefSize(500, 500);
        grMovies.setVgap(20);
        grMovies.setHgap(30);
        String imgURL = "https://image.tmdb.org/t/p/w200/";

        Button btnSearch = new Button("Search");
        btnSearch.relocate(center+95,80);
        btnSearch.setPrefSize(150, 49);
        btnSearch.setStyle("-fx-font-size:20");
        btnSearch.setOnAction(e ->{
            grMovies.getChildren().clear();
            if(!searchbar.getText().trim().isEmpty()) {
        }});

        Pane gridPane = new Pane();
        gridPane.setPrefSize(barWidth, 900);
        gridPane.relocate(0, 150);
        gridPane.getChildren().add(grMovies);

        container.getChildren().addAll(searchbar, btnSearch, topBar, gridPane);

        homeScene = new Scene(container, Main.applicationSize[0], Main.applicationSize[1]);
    }
    //homescene ophalen
    public Scene getHomeScene() {
        return homeScene;
    }
}
