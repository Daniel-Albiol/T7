public class MarcaPagina {
    int ultimaLeida = 1;

    MarcaPagina(int ultimaLeida){
        this.ultimaLeida = ultimaLeida;
    }


    void incrementarPagina {
        ultimaLeida ++;
    }


    void nuevaLectura {
        ultimaLeida = 1;
    }

    int getUltimaLeida(){
        return ultimaLeida;
    }
}
