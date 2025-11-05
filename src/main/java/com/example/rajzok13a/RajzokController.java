package com.example.rajzok13a;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // load initial images
        imageView1.setImage(new Image("file:rajzok/baba.png"));
        imageView2.setImage(new Image("file:rajzok/vonat.png"));
        imageView3.setImage(new Image("file:rajzok/hajo.png"));
        imageView4.setImage(new Image("file:rajzok/hintalo.png"));
        // TODO - style image squares
        // TODO - add button images

        //

    }
}