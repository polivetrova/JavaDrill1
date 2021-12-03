package L19;

public class arrayDataException extends Throwable{

    public arrayDataException(int i, int k){
        super("Cannot parse element [" + i + "][" + k + "]");
    }
}
