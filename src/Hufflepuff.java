public class Hufflepuff extends Hogwarts {
    private int hardworking; //трудолюбивы
    private int loyal; // верны
    private int honest; //честны

    public Hufflepuff(String nameStudents,int powerOfMagic, int transgressionDistance,
                      int hardworking, int loyal, int honest) {
        super(nameStudents, powerOfMagic, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
}
