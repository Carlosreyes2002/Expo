// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Figura circulo = new Figura();
        Figura cuadrado = new Figura();
        Figura triangulo = new Figura();
        Figura octagono = new Figura();
        Grupo subgrupo = new Grupo();
        Grupo grupo = new Grupo();
        grupo.agregarComponente(circulo);
        grupo.agregarComponente(cuadrado);
        grupo.agregarComponente(triangulo);
        grupo.agregarComponente(octagono);
subgrupo.agregarComponente(grupo);
        circulo.dibujar();
        cuadrado.dibujar();
        triangulo.dibujar();
        octagono.dibujar();
        grupo.dibujar();
        subgrupo.dibujar();
        
}
}



