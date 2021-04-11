package enums;

public enum SortingParameter {
    WEIGHT("weight"),
    SUGAR_PERCENTAGE("sugar percentage");

    private final String parameterName;

    SortingParameter(String name) {
        this.parameterName = name;
    }

    public String getParameterName() {
        return parameterName;
    }
}
