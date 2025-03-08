public class MyFirstClass{
    public static void main(String[] args) {
        System.out.println(GenerateMessage.GenerateOneMessage());
        System.out.println(AnotherMessage.GenerateAnotherMessage());
    }
}

class GenerateMessage{
    static String GenerateOneMessage(){
        return "Here is one message";
    }
}

class AnotherMessage{
    static String GenerateAnotherMessage(){
        return "Here is another message";
    }

    void CoolKid(){
        for (int i = 0; i < 10; i++){
            if(i == 2)
                break;
        }
    }
}