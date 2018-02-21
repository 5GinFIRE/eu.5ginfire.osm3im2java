package network.topology.rev131021;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import com.google.common.base.Preconditions;

import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri;

public class NodeId extends Uri
 implements Serializable {
    private static final long serialVersionUID = 1905618053033346106L;


    @ConstructorProperties("value")
    public NodeId(java.lang.String _value) {
        super(_value);
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NodeId(NodeId source) {
        super(source);
    }
    /**
     * Creates a new instance from Uri
     *
     * @param source Source object
     */
    public NodeId(Uri source) {
            super(source);
    }

    public static NodeId getDefaultInstance(String defaultValue) {
        return new NodeId(defaultValue);
    }





}

