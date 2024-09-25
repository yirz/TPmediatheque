package mediatheque;

public class PrintCDVisitor implements ItemVisitor{
    public void visit(Book i){
    }
    
    public void visit(CD i){
        i.print();
    }
}