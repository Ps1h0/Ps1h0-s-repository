package lab1.pkg4;

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
