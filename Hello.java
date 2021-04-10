package buildbreaker;

public class Hello {

    static {
        System.loadLibrary("hello_jni")
    }

    public static native int num();
}
