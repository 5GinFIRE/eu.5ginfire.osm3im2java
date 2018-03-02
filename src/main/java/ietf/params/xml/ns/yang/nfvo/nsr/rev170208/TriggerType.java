package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;

public enum TriggerType {
    NsPrimitive(0, "ns-primitive"),
    
    VnfPrimitive(1, "vnf-primitive")
    ;

    private static final java.util.Map<java.lang.Integer, TriggerType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, TriggerType> b = com.google.common.collect.ImmutableMap.builder();
        for (TriggerType enumItem : TriggerType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private TriggerType(int value, java.lang.String name) {
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
     * @return corresponding TriggerType item
     */
    public static TriggerType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
