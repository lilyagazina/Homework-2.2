package src2;

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

    public void compareGriffindor(Gryffindor gryffindor) {
        int ability1 = ability();
        int ability2 = gryffindor.ability();
        if (ability1 > ability2) {
            System.out.printf("Гриффиндорец %s лучше, чем гриффиндорец %s: %d VS %d%n",
                    getNameStudents(), gryffindor.getNameStudents(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Гриффиндорец %s лучше, чем гриффиндорец %s: %d VS %d%n",
                    gryffindor.getNameStudents(), getNameStudents(), ability2, ability1);
        } else {
            System.out.printf("Гриффиндорец %s такой же, как гриффиндорец %s: %d VS %d%n",
                    gryffindor.getNameStudents(), getNameStudents(), ability1, ability2);
        }
    }

    private int ability() {
        return nobility + honor + courage;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Гриффиндор" + " храбрость " + courage +
                ", честь " + honor +
                ", благородство " + nobility;
    }

}


