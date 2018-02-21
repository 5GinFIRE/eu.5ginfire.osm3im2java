package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;

public enum AggregationType {
    AVERAGE(0, "AVERAGE"),
    
    MINIMUM(1, "MINIMUM"),
    
    MAXIMUM(2, "MAXIMUM"),
    
    COUNT(3, "COUNT"),
    
    SUM(4, "SUM")
    ;

    private static final java.util.Map<java.lang.Integer, AggregationType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, AggregationType> b = com.google.common.collect.ImmutableMap.builder();
        for (AggregationType enumItem : AggregationType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private AggregationType(int value, java.lang.String name) {
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
     * @return corresponding AggregationType item
     */
    public static AggregationType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
