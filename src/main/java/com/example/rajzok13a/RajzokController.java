package com.example.rajzok13a;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class RajzokController implements Initializable {
    @FXML public MenuItem menuItemMegnyitas;
    @FXML public MenuItem menuItemMentes;
    @FXML public MenuItem menuItemKilepes;
    @FXML public MenuItem menuItemKulonbozo;
    @FXML public MenuItem menuItemEgyforma;
    @FXML public MenuItem menuItemElso;
    @FXML public MenuItem menuItemNevjegy;
    @FXML public ImageView imageView1;
    @FXML public ImageView imageView2;
    @FXML public ImageView imageView3;
    @FXML public ImageView imageView4;
    @FXML public Button buttonHozzaad;
    @FXML public Button buttonModosit;
    @FXML public Button buttonTorol;
    @FXML public ListView<String> listview;

    // store data
    public String[] nev = { "Baba", "Hajó", "Hintaló", "Nyuszi", "Repülő", "Tirex", "Vonat" };
    public String[] kepnev = { "baba", "hajo", "hintalo", "nyuszi", "repulo", "tirex", "vonat" };
    public Image[] kep = new Image[7];

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // load initial images
        for (int i=0; i<kep.length; i++) {
           kep[i] = new Image("file:rajzok/"+kepnev[i]+".png");

           if (Objects.equals(kepnev[i], "baba")) imageView1.setImage(kep[i]);
           if (Objects.equals(kepnev[i], "vonat")) imageView2.setImage(kep[i]);
           if (Objects.equals(kepnev[i], "hajo")) imageView3.setImage(kep[i]);
           if (Objects.equals(kepnev[i], "hintalo")) imageView4.setImage(kep[i]);
        }

        // TODO - style image squares
        // TODO - add button images

        //

    }

    public void handleKilepes() {
        Platform.exit();
    }
}