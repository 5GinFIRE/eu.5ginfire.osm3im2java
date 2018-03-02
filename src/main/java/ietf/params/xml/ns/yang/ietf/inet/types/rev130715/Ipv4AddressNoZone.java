package ietf.params.xml.ns.yang.ietf.inet.types.rev130715;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import com.google.common.base.Preconditions;

public class Ipv4AddressNoZone extends Ipv4Address
 implements Serializable {
    private static final long serialVersionUID = 5968212092585493753L;


    @ConstructorProperties("value")
    public Ipv4AddressNoZone(java.lang.String _value) {
        super(_value);
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public Ipv4AddressNoZone(Ipv4AddressNoZone source) {
        super(source);
    }
    /**
     * Creates a new instance from Ipv4Address
     *
     * @param source Source object
     */
    public Ipv4AddressNoZone(Ipv4Address source) {
            super(source);
    }

    public static Ipv4AddressNoZone getDefaultInstance(String defaultValue) {
        return new Ipv4AddressNoZone(defaultValue);
    }





}

