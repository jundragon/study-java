package designPattern.singleton;

/**
 * Enum 타입을 사용하면 하나의 인스턴스만 생성하는 것을 JVM이 보장한다.
 */
public enum SingletonEnum {
    INSTANCE;

    public void singletonMethod() {
        // operations here
    }
}
