package ietf.params.xml.ns.yang.ietf.yang.types.rev130715;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import com.google.common.base.Preconditions;

public class Timestamp extends Timeticks
 implements Serializable {
    private static final long serialVersionUID = -1618618198504997448L;


    @ConstructorProperties("value")
    public Timestamp(java.lang.Long _value) {
        super(_value);
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public Timestamp(Timestamp source) {
        super(source);
    }
    /**
     * Creates a new instance from Timeticks
     *
     * @param source Source object
     */
    public Timestamp(Timeticks source) {
            super(source);
    }

    public static Timestamp getDefaultInstance(String defaultValue) {
        return new Timestamp(java.lang.Long.valueOf(defaultValue));
    }





}

