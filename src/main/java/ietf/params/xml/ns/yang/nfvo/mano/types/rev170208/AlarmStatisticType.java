package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;

public enum AlarmStatisticType {
    AVERAGE(0, "AVERAGE"),
    
    MINIMUM(1, "MINIMUM"),
    
    MAXIMUM(2, "MAXIMUM"),
    
    COUNT(3, "COUNT"),
    
    SUM(4, "SUM")
    ;

    private static final java.util.Map<java.lang.Integer, AlarmStatisticType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, AlarmStatisticType> b = com.google.common.collect.ImmutableMap.builder();
        for (AlarmStatisticType enumItem : AlarmStatisticType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private AlarmStatisticType(int value, java.lang.String name) {
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
     * @return corresponding AlarmStatisticType item
     */
    public static AlarmStatisticType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
