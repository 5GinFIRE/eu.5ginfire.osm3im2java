package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.L2TerminationPointType;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Containing L2 TP attributes
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * container l2-termination-point-attributes {
 *     leaf description {
 *         type string;
 *     }
 *     leaf maximum-frame-size {
 *         type uint32;
 *     }
 *     choice l2-termination-point-type {
 *         case ethernet {
 *             leaf mac-address {
 *                 type mac-address;
 *             }
 *             leaf eth-encapsulation {
 *                 type identityref;
 *             }
 *             leaf port-vlan-id {
 *                 type vlan;
 *             }
 *             list vlan-id-name {
 *                 key "vlan-id";
 *                 leaf vlan-id {
 *                     type vlan;
 *                 }
 *                 leaf vlan-name {
 *                     type string;
 *                 }
 *             }
 *         }
 *         case legacy {
 *             leaf encapsulation {
 *                 type identityref;
 *             }
 *         }
 *     }
 *     leaf tp-state {
 *         type enumeration;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-termination-point-attributes/l2-termination-point-attributes</i>
 * 
 * <p>To create instances of this class use {@link L2TerminationPointAttributesBuilder}.
 * @see L2TerminationPointAttributesBuilder
 *
 */
public interface L2TerminationPointAttributes
    extends
    ChildOf<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointAttributes>,
    Augmentable<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes>
{


    public enum TpState {
        /**
         * the termination point is in forwarding state
         *
         */
        InUse(0, "in-use"),
        
        /**
         * the termination point is in blocking state
         *
         */
        Blocking(1, "blocking"),
        
        /**
         * the termination point is in down state
         *
         */
        Down(2, "down"),
        
        /**
         * the termination point is in other state
         *
         */
        Others(3, "others")
        ;
    
        private static final java.util.Map<java.lang.Integer, TpState> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, TpState> b = com.google.common.collect.ImmutableMap.builder();
            for (TpState enumItem : TpState.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private TpState(int value, java.lang.String name) {
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
         * @return corresponding TpState item
         */
        public static TpState forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-l2-topology",
        "2015-06-23", "l2-termination-point-attributes").intern();

    /**
     * Port description
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    java.lang.String getDescription();
    
    /**
     * Maximum frame size
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>maximumFrameSize</code>, or <code>null</code> if not present
     */
    java.lang.Long getMaximumFrameSize();
    
    /**
     * Indicates termination-point typespecific attributes
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.L2TerminationPointType</code> <code>l2TerminationPointType</code>, or <code>null</code> if not present
     */
    L2TerminationPointType getL2TerminationPointType();
    
    /**
     * State of the termination point
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes.TpState</code> <code>tpState</code>, or <code>null</code> if not present
     */
    TpState getTpState();

}

