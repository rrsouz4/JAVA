package Entidades;

public class Retangulo {

    private double altura;
    private double largura;


    public void setAltura(double altura) {

        if (altura < 0){
            throw new RuntimeException("Numero invalido!");
        }
        else {
            this.altura = altura;
        }
    }

    public void setLargura(double largura) {

        if (largura < 0){
            throw new RuntimeException("Numero invalido!");
        }
        else {
            this.largura = largura;
        }
    }


    public double getAltura(){
       return altura;
    }

    public double getLargura() {
        return largura;
    }

    public double Area() {

        return getAltura() * getLargura();

    }

    public double Perimetro() {

        return (2 * (getAltura() + getLargura()));

    }
    public double Diagonal(){

        double a = Math.pow(getAltura(),2) + Math.pow(getLargura(),2);
        return Math.sqrt(a);
    }

    public void String(){

        System.out.printf("A area do retangulo eh: %.2f%n"+
                "O perimetro do retangulo eh: %.2f%nA diagonal eh: %.2f%n",Area(),Perimetro(),Diagonal());

    }

}
