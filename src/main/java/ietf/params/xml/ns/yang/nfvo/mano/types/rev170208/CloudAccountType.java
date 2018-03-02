package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;

public enum CloudAccountType {
    Aws(0, "aws"),
    
    Cloudsim(1, "cloudsim"),
    
    CloudsimProxy(2, "cloudsim_proxy"),
    
    Mock(3, "mock"),
    
    Openmano(4, "openmano"),
    
    Openstack(5, "openstack"),
    
    Vsphere(6, "vsphere"),
    
    Openvim(7, "openvim")
    ;

    private static final java.util.Map<java.lang.Integer, CloudAccountType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, CloudAccountType> b = com.google.common.collect.ImmutableMap.builder();
        for (CloudAccountType enumItem : CloudAccountType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private CloudAccountType(int value, java.lang.String name) {
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
     * @return corresponding CloudAccountType item
     */
    public static CloudAccountType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
