public class main {

    public static void main(String[] args) {

        user m=new user();
        m.print();

        user obj=new user();
        //System.out.println(obj.name+":"+obj.age+":"+obj.gender);

        obj.name="azim";
        obj.age=28;
        obj.gender="male";
        obj.print();

        user jk=new user();

        jk.name="arshil";
        jk.age=25;
        jk.gender="male";
        jk.print();



    }

}