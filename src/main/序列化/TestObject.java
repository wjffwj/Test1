package 序列化;

import java.io.Serializable;

public class TestObject extends Parent implements Serializable {
    private static final long serialVersionUID = -3186721026267206914L;

    public int testValue = 300;

    public InnerObject innerObject = new InnerObject();
}
