

package com.mycompany.exemploheranca;


public class Exemploheranca {

    public static void main(String[] args) {
        
        Triangulo triangulo = new Triangulo();
        triangulo.leitura();
        System.out.println("area do triangulo:" + triangulo.getArea());
                
                Circulo circulo = new Circulo("Branco",3);
                System.out.println(circulo.paraString());
                System.out.println("area do circulo:" + circulo.getArea());
    }
}
