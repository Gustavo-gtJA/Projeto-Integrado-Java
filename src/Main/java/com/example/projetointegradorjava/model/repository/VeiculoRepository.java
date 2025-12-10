package com.example.projetointegradorjava.model.repository;

import com.example.projetointegradorjava.model.VeiculoRegistro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class VeiculoRepository {

    public VeiculoRegistro veiculoRegistro;

    public Path arquivo = Paths.get("/Users/25203634/Documents/teste/dados.csv");

    public void gravar(){
        try {
            Files.writeString(arquivo, veiculoRegistro.separarDadosVeiculo(), StandardOpenOption.APPEND);
            System.out.println("Contato gravado com sucesso!");
        } catch (IOException erro) {
            erro.printStackTrace();
        }

    }

    public void exibirVeiculo(){
        try {
            List<String> linhas = Files.readAllLines(arquivo);

            for(String linha : linhas){
                String[] linhaRegistro = linha.split(";");
                System.out.println("Placa: " + linhaRegistro[1]);
                System.out.println("Veículo: " + linhaRegistro[2]);
                System.out.println("Proprietário: " + linhaRegistro[3]);
                System.out.println("-----------------------------------");


            }

            System.out.println("Contato exibido com sucesso!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
