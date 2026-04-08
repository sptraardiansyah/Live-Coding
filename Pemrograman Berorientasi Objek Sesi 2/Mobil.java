public class Mobil {
    String merk;
    int kecepatan;
    boolean mesinnyala;

    public Mobil (String merk) {
        this.merk = merk;
        this.kecepatan = 0;
        this.mesinnyala = false;
    }

    public void Nyalakan() {
        this.mesinnyala = true;
        this.kecepatan = 0;
        System.out.println(merk + " : Mesin Berhasil Dinyalakan, Kecepatan : " +kecepatan+ "km/jam");
    }

    public void Matikan() {
        this.mesinnyala = false;
        this.kecepatan = 0;
        System.out.println(merk + " : Mesin Berhasil Dimatikan, Kecepatan : " +kecepatan+ "km/jam");
    }

    public void Gas() {
        if (mesinnyala) {
            this.kecepatan += 45;
            System.out.println(merk + " : Gas Berhasil Diinjak, Kecepatan : " +kecepatan+ "km/jam");
        }else {
            System.out.println(merk + " : Gas Gagal Diinjak, Kecepatan : " +kecepatan+ "km/jam");
        }
    }

    public void Rem() {
        if (mesinnyala) {
            if (this.kecepatan >= 40) {
                this.kecepatan -= 40;
                System.out.println(merk + " : Rem Berhasil Diinjak, Kecepatan : " +kecepatan+ "km/jam");
            }else {
                this.kecepatan = 0;
                System.out.println(merk + " : Rem Gagal Diinjak, Kecepatan : " +kecepatan+ "km/jam");
            }
        }
    }
}
