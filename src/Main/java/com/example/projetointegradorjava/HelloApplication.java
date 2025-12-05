package com.example.projetointegradorjava;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {



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


        VBox listaDeVeiculos = new VBox();
        Label labelLista  = new Label("Lista de Veículos");
        listaDeVeiculos.getChildren().add(labelLista);

        ListView tabelaVeiculos = new ListView();
        tabelaVeiculos.setPrefHeight(200);
        tabelaVeiculos.setPrefWidth(200);
        listaDeVeiculos.getChildren().add(tabelaVeiculos);


        HBox hBoxPrincipal = new HBox();
        hBoxPrincipal.getChildren().addAll(listaDeVeiculos);


        //Tabela de butões
        VBox vBoxButton = new VBox();

        Button registrarEntrada = new Button("Registrar entrada");
        vBoxButton.getChildren().add(registrarEntrada);

        Button registrarSaida = new Button("Registrar Saida e pagamento");
        vBoxButton.getChildren().add(registrarSaida);

        hBoxPrincipal.getChildren().add(vBoxButton);



        //MOSTRAR

        root.getChildren().add(hBoxPrincipal);


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