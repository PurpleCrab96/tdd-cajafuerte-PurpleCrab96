package ar.edu.unahur.obj2.tdd;

public class CajaFuerte {

    private Boolean abierta = true;

    public Boolean estaAbierta() {
        return this.abierta;
    }

    public void cerrar(Integer codigo) {
        this.abierta = false;
    }

    public void abrir(Integer codigo) {
        this.abierta = true;
    }
}
