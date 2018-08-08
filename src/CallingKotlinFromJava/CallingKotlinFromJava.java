package CallingKotlinFromJava;

import java.io.IOException;
import java.util.List;

public class CallingKotlinFromJava {

    public static void main(String[] args) {
        Kotlin kotlinCode = new Kotlin("Dan", "Rusu");

        kotlinCode.PrintName();

        defaultValues(kotlinCode);

        exceptionHandling(kotlinCode);

        signatureClash(kotlinCode);

    }

    private static void defaultValues(Kotlin kotlinCode) {
        kotlinCode.printDefaultValues();
        kotlinCode.printDefaultValues("Kyle");
        kotlinCode.printDefaultValues("Eugene", "Dhivo", "watching anime");
    }

    private static void exceptionHandling(Kotlin kotlinCode) {
        try {
            kotlinCode.throwException(true);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void signatureClash(Kotlin kotlinCode) {
        System.out.println(kotlinCode.getDansRealName());
        System.out.println(kotlinCode.getRealNameOfDan());
    }

    private static void checkExceptions(List<String> list, Appendable appendable) {
//        for (String token : list) {
//            appendable.append(token);
//        }
    }
}
