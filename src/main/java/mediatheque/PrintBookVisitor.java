package mediatheque;

public class PrintBookVisitor implements ItemVisitor{
     public void visit(Book i){
        i.print();
    }
    public void visit(CD i){
    }
    
}