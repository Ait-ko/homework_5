public class Hero {
    private int hp ;
    private int damage;
    private String superAbility ;
    public Hero (int theHp, int theDamage , String theSuperAbility){
        this.hp = theHp;
        this.damage = theDamage;
        this.superAbility = theSuperAbility;
    }
    public Hero (int hp , int damage){
        this.hp=hp;
        this.damage=damage;
    }
    public int getHp(){
        return this.hp;
    }
    public int getDamage(){
        return this.damage;
    }
    public String getSuperAbility(){
        return this.superAbility;
    }
}
