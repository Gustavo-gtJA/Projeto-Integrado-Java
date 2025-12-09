package com.example.projetointegradorjava.model;

import com.example.projetointegradorjava.model.repository.VeiculoRepository;

import java.util.Scanner;

public class LeituraEscrita {

        public static void main(String[] args) {

            Scanner leitor = new Scanner(System.in);

            VeiculoRegistro veiculoRegistro = new VeiculoRegistro();







            VeiculoRepository veiculoRepository = new VeiculoRepository();
            veiculoRepository.veiculoRegistro = veiculoRegistro;
            veiculoRepository.gravar();

            veiculoRepository.exibirContato();

        }
    }

