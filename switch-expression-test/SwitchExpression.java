
public class SwitchExpression {
    Day day = Day.Monday;
    
    public static void main(String[] args){
        System.out.println("Halo nama ku upin");

        
    }

    public void PrintLine(){
        System.out.println(day);
    }

    public int getValueCool(int... corners){
        return 1;
    }
}

enum Day{
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
}