package src2;

public class Slytherin extends Hogwarts {
    private int cunning;//хитрость
    private int determination;//решительность
    private int ambition;//амбициозность
    private int resourcefulness;//находчивость
    private int lustForPower;//жажда власти

    public Slytherin(String nameStudents, int powerOfMagic, int transgressionDistance,
                     int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(nameStudents, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    private int ability() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

    public void compareSlytherin(Slytherin slytherin) {
        int ability1 = ability();
        int ability2 = slytherin.ability();
        if (ability1 > ability2) {
            System.out.printf("Слизеринец %s лучше, чем слизеринец %s: %d VS %d%n",
                    getNameStudents(), slytherin.getNameStudents(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Слизеринец %s лучше, чем слизеринец %s: %d VS %d%n",
                    slytherin.getNameStudents(), getNameStudents(), ability2, ability1);
        } else {
            System.out.printf("Слизеринец %s такой же, как слизеринец %s: %d VS %d%n",
                    slytherin.getNameStudents(), getNameStudents(), ability1, ability2);
        }
    }
    @Override
    public String toString() {
        return super.toString() + " " + "Слизерин " +
                " амбициозность " + ambition +
                ", хитрость " + cunning +
                ", жажда власти " + lustForPower +
                ", решительность " + determination +
                ", находчивость " + resourcefulness;
    }

}


