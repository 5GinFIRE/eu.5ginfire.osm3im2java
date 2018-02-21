package ietf.params.xml.ns.yang.ietf.inet.types.rev130715;

public enum IpVersion {
    /**
     * An unknown or unspecified version of the Internetprotocol.
     *
     */
    Unknown(0, "unknown"),
    
    /**
     * The IPv4 protocol as defined in RFC 791.
     *
     */
    Ipv4(1, "ipv4"),
    
    /**
     * The IPv6 protocol as defined in RFC 2460.
     *
     */
    Ipv6(2, "ipv6")
    ;

    private static final java.util.Map<java.lang.Integer, IpVersion> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, IpVersion> b = com.google.common.collect.ImmutableMap.builder();
        for (IpVersion enumItem : IpVersion.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private IpVersion(int value, java.lang.String name) {
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
     * @return corresponding IpVersion item
     */
    public static IpVersion forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
