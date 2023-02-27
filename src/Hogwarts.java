public class Hogwarts {
    private int powerOfMagic;// Сила магии
    private int transgressionDistance;//расстояние трансгрессии
    private String nameStudents;//Ученики

    public Hogwarts(int powerOfMagic, int transgressionDistance, String nameStudents) {
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
}

