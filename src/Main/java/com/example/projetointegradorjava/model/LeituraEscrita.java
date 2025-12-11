package com.example.projetointegradorjava.model;

import com.example.projetointegradorjava.HelloApplication;

import com.example.projetointegradorjava.model.VeiculoRegistro;
import com.example.projetointegradorjava.model.repository.VeiculoRepository;
import javafx.application.Application;

import javax.swing.*;
import java.util.Scanner;

public class LeituraEscrita {

    public static void LeituraEscritaF() {


        VeiculoRegistro veiculoRegistro = new VeiculoRegistro();
        HelloApplication helloApplication = new HelloApplication();


        veiculoRegistro.placa = helloApplication.textPlaca;
        veiculoRegistro.modelo = helloApplication.textModelo;
        veiculoRegistro.proprietario = helloApplication.textProprietario;



        System.out.println(veiculoRegistro.placa);
        System.out.println(veiculoRegistro.modelo);
        System.out.println(veiculoRegistro.proprietario);







        VeiculoRepository veiculoRepository = new VeiculoRepository();
        veiculoRepository.veiculoRegistro = veiculoRegistro;
        veiculoRepository.gravar();


    }

}
