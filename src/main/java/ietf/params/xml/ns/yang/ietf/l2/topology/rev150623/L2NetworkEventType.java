package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623;

public enum L2NetworkEventType {
    /**
     * An L2 node or link or termination-pointhas been added
     *
     */
    Add(0, "add"),
    
    /**
     * An L2 node or link or termination-pointhas been removed
     *
     */
    Remove(1, "remove"),
    
    /**
     * An L2 node or link or termination-pointhas been updated
     *
     */
    Update(2, "update")
    ;

    private static final java.util.Map<java.lang.Integer, L2NetworkEventType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, L2NetworkEventType> b = com.google.common.collect.ImmutableMap.builder();
        for (L2NetworkEventType enumItem : L2NetworkEventType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private L2NetworkEventType(int value, java.lang.String name) {
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
     * @return corresponding L2NetworkEventType item
     */
    public static L2NetworkEventType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
