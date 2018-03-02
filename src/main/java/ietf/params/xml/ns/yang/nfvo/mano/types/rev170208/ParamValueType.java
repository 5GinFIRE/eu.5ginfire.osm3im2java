package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;

public enum ParamValueType {
    INT(0, "INT"),
    
    DECIMAL(1, "DECIMAL"),
    
    STRING(2, "STRING")
    ;

    private static final java.util.Map<java.lang.Integer, ParamValueType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ParamValueType> b = com.google.common.collect.ImmutableMap.builder();
        for (ParamValueType enumItem : ParamValueType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private ParamValueType(int value, java.lang.String name) {
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
     * @return corresponding ParamValueType item
     */
    public static ParamValueType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
