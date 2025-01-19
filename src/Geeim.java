import java.util.Random;
import java.util.Scanner;

public class Geeim {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static int heroName;
    static int heroHP = 10;
    static int heroAttack = 3;
    static double heroAura = 100;
    static String monsterName = "Орг";
    static int monsterHP = 9;
    static int monsterAttack = 2;


    public static void main(String[] args) {
        //....опыт
        // игра
        System.out.println("ведите имя героя ");
        String neroHame = scanner.next();

        while (true) {

            // герой
            Hero() ;
            System.out.println("-----------------");
            if (monsterHP <= 0) {
                heroAura =heroAura + 899;
                System.out.println("герой выграл и понял вою вауру " + heroAura);

                break;
            }
            System.out.println("-----------------");
            inf();
            System.out.println("-----------------");
            // монстыр
            Boss() ;
            System.out.println("-----------------");
            if (heroHP <= 0) {
                System.out.println("монстыр выграл ");
                break;
            }
            inf();
        }
    }
    public static int Hero(){
        System.out.println("герой " + heroName + " в бой ");
        System.out.println("выберите каманду; 1: атаковат 2: зашишятся ");
        int command = scanner.nextInt();
        if (command == 1) {
            monsterHP -= heroAttack;
            if (random.nextInt(100) < 10) {
                monsterHP -= heroAttack;
                System.out.println("герой " + heroName + " нанес додолнителный урон ");
            }

        } else if (command == 2) {
            heroHP++;
            System.out.println("гирой " + heroName + " востоновил хп на 1");
        } else {
            System.out.println("вы пропускаете ход ...");
        } return -1;

    }
    public static int Boss() {
        System.out.println("ход монстра");
        int mCommand = random.nextInt(3) + 1; // 1,2
        if (mCommand == 1) {
            System.out.println("монстыр атакует " + heroName + " получил " + monsterAttack + " урона");
            heroHP -= monsterAttack;
        } else if (mCommand == 2) {
            System.out.println("монстыр решил лечится ");
            monsterHP += 3;
        } return -2 ;

    }
    public static void inf(){
        System.out.println("герой " + heroName + " имейет каличество хп " + heroHP + " монстр " + monsterName
                + " имейет каличество хп " + monsterHP);
    }
}