package menmoto;

public class Game {
    private int level;
    private int money;

    public void play() {
        System.out.println("开始玩游戏~");
        level++;
        money += 67;
    }

    public void exit() {
        System.out.println("退出游戏···此时人物属性: " + toString());
    }

    public Menmoto createMenmoto() {
        Menmoto menmoto = new Menmoto();
        menmoto.setLevel(level);
        menmoto.setMoney(money);
        return menmoto;
    }

    public void setMenmoto(Menmoto menmoto) {
        System.out.println("读取存档中···");
        level = menmoto.getLevel();
        money = menmoto.getMoney();
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Game{" +
                "level=" + level +
                ", money=" + money +
                '}';
    }
}
