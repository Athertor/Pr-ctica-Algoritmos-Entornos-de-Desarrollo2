package com.entornos.JesusChavesGajete.algoritmos;

public abstract class Logaritmos {
	
	/****
	 * La sucecion de Fibonacci es una secuencia de 
	 * números en la que, después del 0 y del 1, cada número de la serie se obtiene sumando los dos anteriores
	 * @param numero
	 * @return  int 
	 */
	
	public int fibonacci(int numero) {
        if(numero<0) throw new IllegalArgumentException();
        
        int a = 0;
        int b = 1;
        
        if(numero == 0) return 0;
        if(numero == 1) return 1; 
        
        int ultimo = 0;
        
        for(int i = 2; i <= numero; i++) {
            ultimo = a+b;
            a = b;
            b = ultimo;
        }

        return b;
    }
}
