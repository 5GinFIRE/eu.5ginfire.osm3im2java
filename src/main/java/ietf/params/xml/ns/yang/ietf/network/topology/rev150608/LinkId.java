package ietf.params.xml.ns.yang.ietf.network.topology.rev150608;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import com.google.common.base.Preconditions;

import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri;

public class LinkId extends Uri
 implements Serializable {
    private static final long serialVersionUID = 6924088992063290842L;


    @ConstructorProperties("value")
    public LinkId(java.lang.String _value) {
        super(_value);
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public LinkId(LinkId source) {
        super(source);
    }
    /**
     * Creates a new instance from Uri
     *
     * @param source Source object
     */
    public LinkId(Uri source) {
            super(source);
    }

    public static LinkId getDefaultInstance(String defaultValue) {
        return new LinkId(defaultValue);
    }





}

