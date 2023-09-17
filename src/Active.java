public class Active {
    private final String name;
    private final String code;
    private final String type;
    private final double actualValue;

    public Active(String name, String code, String type, double actualValue) {
        this.name = name;
        this.code = code;
        this.type = type;
        this.ActualValue = actualValue;
    }

    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public double getActualValue() {
        return actualValue;
    }
    public String getCode() {
        return code;
    }

}