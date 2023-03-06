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

    @Override
    public String toString() {
        return "Хогвартс " +
                "Ученик " + nameStudents +
                ", сила магии " + powerOfMagic +
                ", растояние трансгрессии " + transgressionDistance;
    }
    public void print() {
        System.out.println(this);
    }
}

