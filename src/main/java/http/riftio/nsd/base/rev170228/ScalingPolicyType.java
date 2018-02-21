package http.riftio.nsd.base.rev170228;

public enum ScalingPolicyType {
    Manual(1, "manual"),
    
    Automatic(2, "automatic")
    ;

    private static final java.util.Map<java.lang.Integer, ScalingPolicyType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ScalingPolicyType> b = com.google.common.collect.ImmutableMap.builder();
        for (ScalingPolicyType enumItem : ScalingPolicyType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private ScalingPolicyType(int value, java.lang.String name) {
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
     * @return corresponding ScalingPolicyType item
     */
    public static ScalingPolicyType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
