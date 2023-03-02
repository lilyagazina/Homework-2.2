public class Ravenclaw extends Hogwarts{
    private int smart; //умны
    private int wise;// мудры
    private int witty;// остроумны
    private int creativity;//полны творчества

    public Ravenclaw(String nameStudents, int powerOfMagic, int transgressionDistance,
                     int smart, int wise, int witty, int creativity) {
        super(nameStudents, powerOfMagic, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Когтевран " +
                " умны " + smart +
                ", мудры " + wise +
                ", остроумны " + witty +
                ", полны творчества " + creativity;
    }
}
