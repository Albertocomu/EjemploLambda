
public class Animal {
    private boolean potSaltar;
    private boolean potVolar;
    private boolean potNadar;
    private boolean potCaminar;

    public Animal(boolean potSaltar, boolean potVolar, boolean potNadar, boolean potCaminar) {
        this.potSaltar = potSaltar;
        this.potVolar = potVolar;
        this.potNadar = potNadar;
        this.potCaminar = potCaminar;
    }

    private boolean potSaltar(){return potSaltar;}
    private boolean potVolar(){return potVolar;}
    private boolean potNadar(){return potNadar;}
    private boolean potCaminar(){return potCaminar;}


}
