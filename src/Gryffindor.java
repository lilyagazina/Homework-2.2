public class Gryffindor extends Hogwarts {
    private int nobility; //благородство
    private int honor;// честь
    private int courage;//храбрость

    public Gryffindor(String nameStudents, int powerOfMagic, int transgressionDistance,
                      int nobility, int honor, int courage) {
        super(nameStudents, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Гриффиндор" + " храбрость " + courage +
                ", честь " + honor +
                ", благородство " + nobility;
    }

}
