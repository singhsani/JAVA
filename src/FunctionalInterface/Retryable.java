package FunctionalInterface;

@java.lang.FunctionalInterface
interface Retryable<T> {
    T excute() throws Exception;
}
