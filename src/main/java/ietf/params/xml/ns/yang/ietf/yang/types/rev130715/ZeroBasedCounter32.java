package ietf.params.xml.ns.yang.ietf.yang.types.rev130715;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import com.google.common.base.Preconditions;

public class ZeroBasedCounter32 extends Counter32
 implements Serializable {
    private static final long serialVersionUID = 7512027574588325721L;


    @ConstructorProperties("value")
    public ZeroBasedCounter32(java.lang.Long _value) {
        super(_value);
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ZeroBasedCounter32(ZeroBasedCounter32 source) {
        super(source);
    }
    /**
     * Creates a new instance from Counter32
     *
     * @param source Source object
     */
    public ZeroBasedCounter32(Counter32 source) {
            super(source);
    }

    public static ZeroBasedCounter32 getDefaultInstance(String defaultValue) {
        return new ZeroBasedCounter32(java.lang.Long.valueOf(defaultValue));
    }





}

