package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;

public enum ConfigStates {
    Init(0, "init"),
    
    Configuring(1, "configuring"),
    
    ConfigNotNeeded(2, "config_not_needed"),
    
    Configured(3, "configured"),
    
    Failed(4, "failed"),
    
    Terminate(5, "terminate")
    ;

    private static final java.util.Map<java.lang.Integer, ConfigStates> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ConfigStates> b = com.google.common.collect.ImmutableMap.builder();
        for (ConfigStates enumItem : ConfigStates.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private ConfigStates(int value, java.lang.String name) {
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
     * @return corresponding ConfigStates item
     */
    public static ConfigStates forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
