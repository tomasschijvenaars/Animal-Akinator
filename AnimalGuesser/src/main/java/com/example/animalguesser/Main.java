package com.example.animalguesser;

import com.example.animalguesser.view.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main extends Application {

    private static Stage mainStage;

    public static int[] applicationSize = {1400, 1000};

    @Override
    public void start(Stage primaryStage) throws IOException {

        mainStage = primaryStage;
        mainStage.setResizable(false);
        mainStage.setTitle("Movie Searcher");
        mainStage.centerOnScreen();
        mainStage.show();

        setScene(new Home().getHomeScene());
    }

    public static void main(String[] args) {
        launch();
    }
    public static void setScene(Scene scene) {
        mainStage.setScene(scene);
    }

    //json file ophalen
    //geeft een array met alle gevonden films terug
    /*public static JSONArray searchQuery(String search){
        try
        {
            search = search.replace(' ', '+');

            URL url = new URL("https://api.themoviedb.org/3/search/movie?api_key=0e5eb248e476b4d3e6ef9450ea278529&query=" + search);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();

            if(responseCode !=200)
            {
                throw new RuntimeException("HttpResponceCode: " + responseCode);
            }else
            {
                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                scanner.close();

                JSONParser jParse = new JSONParser();
                JSONObject dataObject = (JSONObject) jParse.parse(String.valueOf(informationString));

                JSONArray resultData = (JSONArray) dataObject.get("results");

                return resultData;
            }

        } catch (Exception e)
        {
            e.printStackTrace();
            System.exit(0);
            return null;
        }
    }*/
}