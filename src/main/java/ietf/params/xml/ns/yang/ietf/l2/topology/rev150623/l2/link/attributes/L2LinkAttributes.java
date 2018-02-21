package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.math.BigDecimal;

/**
 * Containing L2 link attributes
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * container l2-link-attributes {
 *     leaf name {
 *         type string;
 *     }
 *     leaf-list flag {
 *         type flag-type;
 *     }
 *     leaf rate {
 *         type decimal64;
 *     }
 *     leaf delay {
 *         type uint32;
 *     }
 *     leaf-list srlg {
 *         type uint32;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-link-attributes/l2-link-attributes</i>
 * 
 * <p>To create instances of this class use {@link L2LinkAttributesBuilder}.
 * @see L2LinkAttributesBuilder
 *
 */
public interface L2LinkAttributes
    extends
    ChildOf<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkAttributes>,
    Augmentable<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-l2-topology",
        "2015-06-23", "l2-link-attributes").intern();

    /**
     * Link name
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Link flags
     *
     *
     *
     * @return <code>java.util.List</code> <code>flag</code>, or <code>null</code> if not present
     */
    List<java.lang.Class<? extends ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.FlagIdentity>> getFlag();
    
    /**
     * Link rate
     *
     *
     *
     * @return <code>java.math.BigDecimal</code> <code>rate</code>, or <code>null</code> if not present
     */
    BigDecimal getRate();
    
    /**
     * Link delay in microseconds
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>delay</code>, or <code>null</code> if not present
     */
    java.lang.Long getDelay();
    
    /**
     * List of Shared Risk Link Groupsthis link belongs to.
     *
     *
     *
     * @return <code>java.util.List</code> <code>srlg</code>, or <code>null</code> if not present
     */
    List<java.lang.Long> getSrlg();

}

