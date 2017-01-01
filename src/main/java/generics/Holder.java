package generics;

class Thing {}
public class Holder<SomeThing> {
    private SomeThing t;

    public SomeThing getT() {
        return t;
    }

    public Holder(SomeThing t) {

        this.t = t;
    }
}
