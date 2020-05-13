package day046;

public class SQLProgrammer extends Programmer{
    public SQLProgrammer() {
    }
    @Override
    public void code(){
        System.out.println("SQL programmer code");
    }
    @Override
    public void test(){
        System.out.println("SQL programmer test");
    }
    public void writeSQLQuery(){
        System.out.println("Write SQL");
    }
    public void performDatabase(){
        System.out.println("Database");
    }

}
