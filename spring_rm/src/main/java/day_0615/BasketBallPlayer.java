package day_0615;


/**
 * 篮球运动员
 */
public class BasketBallPlayer extends SportsMan {

    @Override
    public void playBall() {
        System.out.println("打篮球，篮球运动员");
    }

    @Override
    public String toString() {
        return "篮球运动员{" +
                "姓名=" + name +
                ",年龄=" + age +
                ",训练时间=" + year +"年"+
                ",兴趣爱好=" + interest +
                '}';
    }
}
