package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;

public enum HttpMethod {
    POST(0, "POST"),
    
    PUT(1, "PUT"),
    
    GET(2, "GET"),
    
    DELETE(3, "DELETE"),
    
    OPTIONS(4, "OPTIONS"),
    
    PATCH(5, "PATCH")
    ;

    private static final java.util.Map<java.lang.Integer, HttpMethod> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, HttpMethod> b = com.google.common.collect.ImmutableMap.builder();
        for (HttpMethod enumItem : HttpMethod.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private HttpMethod(int value, java.lang.String name) {
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
     * @return corresponding HttpMethod item
     */
    public static HttpMethod forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
