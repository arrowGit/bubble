package inc.arrow.appOne;

/**
 * Class represents calculator
 * Created by @author Oleh Strilets on 19.02.2017.
 */
class Calculator {

    private int result;
    int add(int... params){
        clearResult();
        for (Integer param: params)
        this.result += param;
        return result;
    }
    int substract(int ... params){
        clearResult();
        for (Integer param: params)
            this.result -= param;
        return result;
    }

    int getResult() {
        return result;
    }

    private void clearResult() {
        this.result = 0;
    }
}
