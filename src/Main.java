public class Main {
    public static void main(String args){
        MarcaPagina marcador = new MarcaPagina();
        System.out.println("La última página leida es : "+ marcador.getUltimaLeida()");
        System.out.println("Vamos a la siguiente página: " + marcador.incrementarPagina);
        System.out.println("Comenzamos lectura " + marcador.ultimaLeida);
    }
}
