package com.example.projetointegradorjava;

import com.example.projetointegradorjava.model.LeituraEscrita;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.projetointegradorjava.model.LeituraEscrita.LeituraEscritaF;

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

            TextField textFildPlaca;
            TextField textfieldModelo;
            TextField textfieldProprietario;


            Stage novaJanela = new Stage();
            novaJanela.setResizable(false);

            VBox root2 = new VBox();
            Scene cena = new Scene(root2, 500, 500);

            VBox centralizador = new VBox();

            //Text Field


            textFildPlaca = new TextField();
            textfieldModelo = new TextField();
            textfieldProprietario = new TextField();

            //Butões da tela Registrar Entrada
            HBox hboxButoes = new HBox();
            Button botaoRegistrar = new Button("Registrar");
            botaoRegistrar.setOnAction(actionEvent -> {

                LeituraEscritaF();
            });


            Button botaoVoltar = new Button("Voltar");
            botaoVoltar.setOnAction(event -> {
                novaJanela.close();
            });

            hboxButoes.getChildren().addAll(botaoVoltar, botaoRegistrar);


            centralizador.getChildren().addAll(textFildPlaca, textfieldModelo, textfieldProprietario, hboxButoes);


            novaJanela.setScene(cena);
            novaJanela.setTitle("Nova Janela");

            root2.getChildren().add(centralizador);
            novaJanela.show();

        });

        // Tela Registrar saída

        Button registrarSaida = new Button("Registrar Saida");

        registrarSaida.setOnAction(e -> {

            TextField placaSaida;
            TextField modeloSaida;
            TextField proprietarioSaida;
            Button botaoregistrarSaida;
            Button voltarSaida;

            Stage telaSaida = new Stage();
            telaSaida.setResizable(false);

            HBox root3 = new HBox();
            Scene cenaSaida = new Scene(root3, 500, 500);

            VBox centralizadorSaida = new VBox();

            placaSaida = new TextField();
            modeloSaida = new TextField();
            proprietarioSaida = new TextField();

            VBox botaosaida = new VBox();
            botaoregistrarSaida = new Button("Registrar Saida");
            voltarSaida = new Button("Voltar");
            voltarSaida.setOnAction(event -> {
                telaSaida.close();
            });

            botaosaida.getChildren().addAll(botaoregistrarSaida, voltarSaida);


            telaSaida.setScene(cenaSaida);
            telaSaida.setTitle("Registrar Saída");
            centralizadorSaida.getChildren().addAll(placaSaida, modeloSaida, proprietarioSaida);
            root3.getChildren().addAll(centralizadorSaida, botaosaida);
            telaSaida.show();


        });


        vBoxButton.getChildren().addAll(registrarEntrada, registrarSaida);
        root.getChildren().add(hBoxPrincipal);
        root.getChildren().add(vBoxButton);


        stage.show();


    }



    }








