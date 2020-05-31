package state;

/**
 * 注意与 策略模式的实现对比，这里对象的传入是在内部实现的，客户端并不知情
 */
public class Context {
    private Person personStae;

    public void setPersonStae(Person personStae) {
        this.personStae = personStae;
    }

    public void fallInLove() {
        System.out.println("恋爱啦~");
        personStae = new Lover();
    }

    public void breakUp() {
        System.out.println("失恋了···");
        personStae = new SingelDog();
    }

    public void movie() {
        personStae.movie();
    }

    public void shopping() {
        personStae.shopping();
    }
}
