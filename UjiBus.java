public class UjiBus {
    public static void main(String[] args) {
        // TODO code application logic here
        Bus busMini=new Bus(10);

        for (int i = 0; i <= 90; i++) {
            busMini.getPassword(i);
        }
        busMini.cetak();

        busMini.pluspenumpang(3, 40);
        busMini.cetak();
        
        busMini.pluspenumpang(2, 60);
        busMini.cetak();
        
        busMini.pluspenumpang(4, 50);
        busMini.cetak();

        busMini.getAverage(3);
        
          
    }
}
