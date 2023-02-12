
public class Main {
    public static void main(String args){
        MarcaPagina marcador = new MarcaPagina();
        Calendario calendario = new Calendario();
        System.out.println("La última página leida es : "+ marcador.getUltimaLeida()");
        System.out.println("Vamos a la siguiente página: " + marcador.incrementarPagina);
        System.out.println("Comenzamos lectura " + marcador.ultimaLeida);
        calendario.incrementaDia();
        calendario.incrementaMes();
        calendario.incrementaAnyo(2);
        calendario.mostrarFecha();
        System.out.println("A continuación comprobamos si la fecha es igual a una dada al azar.");
        //Calendario otraFecha = new Calendario();
        System.out.println("La fecha es igual? " + calendario.sonIguales(17,2, 2023));

    }

}
