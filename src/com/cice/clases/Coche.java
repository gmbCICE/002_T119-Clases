/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.clases;

import java.util.Date;

/**
 *
 * @author Formador
 */
class Coche {
    
    //atributos o variables
    //caracteristicas
    static String modelo;
    
    String color;
    String matricula;
    String bastidor;
    int potencia;
    Date fecha;
    boolean esAndando;
    boolean esEncendido;
    char caracter;
    
    //constructor
    Coche(){
        color = "ROJO";
    }
    
    //constructor con parametros
    Coche(String matricula, String bastidor){
        //inicializa las variables designadas
        this.matricula = matricula;
        this.bastidor = bastidor;
    }
    
    
    //funciones
    void acelerar(String color){
        System.out.println("Estoy acelerando");
        System.out.println("valor de caracter por defecto: " + caracter);
    }
    
    void frenar(){
        System.out.println("Estoy frenando");
    }
    
    void arrancar(){
        System.out.println("Arrancando...");
    }
    
    void apagar(){
        System.out.println("Ya me apago...");
    }
    
}
