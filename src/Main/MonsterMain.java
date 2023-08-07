package Main;

import RGP.Monster;
import RGP.Troll;

public class MonsterMain {

    public static void main(String[] args) {
        Monster troll = new Troll("troll", 500, 40);
        System.out.println("Name: " + troll.getName() + " - Attack: " + troll.attack());
    }
}
