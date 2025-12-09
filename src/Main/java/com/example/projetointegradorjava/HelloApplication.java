package com.example.projetointegradorjava;

import javafx.application.Application;
import javafx.geometry.Insets;
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



        stage.setWidth(600);
        stage.setOnCloseRequest(e -> {

        });
        stage.setResizable(false);

        //Scene Menu

        VBox root = new VBox();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Hello World!");

        //Scene Registrar entrada

        //TABELa e TITULO "Lista de veículos"


        VBox listaDeVeiculos = new VBox();
        Label labelLista = new Label("Lista de Veículos");
        labelLista.setStyle("-fx-font-size: 20");
        labelLista.setPadding(new Insets(10, 0, 5, 35));
        listaDeVeiculos.getChildren().add(labelLista);

        ListView tabelaVeiculos = new ListView();
        tabelaVeiculos.setPrefHeight(200);
        tabelaVeiculos.setPrefWidth(200);
        tabelaVeiculos.setPadding(new Insets(10, 10, 10, 10));
        listaDeVeiculos.getChildren().add(tabelaVeiculos);
        listaDeVeiculos.setSpacing(15);


        HBox hBoxPrincipal = new HBox();
        hBoxPrincipal.getChildren().addAll(listaDeVeiculos);


        //Tabela de butões
        VBox vBoxButton = new VBox();
        Button registrarEntrada = new Button("Registrar Entrada");

        registrarEntrada.setOnAction(e -> {
            //Tela RegistrarEntrada

            TextField placa;
            TextField modelo;
            TextField proprietario;
            Button registrar;
            Button voltar;

            Stage novaJanela = new Stage();
            novaJanela.setResizable(false);

            VBox root2 = new VBox(new Button("Sou outra janela!"));
            Scene cena = new Scene(root2, 250, 150);

            VBox centralizador = new VBox();

            //Text Field


            placa = new TextField();
            modelo = new TextField();
            proprietario = new TextField();

            centralizador.getChildren().addAll(placa, modelo, proprietario);



            novaJanela.setScene(cena);
            novaJanela.setTitle("Nova Janela");

            root2.getChildren().add(centralizador);
            novaJanela.show();
                });

        // vBoxButton.setSpacing(20);
        //vBoxButton.setPadding(new Insets(90, 0, 0, 70));

       // Button registrarEntrada = new Button("Registrar entrada");
        vBoxButton.getChildren().add(registrarEntrada);

        //Button registrarSaida = new Button("Registrar Saida e pagamento");
        //vBoxButton.getChildren().add(registrarSaida);

        //hBoxPrincipal.getChildren().add(vBoxButton);

        //setando butões


        //MOSTRAR

        //Scene Registrar entrada

        root.getChildren().add(hBoxPrincipal);
        root.getChildren().add(vBoxButton);


        stage.show();


    }

    public void criarTela2(Stage stage2) {

        stage2.setWidth(600);
        stage2.setOnCloseRequest(e -> {
            e.consume();
        });
        stage2.setResizable(false);

        //Scene Menu

        VBox root2 = new VBox();
        Scene scene2 = new Scene(root2);
        stage2.setScene(scene2);
        stage2.setTitle("Olá!");

    }

    //mOSTRAR TELA2


}

