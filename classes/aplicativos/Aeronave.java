package classes.aplicativos;

public class Aeronave {
    private String modelo;
    private String categoria;
    private int velocidadeAeronave;
    private int altitudeAeronave;
    Piloto p = new Piloto();
    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }  
    public int getVelocidadeAeronave() {
        return velocidadeAeronave;
    }
    public void setVelocidadeAeronave(int velocidadeAeronave) {
        this.velocidadeAeronave = velocidadeAeronave;
    }

    public int getAltitudeAeronave() {
        return altitudeAeronave;
    }
    public void setAltitudeAeronave(int altitudeAeronave) {
        this.altitudeAeronave = altitudeAeronave;
    }
    
  /*   public void aceleraAeronave() {     
        setVelocidadeAeronave(p.getAcelerar());
    }
    public void altitudeAeronave(int altitudeAeronave) {
        setAltitudeAeronave(p.getAcelerar());    

    } */    

}
