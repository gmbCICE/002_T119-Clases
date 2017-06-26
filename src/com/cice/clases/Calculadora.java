package com.cice.clases;

public class Calculadora {
    
    //variable global de la clase
    static int c;
    
    //metodo estatico
    public static int suma(int a, int b){
        
        return a+b+c;
        
    }
    
    //metodo no estatico
    public int resta(int a, int b){
        return a-b;
    }
    
    public static int sumaresta(int a, int b){
        
        return suma(a,b);
        
    }
}
