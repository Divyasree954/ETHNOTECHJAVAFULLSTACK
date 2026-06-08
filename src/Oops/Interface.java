package Oops;
interface MyRuleBook{
        void Time();
        void Friends();
        void Study();
        
    }
    class MyChildren implements MyRuleBook{
        @Override
        public void Time(){
            System.out.println("1");
        }
        @Override
        public void Friends(){
            System.out.println("2");
        }
        @Override
        public void Study(){
            System.out.println("3");
        }

    }
public class Interface{
    public static void main(String[] args) {
           MyChildren my=new MyChildren();
           my.Time();
           my.Friends();
           my.Study();
    }
}
