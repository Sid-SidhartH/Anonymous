public class Test4 {
    public static void main(String[] args) {
        AnyInterface obj=new AnyInterface(){
            public void show2(){
                System.out.println("using interface in anonymous class");
            }
        };
        obj.show2();
    }
}
