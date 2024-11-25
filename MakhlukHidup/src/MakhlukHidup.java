public abstract class MakhlukHidup {
    private String nama;
    private int usia;

    public MakhlukHidup(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public String getNama() {
        return nama;
    }

    public void bertambahUsia() {
        this.usia++;
        System.out.println(nama + " bertambah usia. Usia sekarang: " + usia);
    }

    public abstract void bernapas();
    public abstract void berkembangBiak();
}

class Manusia extends MakhlukHidup {
    public Manusia(String nama, int usia) {
        super(nama, usia);
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas dengan paru-paru.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak dengan cara melahirkan.");
    }

    public void berpikir() {
        System.out.println(getNama() + " dapat berpikir.");
    }
}

class Hewan extends MakhlukHidup {
    public Hewan(String nama, int usia) {
        super(nama, usia);
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas dengan paru-paru atau insang.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak dengan cara bertelur atau melahirkan.");
    }

    public void berburu() {
        System.out.println(getNama() + " sedang berburu makanan.");
    }
}

class Tumbuhan extends MakhlukHidup {
    public Tumbuhan(String nama, int usia) {
        super(nama, usia);
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas melalui stomata.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak dengan biji atau stek.");
    }

    public void melakukanFotosintesis() {
        System.out.println(getNama() + " sedang melakukan fotosintesis.");
    }
}