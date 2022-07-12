public class AnimalImpl implements Animal {
    private String especie;
    private boolean voador;

    @Override
    public String getEspecie() {
        return especie;
    }

    @Override
    public boolean isVoador() {
        return voador;
    }

    public AnimalImpl(String especie, boolean voador){
        this.especie = especie;
        this.voador = voador;
    }

    @Override
    public String toString(){
        return this.especie;
    }
}
