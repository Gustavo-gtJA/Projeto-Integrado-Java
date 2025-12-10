package com.example.projetointegradorjava.model;

public class VeiculoRegistro {

        public  String placa;
        public String modelo;
        public String proprietario;


        public String separarDadosContato(){

                String contatoSeparado = placa + ";" + modelo + ";" + proprietario + ";"  + "\n";
                return contatoSeparado;
        }
}

