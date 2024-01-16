public class Bus {
    private int penumpang,maxpenumpang,password,berat;
    
    // konstruktor
    public Bus(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
        password = 0;
        berat = 0;
    }
    
    //method mutator 
    public void pluspenumpang(int penumpang, int berat){
        int temp;
        temp=this.penumpang+penumpang;
        if (password==90) {
            if (temp>=maxpenumpang){
                System.out.println("Overload penumpang");
            }
            else {
                this.penumpang=temp;
                this.berat+=berat;
            }
        } else {
            System.out.println("Anda tidak punya akses!");
        }
    }
    public void getPassword(int password){
        if (password==90){
            System.out.println("password benar");
            this.password=password;
        }
        else{
            System.out.println("pass salah");
        }
    }
    public void cetak(){
        if (password==90) {
            System.out.println("Penumpang sekarang = "+penumpang);
            System.out.println("penumpang seharusnya adalah ="+maxpenumpang);
        } else {
            System.out.println("Anda tidak punya akses!");
        }
    }
    public void getAverage(int berapaKali){
        int hasil = berat/berapaKali;
        if (password==90) {
            System.out.println("Rata-rata berat penumpang yang ditambahkan adalah: " + hasil + " kg");
        } else {
            System.out.println("Anda tidak punya akses!");
        }
    }
}
