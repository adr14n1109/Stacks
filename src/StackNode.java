public class StackNode {

    public Object dato;
    public StackNode below;

    public StackNode() {
        this.dato = null;
        this.below = null;
    }

    public StackNode(Object dato) {
        this.dato = dato;
        this.below = null;
    }
}
