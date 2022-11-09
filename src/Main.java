public class Main {
    public static void main(String[] args) {
        Lightsaber lightsaber = new Lightsaber();
        Club club = new Club();
        Sword sword = new Sword();


        Robot robot_one = new Robot("Robby",lightsaber);
        Robot robot_two = new Robot("Robert",club);
        Robot robot_three = new Robot("Roberto",sword);

        robot_one.Attack();
        robot_two.Attack();
        robot_three.Attack();
    }
}