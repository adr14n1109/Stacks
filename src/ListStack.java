public class ListStack implements StackInterface{
    StackNode top;
    int size = 0;

    @Override
    public void clear() {
        size = 0;
        this.top = null;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public Object peek() {
        if (top == null) return null;
        return top.dato;
    }

    @Override
    public Object pop() {
        if (top == null) return null;

        Object aux = top.dato;
        top = top.below;
        size--;
        return aux;
    }

    @Override
    public boolean push(Object object) {
        if (object == null) return false;

        StackNode nuevo = new StackNode(object);
        nuevo.below = top;
        top = nuevo;
        size++;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean search(Object object) {
        if (top == null) return false;

        StackNode actual = this.top;
        while (actual != null) {
            if (actual.dato == null ? object == null : actual.dato.equals(object)) return true;
            actual = actual.below;
        }
        return false;
    }

    @Override
    public String toString() {
        if (top == null) {
            return "Pila vacía";
        }

        StringBuilder sb = new StringBuilder("Top -> ");
        StackNode actual = this.top;

        while (actual != null) {
            sb.append("[").append(actual.dato).append("] -> ");
            actual = actual.below;
        }

        sb.append("null");
        return sb.toString();
    }
}