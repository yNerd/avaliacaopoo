package classes.aplicativos;

public class Piloto extends Pessoa{
    private String breve;
    private String matricula;
    private int acelerar;
    
    public String getBreve() {
        return breve;
    }
    public void setBreve(String breve) {
        this.breve = breve;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
     public int getAcelerar() {
        return acelerar;
    }
    public void setAcelerar(int acelerar) {
        this.acelerar = acelerar;
    }

   /*  public void acelerar(int velocidade) {
         setAcelerar(velocidade);
     }
     public void decolar(int altitude) {
         
     }    */
     @Override
     public String toString() {

         return "Nao mais nenhum piloto cadastrado";
     }
   
}
