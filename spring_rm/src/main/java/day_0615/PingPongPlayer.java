package day_0615;

/**
 * 乒乓球运动员
 */
public class PingPongPlayer extends SportsMan implements English{

    @Override
    public void playBall() {
        System.out.print("打乒乓球，乒乓球运动员");
    }

    @Override
    public void study() {
        System.out.println("要学习英语");
    }

    @Override
    public String toString() {
        return "乒乓球运动员{" +
                "姓名=" + name +
                ",年龄=" + age +
                ",训练时间=" + year +"年"+
                ",兴趣爱好=" + interest +
                '}';
    }
}
