public interface Manager <S> {
    void add( S s);
    void fix(String name, S s);
    void delete( String name);
    int search( String name);
    void print();
    void sort();

}
