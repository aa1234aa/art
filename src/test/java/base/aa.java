package base;

public class aa {
     int aa;
     String colior;
    public static void main(String[] args) {

     aa a=new aa();
     aa b=a;
     a.aa=1;
     b.colior="red";
     b.run();

    }
    public void run(){
        System.out.println(aa+"..."+colior);
    }
}
