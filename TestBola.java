public class TestBola {
    public static void main(String[] args) {
        // TODO code application logic here
        Bus busMini=new Bus(10);
        busMini.getPassword(40);
        busMini.getPassword(90);
        busMini.cetak();

        busMini.pluspenumpang(3);
        busMini.cetak();
        
        busMini.pluspenumpang(2);
        busMini.cetak();
        
        busMini.pluspenumpang(4);
        busMini.cetak();

        busMini.getAverage(3);
        
          
    }   
}