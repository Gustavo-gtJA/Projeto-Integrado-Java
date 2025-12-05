package com.example.projetointegradorjava;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    ListView listaCarros = new ListView();

    TextField textField;

    @Override
    public void start(Stage stage) throws IOException {
        //  FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        // Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        //stage.setTitle("Hello!");
        //stage.setScene(scene);
        //stage.show();


        stage.setHeight(550);
        stage.setWidth(550);
        stage.setOnCloseRequest(e -> {
            fechar();
            e.consume();
        });

        VBox root = new VBox();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Hello World!");

        //TABELa e TITULO "Lista de veículos"
        VBox ListaDeVeiculos = new VBox();


        //Tabela de butões


        //MOSTRAR
        root.getChildren().add(ListaDeVeiculos);
        stage.show();




    }

    public void fechar() {
        Alert alertaFechar = new Alert(
                Alert.AlertType.CONFIRMATION,
                "Confirna a saida do sistema?",
                ButtonType.YES,
                ButtonType.NO
        );
    }
}