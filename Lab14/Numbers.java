package lab1.pkg4;
/*Класс Numbers с атрибутом args.
Метод summ складывает числа введенные пользователем*/
public class Numbers {
    int[] args;
    public Numbers(int[] args){
        this.args = args;
    }
    public int summ(){
        int result = 0;
        for(int a: args){
            result += a;
        }
        return result;
    }    
}
