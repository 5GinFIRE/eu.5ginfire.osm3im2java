package ietf.params.xml.ns.yang.ietf.network.rev150608;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import com.google.common.base.Preconditions;

import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri;

public class NetworkId extends Uri
 implements Serializable {
    private static final long serialVersionUID = 3157789058024872559L;


    @ConstructorProperties("value")
    public NetworkId(java.lang.String _value) {
        super(_value);
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NetworkId(NetworkId source) {
        super(source);
    }
    /**
     * Creates a new instance from Uri
     *
     * @param source Source object
     */
    public NetworkId(Uri source) {
            super(source);
    }

    public static NetworkId getDefaultInstance(String defaultValue) {
        return new NetworkId(defaultValue);
    }





}

