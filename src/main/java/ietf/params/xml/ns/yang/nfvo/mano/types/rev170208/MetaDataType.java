package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;

public enum MetaDataType {
    STRING(0, "STRING")
    ;

    private static final java.util.Map<java.lang.Integer, MetaDataType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, MetaDataType> b = com.google.common.collect.ImmutableMap.builder();
        for (MetaDataType enumItem : MetaDataType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private MetaDataType(int value, java.lang.String name) {
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
     * @return corresponding MetaDataType item
     */
    public static MetaDataType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
