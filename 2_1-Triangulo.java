package entities;

public class Retangulo {

    public double altura;
    public double largura;

    public double area(){
        return altura * largura;
    }
    public double perimetro(){
        return ((2 * altura) + (2 * largura));
    }
    public double diagonal(){
        return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
    }

    public String toString(){
        return "----- Medida do Retangulo -----\n\n" +
                "Altura: " + altura +
                "\nLargura: " + largura +
                "\nArea: " + area() +
                "\nPerimetro: " + perimetro() +
                "\nDiagonal: " + diagonal();
    }
}
