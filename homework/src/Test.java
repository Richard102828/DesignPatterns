import adapter.classadapter.Adapter;
import bridge.Abstraction;
import bridge.ConcreteImplementor;
import bridge.RefineAbstraction;
import command.CurrentCommand;
import command.Invoker;
import command.Receiver;
import composite.safe.Composite;
import composite.safe.Leaf;
import decoration.one.*;
import decoration.two.*;
import facade.Facade;
import factory.*;
import flyweight.BikeFactory;
import flyweight.IBike;
import interpreter.Calculator;
import iterator.Aggregate;
import iterator.ConcreteAggregate;
import iterator.Iterator;
import mediator.*;
import mediator.Person;
import menmoto.Game;
import menmoto.Menmoto;
import observer.ConcreteObserverOne;
import observer.ConcreteObserverThree;
import observer.ConcreteObserverTwo;
import observer.ConcreteSubject;
import prototype.sample.Money;
import prototype.sample.Producter;
import prototype.sample.register.ProductManager;
import proxy.dynamicProxy.License;
import proxy.dynamicProxy.MaoTai;
import proxy.dynamicProxy.WineBar;
import proxy.dynamicProxy.WuLiangYe;
import proxy.staticProxy.Cinema;
import proxy.staticProxy.RealMovie;
import responsibility.ChongQingPostMan;
import responsibility.PostMan;
import responsibility.ShanghaiPostMan;
import state.Context;
import stragety.MoviesStrategy;
import stragety.ShoppingStrategy;
import stragety.Stragety;
import template.Download;
import template.Linux;
import template.Windows;
import visitor.*;

