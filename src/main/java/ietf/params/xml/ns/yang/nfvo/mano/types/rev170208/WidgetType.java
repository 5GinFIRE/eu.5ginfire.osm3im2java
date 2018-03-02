package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;

public enum WidgetType {
    COUNTER(0, "COUNTER"),
    
    GAUGE(1, "GAUGE"),
    
    TEXTBOX(2, "TEXTBOX"),
    
    SLIDER(3, "SLIDER"),
    
    HISTOGRAM(4, "HISTOGRAM"),
    
    BAR(5, "BAR")
    ;

    private static final java.util.Map<java.lang.Integer, WidgetType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, WidgetType> b = com.google.common.collect.ImmutableMap.builder();
        for (WidgetType enumItem : WidgetType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private WidgetType(int value, java.lang.String name) {
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
     * @return corresponding WidgetType item
     */
    public static WidgetType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
