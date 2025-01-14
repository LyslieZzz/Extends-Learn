package exception;
//根据业务需要，创建一个自定义异常，并让它继承自java已有的运行时异常类RuntimeException
public class AgeIllegalRuntimeException extends RuntimeException{
    public AgeIllegalRuntimeException(String message) {
        super(message);
    }
    public AgeIllegalRuntimeException() {
    }
}
