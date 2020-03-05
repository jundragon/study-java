package designPattern.singleton;

/**
 * 지연 초기화에 의해서 인스턴스가 한개만 생성되는 것을 보장 할 수 없다
 * 안태 패턴이다
 */
public class Singleton {

    private static Singleton INSTANCE;

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }

        return INSTANCE;
    }

    public void singletonMethod() {
        // operations here
    }
}
