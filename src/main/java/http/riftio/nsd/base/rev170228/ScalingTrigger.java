package http.riftio.nsd.base.rev170228;

public enum ScalingTrigger {
    PreScaleIn(1, "pre-scale-in"),
    
    PostScaleIn(2, "post-scale-in"),
    
    PreScaleOut(3, "pre-scale-out"),
    
    PostScaleOut(4, "post-scale-out")
    ;

    private static final java.util.Map<java.lang.Integer, ScalingTrigger> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ScalingTrigger> b = com.google.common.collect.ImmutableMap.builder();
        for (ScalingTrigger enumItem : ScalingTrigger.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private ScalingTrigger(int value, java.lang.String name) {
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
     * @return corresponding ScalingTrigger item
     */
    public static ScalingTrigger forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
