package CallingJavaFromKotlin;

public class Java {

    private int variable;
    private String nullable;

    void setVariable(int variable) {
        this.variable = variable;
    }

    int getVariable() {
        return variable;
    }


    boolean is() {
        return variable == 5;
    }

    public String getNullable() {
        return nullable;
    }

    public void setNullable(String nullable) {
        this.nullable = nullable;
    }
}
