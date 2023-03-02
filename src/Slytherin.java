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
    public int getSumPoints(){
        int sumPoints;
            sumPoints = getPowerOfMagic() + getTransgressionDistance() +
                   getCunning() + getAmbition() + getResourcefulness()+
                    getDetermination() + getLustForPower();
            return sumPoints;

        }


   /* public static void getBestStudentSlytherin(Slytherin slytherins){
        int best = slytherins[0].getSumPoints();
        for (int i = 0; i < slytherins.length; i++) {
            if (best< slytherins[i].getSumPoints()) {
                best = slytherins[i].getSumPoints();
            }
            System.out.println(best);
        }

    }*/
    /*public static void getBestStudentSlytherin(Slytherin[] slytherins){
        int best = slytherins[0].getSumPoints();
        for (int i = 0; i < slytherins.length; i++) {
            if (best< slytherins[i].getSumPoints()) {
                best = slytherins[i].getSumPoints();
            }
            System.out.println(best);
        }

    }*/
}
