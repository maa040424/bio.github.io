//Nama : Muhammad Adam Alghifari
//Npm  : 2210010314

public class Universitas {
    public String nama;
    public String lokasi;
    public String tanggalBerdiri;
    public int jumlahMahasiswa;
    public String akreditasi;

    public Universitas(String nama, String lokasi, String tanggalBerdiri, int jumlahMahasiswa, String akreditasi) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.tanggalBerdiri = tanggalBerdiri;
        this.jumlahMahasiswa = jumlahMahasiswa;
        this.akreditasi = akreditasi;
    }

    public String getInformasi() {
        return "Nama Universitas: " + nama + "\nLokasi: " + lokasi + "\nTanggal Berdiri: " + tanggalBerdiri +
               "\nJumlah Mahasiswa: " + jumlahMahasiswa + "\nAkreditasi: " + akreditasi;
    }

    public void updateJumlahMahasiswa(int jumlahBaru) {
        if (jumlahBaru > 0) {
            this.jumlahMahasiswa = jumlahBaru;
        } else {
            System.out.println("Jumlah mahasiswa harus lebih dari 0");
        }
    }

    public void updateAkreditasi(String akreditasiBaru) {
        this.akreditasi = akreditasiBaru;
    }

    public String getNama() {
        return this.nama;
    }

    public String getLokasi() {
        return this.lokasi;
    }
}
