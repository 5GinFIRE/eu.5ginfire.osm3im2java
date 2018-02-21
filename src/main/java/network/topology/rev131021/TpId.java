package network.topology.rev131021;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import com.google.common.base.Preconditions;

import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri;

public class TpId extends Uri
 implements Serializable {
    private static final long serialVersionUID = -9043341782189787883L;


    @ConstructorProperties("value")
    public TpId(java.lang.String _value) {
        super(_value);
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public TpId(TpId source) {
        super(source);
    }
    /**
     * Creates a new instance from Uri
     *
     * @param source Source object
     */
    public TpId(Uri source) {
            super(source);
    }

    public static TpId getDefaultInstance(String defaultValue) {
        return new TpId(defaultValue);
    }





}

