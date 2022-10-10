package designpattern.interpreterPattern;

public abstract class Node {
    public abstract void parse(Context context) throws Exception;
}
