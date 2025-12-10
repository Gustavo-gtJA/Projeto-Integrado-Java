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



        VeiculoRepository veiculoRepository = new VeiculoRepository();
        veiculoRepository.veiculoRegistro = veiculoRegistro;
        veiculoRepository.gravar();
        veiculoRepository.exibirVeiculo();

    }

}
