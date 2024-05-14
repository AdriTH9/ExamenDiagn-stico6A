public class Avion {
    private int alas;
    private String color;

    public Avion(){
        alas=0;
        color="Negro";
    }
    public Avion(String alas,int color){

    }
    public int getAlas() {

        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void Alas(int alas){
        System.out.println("Teniendo Alas: ");
    }
    private void Color(String color){
        System.out.println("El color es: ");
    }
}
