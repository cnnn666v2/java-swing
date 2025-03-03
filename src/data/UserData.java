package data;

public class UserData {
    private int money;
    private int clickMoney;
    private int level;
    private int xp;

    public UserData(int money, int clickMoney, int level, int xp) {
        this.money = money;
        this.clickMoney = clickMoney;
        this.level = level;
        this.xp = xp;
    }

    public int getMoney() { return money; }
    public void setMoney(int money) { this.money = money; }

    public int getClickMoney() { return clickMoney; }
    public void setClickMoney(int clickMoney) { this.clickMoney = clickMoney; }

    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }

    public int getXP() { return xp; }
    public void setXP(int xp) { this.xp = xp; }
}