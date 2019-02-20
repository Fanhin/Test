public class Shop extends Character{
    private String hp=100;
    private String mp=100;
    private String exp=10;
    private int armor=0,helmet=0,shose=0;
    private int sword,arrow,knife;


    public void life(int order){
        switch (order) {
            case order = 1:
                Character.hp += hp;
                break;
            case order = 2:
                Character.mp += mp;
            case order = 3:
                Character.exp += exp;
            default:
                break;
        }
    }

    public String cloth(int order){
        switch (order) {
            case order = 1:
                Character.body = "armor" + armor;
                break;
            case order = 2:
                Character.head = "helmet" + helmet;
                break;
            case order = 3:
                Character.legs = "shose" + shose;
            default:
                break;
        }
    }

    public String weapon(int order){
        switch (order){
            case order = 1:
                Character.weapon = "sword" + sword;
                break;
            case order = 2:
                Character.weapon = "knife" + knife;
                break;
            case order = 3:
                Character.weapon = "arrow" + arrow;
            default:
                break;
        }
    }
}