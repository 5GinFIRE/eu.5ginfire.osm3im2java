package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;

public enum JsonQueryMethod {
    NAMEKEY(0, "NAMEKEY"),
    
    JSONPATH(1, "JSONPATH"),
    
    OBJECTPATH(2, "OBJECTPATH")
    ;

    private static final java.util.Map<java.lang.Integer, JsonQueryMethod> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, JsonQueryMethod> b = com.google.common.collect.ImmutableMap.builder();
        for (JsonQueryMethod enumItem : JsonQueryMethod.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private JsonQueryMethod(int value, java.lang.String name) {
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
     * @return corresponding JsonQueryMethod item
     */
    public static JsonQueryMethod forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
