package src2;

public class Hogwarts {
    private int powerOfMagic;// Сила магии
    private int transgressionDistance;//расстояние трансгрессии
    private String nameStudents;//Ученики

    public Hogwarts(String nameStudents, int powerOfMagic, int transgressionDistance) {
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
        this.nameStudents = nameStudents;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public String getNameStudents() {
        return nameStudents;
    }

    public void setNameStudents(String nameStudents) {
        this.nameStudents = nameStudents;
    }

    private int ability() {
        return powerOfMagic + transgressionDistance;
    }

    public void print() {
        System.out.println(this);
    }

    public void compareHogwarts(Hogwarts hogwarts) {
        int ability1 = ability();
        int ability2 = hogwarts.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n",
                    getNameStudents(), hogwarts.getNameStudents(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n",
                    hogwarts.getNameStudents(), getNameStudents(), ability2, ability1);
        } else {
            System.out.printf("Студент %s такой же, как студент %s: %d VS %d%n",
                    hogwarts.getNameStudents(), getNameStudents(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return "Хогвартс " +
                "Ученик " + nameStudents +
                ", сила магии " + powerOfMagic +
                ", растояние трансгрессии " + transgressionDistance;
    }

}



