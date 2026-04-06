package OppsConcept;

class ParentClass{
    public Integer x=10;
    public String get(){
        return "Hello World";
    }
}

public class OverloadingDynamicPolyMorphism  extends ParentClass{
    @Override
    public String get(){
        return "child Hello World";
    }
    public int x=20;
    public String getData(){
        return "Child method";
    }

    public static void main(String[] args) {
        ParentClass p=new OverloadingDynamicPolyMorphism();
        ParentClass parentClass=new ParentClass();
        System.out.println(parentClass.x);
        System.out.println(parentClass.get());
        OverloadingDynamicPolyMorphism d=new OverloadingDynamicPolyMorphism();
        System.out.println(p.x);
        System.out.println(d.x);
        System.out.println(d.get());
        if(p instanceof OverloadingDynamicPolyMorphism){
            OverloadingDynamicPolyMorphism ch=(OverloadingDynamicPolyMorphism)p;
            System.out.println(ch.get());
            System.out.println(ch.getData());
        }
        //System.out.println(ch.getData());
    }
}
