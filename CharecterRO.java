
/**
 * Charecter
 */
public class CharecterRO {

    private String name;
    private int level=0,hp=1000,mp=500,exp=0;
    private int job;
    private String body,head,legs;
    private int expToUpLevel=100;
    private String weapon;
    private int totalExp;
    
    public void setcharecter(String newname,int curLevel,int curJob ){
        name = newname;
        level = curLevel;
        job = curJob;
    }

    public void level(int exp){
        if (totalExp >= expToUpLevel) {
            level++;
            totalExp = 0;
            expToUpLevel*=2;
        }
    }
}