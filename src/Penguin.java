public class Penguin implements Attacker{
    //Instance variables (HAS A)
    public String name;
    public int attackPower;

    //Constructor
    public Penguin(String name, int attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }


    public void Attack() {
        System.out.println(this.name + " punches for " + this.attackPower + " damage!");
    }
}
