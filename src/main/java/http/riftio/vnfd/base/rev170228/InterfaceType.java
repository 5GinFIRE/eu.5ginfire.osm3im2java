package http.riftio.vnfd.base.rev170228;

public enum InterfaceType {
    INTERNAL(0, "INTERNAL"),
    
    EXTERNAL(1, "EXTERNAL")
    ;

    private static final java.util.Map<java.lang.Integer, InterfaceType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, InterfaceType> b = com.google.common.collect.ImmutableMap.builder();
        for (InterfaceType enumItem : InterfaceType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private InterfaceType(int value, java.lang.String name) {
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
     * @return corresponding InterfaceType item
     */
    public static InterfaceType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
