package db;

public abstract class Table<E> {
    protected List<E> elements;

    protected Table() {
        this.elements = new ArrayList<>();
    }

    public E save(E entity) {
        elements.add(entity);
        return entity;
    }

    public List<E> getElements() {
        return elements;
    }
}
