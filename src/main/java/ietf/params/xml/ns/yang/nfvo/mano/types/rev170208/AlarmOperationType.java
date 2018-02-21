package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;

public enum AlarmOperationType {
    GE(0, "GE"),
    
    LE(1, "LE"),
    
    GT(2, "GT"),
    
    LT(3, "LT"),
    
    EQ(4, "EQ")
    ;

    private static final java.util.Map<java.lang.Integer, AlarmOperationType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, AlarmOperationType> b = com.google.common.collect.ImmutableMap.builder();
        for (AlarmOperationType enumItem : AlarmOperationType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private AlarmOperationType(int value, java.lang.String name) {
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
     * @return corresponding AlarmOperationType item
     */
    public static AlarmOperationType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
