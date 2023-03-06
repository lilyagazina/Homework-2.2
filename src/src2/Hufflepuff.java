package src2;

public class Hufflepuff extends Hogwarts {
    private int hardworking; //трудолюбивы
    private int loyal; // верны
    private int honest; //честны

    public Hufflepuff(String nameStudents, int powerOfMagic, int transgressionDistance,
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

    private int ability() {
        return hardworking + loyal + honest;
    }

    public void compareHufflepuff(Hufflepuff hufflepuff) {
        int ability1 = ability();
        int ability2 = hufflepuff.ability();
        if (ability1 > ability2) {
            System.out.printf("Пуффендуец %s лучше, чем пуффендуец %s: %d VS %d%n",
                    getNameStudents(), hufflepuff.getNameStudents(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Пуффендуец %s лучше, чем пуффендуец %s: %d VS %d%n",
                    hufflepuff.getNameStudents(), getNameStudents(), ability2, ability1);
        } else {
            System.out.printf("Пуффендуец %s такой же, как пуффендуец %s: %d VS %d%n",
                    hufflepuff.getNameStudents(), getNameStudents(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Пуффендуй " +
                " верны " + loyal +
                ", честны " + honest +
                ", трудолюбивы " + hardworking;
    }

}

