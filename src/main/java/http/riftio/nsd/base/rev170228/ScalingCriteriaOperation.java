package http.riftio.nsd.base.rev170228;

public enum ScalingCriteriaOperation {
    AND(1, "AND"),
    
    OR(2, "OR")
    ;

    private static final java.util.Map<java.lang.Integer, ScalingCriteriaOperation> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ScalingCriteriaOperation> b = com.google.common.collect.ImmutableMap.builder();
        for (ScalingCriteriaOperation enumItem : ScalingCriteriaOperation.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private ScalingCriteriaOperation(int value, java.lang.String name) {
        this.value = value;
        this.name = name;
    }

    /**
     * Returns the name of the enumeration item as it is specified in the input yang.
     *
     * @return the name of the enumeration item as it is specified in the input yang
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * @return integer value
     */
    public int getIntValue() {
        return value;
    }

    /**
     * @param valueArg integer value
     * @return corresponding ScalingCriteriaOperation item
     */
    public static ScalingCriteriaOperation forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
