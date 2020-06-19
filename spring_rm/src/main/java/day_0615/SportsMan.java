package day_0615;

/**
 * 运动员
 */
public abstract class SportsMan {
    String name;            //姓名
    Integer age;            //年龄
    Integer year;            //训练年限
    String interest;        //兴趣爱好

    public abstract void playBall();

    public void print(){
        System.out.println("运动员姓名:"+this.name);
        System.out.println("运动员年龄:"+this.age);
        System.out.println("运动员训练年限:"+this.year);
        System.out.println("运动员兴趣爱好:"+this.interest);

    }
}
