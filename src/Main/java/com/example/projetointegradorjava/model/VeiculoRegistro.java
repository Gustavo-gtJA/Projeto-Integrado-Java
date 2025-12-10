package com.example.projetointegradorjava.model;

public class VeiculoRegistro {

        public  String placa;
        public String modelo;
        public String proprietario;


        public String separarDadosVeiculo(){

                String veiculoSeparado = placa + ";" + modelo + ";" + proprietario + ";"  + "\n";
                return veiculoSeparado;
        }
}

