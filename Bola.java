public class Bola {
    private double jariJari;

    public Bola(){
        this.jariJari = 0.0;
    }

    public void setJariJari(double jariJari){
        if (jariJari != 0){
            this.jariJari = jariJari;
        } else {
            System.out.println("Jari-jari tidak boleh 0");
        }
    }

    public double showDiameter(){
        double hasil = 2 * jariJari;
        System.out.println("Diameter Lingkaran ini Adalah "+hasil);
        return hasil;
    }
    
    public double showLuasPermukaan(){
        double hasil = 4 * Math.PI * Math.pow(jariJari, 2);
        System.out.println("Luas Permukaan Lingkaran ini Adalah "+hasil);
        return hasil;
    }
    
    public double showVolume(){
        double hasil = (4/3) * Math.PI * Math.pow(jariJari, 2);
        System.out.println("Volume Lingkaran ini Adalah "+hasil);
        return hasil;
    }
}
