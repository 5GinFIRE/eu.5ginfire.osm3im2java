package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;

public enum VirtualLinkType {
    ELAN(0, "ELAN"),
    
    ELINE(1, "ELINE")
    ;

    private static final java.util.Map<java.lang.Integer, VirtualLinkType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, VirtualLinkType> b = com.google.common.collect.ImmutableMap.builder();
        for (VirtualLinkType enumItem : VirtualLinkType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private VirtualLinkType(int value, java.lang.String name) {
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
     * @return corresponding VirtualLinkType item
     */
    public static VirtualLinkType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
