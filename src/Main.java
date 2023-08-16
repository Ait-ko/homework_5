public class Main {
    public static void main(String[] args) {
        Hero myHero = new Hero(122,90,"SUPER POWER"); {
            System.out.println("Hp "+ myHero.getHp() + " Damage "+ myHero.getDamage() + " Super Ability"+ myHero.getSuperAbility());
        }Hero characteristicHero = new Hero(212,60);
        System.out.println("Hp "+ characteristicHero.getHp() + " Damage " + characteristicHero.getDamage());
    Boss boss = new Boss();
    boss.setHp(678);
    boss.setDamage(90);
    boss.setProtect("magical");
        System.out.println("Hp "+ boss.getHp() + " Damage "+ boss.getDamage()
        + " Protect "+ boss.getProtect());
    }
}