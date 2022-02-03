public class Test6 {
    public static void main(String[] args) {
        AnyAbstract obj=new  AnyAbstract(){
            void eat(){
                System.out.println("eating food");
            }
        };
        obj.eat();
    }
}