import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
//        testStream();
//        testFactory();
//        testBuild();
//        testProtoType();
//        testAdapter();
//        testBridge();
//        testDecorator();
//        testFacade();
//        testComposite();
//        testFlyweight();
//        testProxy();
//        testTemplate();
//        testCommand();
//        testIterator();
//        testObserver();
//        testMediator();
//        testStragety();
//        testState();
//        testResponsibility();
//        testVisitor();
//        testMenmoto();
        testInterpreter();
    }

    /**
     * 测试流
     */
    private static void testStream() {
        List<Integer> integers = Arrays.asList(1545,123,456,7878,1,75,2,3,4,8);
        List<String> strings = integers.stream()
                .filter(integer -> integer > 100)
                .map(n -> n.toString())
                .collect(Collectors.toList());
        for (String s: strings) {
            System.out.println(s);
        }
    }

    /**
     * 测试简单工厂，工厂方法，抽象工厂
     */
    private static void testFactory() {
        Color bule = ColorFactory.createColor("bule");
        bule.draw();
        Color red = new RedFactory().createColor();
        red.draw();
        Color blue = new B().createBule();
        blue.draw();
    }

    /**
     * 测试建造者模式（简单版，完整版）
     */
    private static void testBuild() {
        /*Diretor diretor = new Diretor();
        BuildFactory factory = new BuildFactory();
        diretor.consruct(factory);
        Computer computer = factory.builder();
        computer.show();

        builder.complex.BuildFactory factory1 = new builder.complex.BuildFactory.Builder()
                .cpu("CPU")
                .mainBoard("MainBoard")
                .gtx("GTX")
                .show();*/
    }

    /**
     * 测试原型模式（简单，登记）浅拷贝，深拷贝
     */
    private static void testProtoType() {
        Money money = new Money();
        money.setValueface(500);
        money.setUnit("RMB");
        System.out.println(money);
        Producter producter = new Producter();
        ProductManager manager = new ProductManager();
        try {
            Money c = producter.pruduct(money);
            manager.add(c);
            money.setValueface(200);
            System.out.println(money);
            System.out.println(c);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试适配器模式 (类适配、对象适配)
     */
    private static void testAdapter() {
        Adapter classAdapter = new Adapter();
        classAdapter.Request();
        adapter.objectadapter.Adapter objectAdapter = new adapter.objectadapter.Adapter();
        objectAdapter.Request();
    }

    /**
     * 测试桥接模式
     */
    private static void testBridge() {
        Abstraction abstraction = new RefineAbstraction();
        abstraction.setImplementor(new ConcreteImplementor());
        abstraction.abs();
    }

    /**
     * 测试装饰者模式 1、2
     */
    private static void testDecorator() {
        Hamburger hamburger = new ChickenBurger();
        System.out.println(hamburger.getName() + hamburger.getPrice());
        Condiment lettuce = new LettuceBurger(hamburger);
        System.out.println(lettuce.getName() + lettuce.getPrice());
        Condiment chill = new ChillBurger(hamburger);
        System.out.println(chill.getName() + chill.getPrice());

        decoration.two.Human human = new decoration.two.Person();
        Decorator decorator = new DecoratorTwo(new DecoratorOne(human));
        decorator.wareClothes();
        decorator.walkToWhere();
    }

    /**
     * 测试外观（门面）模式
     */
    private static void testFacade() {
        Facade.getInstance().on();
        Facade.getInstance().off();
    }

    /**
     * 测试组合模式（合成）安全型、透明型
     */
    private static void testComposite() {
        Composite root1 = new Composite("服装");
        Composite boy1 = new Composite("男装");
        Composite girl1 = new Composite("女装");
        Leaf boyLeaf = new Leaf("男版体恤");
        Leaf girlLeaf = new Leaf("女版体恤");
        boy1.add(boyLeaf);
        girl1.add(girlLeaf);
        root1.add(boy1);
        root1.add(girl1);
        root1.printStruct();
    }

    /**
     * 测试享元模式（同时测试String的享元模式）
     */
    private static void testFlyweight() {
        String string1 = new String("iam");
        String string2 = new String("iam");
        System.out.println(string1 == string2);
        string1 = string1.intern();
        string2 = string2.intern();
        System.out.println(string1 == string2);
        String str1 = "iam";
        String str2 = "iam";
        System.out.println(str1 == str2);
        System.out.println(str1 == string2);

        BikeFactory factory = new BikeFactory();
        IBike ofo = factory.getBike("ofo");
        ofo.cost(1);
        ofo = factory.getBike("ofo");
        ofo.cost(1);
    }

    /**
     * 测试代理模式（静态代理、动态代理）
     */
    private static void testProxy() {
        Cinema cinema = new Cinema(new RealMovie());
        cinema.play();

        License wineProxy = (License) Proxy.newProxyInstance(MaoTai.class.getClassLoader(),
                MaoTai.class.getInterfaces(), new WineBar(new MaoTai()));
        wineProxy.sellWine();
        License wuliangyeProxy = (License) Proxy.newProxyInstance(WuLiangYe.class.getClassLoader(),
                new Class[] {License.class}, new WineBar(new WuLiangYe()));
        wuliangyeProxy.sellWine();
    }

    /**
     * 测试模板方法模式
     */
    private static void testTemplate() {
        Download windows = new Windows();
        windows.download();
        Download linux = new Linux();
        linux.download();
    }

    /**
     * 测试命令模式
     */
    private static void testCommand() {
        Invoker invoker = new Invoker(new CurrentCommand(new Receiver()));
        invoker.invoker();
    }

    /**
     * 测试迭代器模式（这里按照的是jdk中的集合来实现的，将迭代器具体的实现类变为了容器的一个内部类
     */
    private static void testIterator() {
        Aggregate aggregate = new ConcreteAggregate(10);
        Iterator iterator = aggregate.iterator();
        for (int i = 0; i < 10; i++) {
            ((ConcreteAggregate) aggregate).add(i, i);
        }
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /**
     * 测试观察者模式
     * 具体的使用，可以直接使用 jdk中已经实现的观察者模式 (Observer 与 Observable)
     */
    private static void testObserver() {
        ConcreteSubject subject = new ConcreteSubject();
        subject.addObserver(new ConcreteObserverOne());
        subject.addObserver(new ConcreteObserverTwo());
        subject.addObserver(new ConcreteObserverThree());
        subject.doSomething();
    }

    /**
     * 测试中介模式（调停者模式）
     */
    private static void testMediator() {
        HouseMediator mediator = new Mediator();
        Person a = new PersonA(mediator);
        Person b = new PersonB(mediator);
        ((Mediator) mediator).setA((PersonA) a);
        ((Mediator) mediator).setB((PersonB) b);
        a.send("PersonA有一栋别墅要出售");
    }

    /**
     * 测试状态模式
     */
    private static void testState() {
        Context context = new Context();
        context.fallInLove();
        context.movie();
        context.shopping();
        context.breakUp();
        context.movie();
        context.shopping();
    }

    /**
     * 测试策略模式
     */
    private static void testStragety() {
        Stragety movie = new MoviesStrategy();
        Stragety shopping = new ShoppingStrategy();
        stragety.Context context = new stragety.Context(movie);
        context.show();
        context.setStragety(shopping);
        context.show();

    }

    /**
     * 测试责任链模式
     */
    private static void testResponsibility() {
        PostMan shangHai = new ShanghaiPostMan();
        PostMan chongQing = new ChongQingPostMan();
        shangHai.setmNextPostMan(chongQing);
        shangHai.handleCourier("重庆");
    }

    /**
     * 测试访问者模式
     */
    private static void testVisitor() {
        Music qq = new Music("QQ音乐");
        Music wangyi = new Music("网易音乐");
        Video bilibili = new Video("B站");
        Video youtube = new Video("油管");

        Websites websites = new Websites();
        websites.addWeb(qq);
        websites.addWeb(wangyi);
        websites.addWeb(bilibili);
        websites.addWeb(youtube);

        FreeMan freeMan = new FreeMan("闲人");
        BusyMan busyMan = new BusyMan("忙人");

        websites.accept(freeMan);
        websites.accept(busyMan);
    }

    /**
     * 测试备忘录模式
     */
    private static void testMenmoto() {
        Game firstGame = new Game();
        firstGame.play();
        Menmoto menmoto = firstGame.createMenmoto();
        firstGame.exit();
        Game secondGame = new Game();
        secondGame.setMenmoto(menmoto);
    }

    /**
     * 测试解释器模式，有些问题
     */
    private static void testInterpreter() {
        Calculator calculator = new Calculator();
        calculator.read("a = 1024");
        calculator.read("b = 512");
        System.out.println("a = 1024");
        System.out.println("b = 512");

        calculator.read("a + b");
        System.out.println("a + b = " + calculator.calculate());
        calculator.read("a - b");
        System.out.println("a - b = " + calculator.calculate());
    }
}
