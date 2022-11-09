public class Main {
    public static void main(String[] args) {
        Weapon sword = new Weapon("Sword", 50);
        Weapon club = new Weapon("Club", 30);
        Robot robot_one = new Robot(club);
        System.out.println(robot_one.name);
        robot_one.Attack();
    }
}