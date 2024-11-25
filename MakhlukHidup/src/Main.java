public class Main {
    public static void main(String[] args) {
        Manusia manusia = new Manusia("Kinan", 25);
        manusia.bernapas();
        manusia.berkembangBiak();
        manusia.berpikir();
        manusia.bertambahUsia();

        System.out.println();

        Hewan hewan = new Hewan("Kucing", 3);
        hewan.bernapas();
        hewan.berkembangBiak();
        hewan.berburu();
        hewan.bertambahUsia();

        System.out.println();

        Tumbuhan tumbuhan = new Tumbuhan("Buah_Naga", 5);
        tumbuhan.bernapas();
        tumbuhan.berkembangBiak();
        tumbuhan.melakukanFotosintesis();
        tumbuhan.bertambahUsia();
    }
}
