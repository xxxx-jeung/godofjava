package chapter13.c.impl.list;

public interface List {
    public void add();
    public void update(int index, Object value);
    public void remove(int index);
    public List select(int index);
    public List selectAll();
}
