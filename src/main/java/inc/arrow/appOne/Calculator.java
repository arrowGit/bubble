package inc.arrow.appOne;

/**
 * Class represents calculator
 * Created by @author Oleh Strilets on 19.02.2017.
 */
public class Calculator {

    private int result;
    public int add(int ... params){
        for (Integer param: params)
        this.result += param;
        return result;
    }
    public int substract(int ... params){
        for (Integer param: params)
            this.result -= param;
        return result;
    }

    public int getResult() {
        return result;
    }

    public void clearResult(int result) {
        this.result = 0;
    }
}
