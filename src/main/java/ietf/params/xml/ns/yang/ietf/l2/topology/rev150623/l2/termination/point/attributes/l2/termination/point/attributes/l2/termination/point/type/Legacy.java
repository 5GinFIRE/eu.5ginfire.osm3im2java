package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.L2TerminationPointType;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * case legacy {
 *     leaf encapsulation {
 *         type identityref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-termination-point-attributes/l2-termination-point-attributes/l2-termination-point-type/legacy</i>
 *
 */
public interface Legacy
    extends
    DataObject,
    Augmentable<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Legacy>,
    L2TerminationPointType
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-l2-topology",
        "2015-06-23", "legacy").intern();

    /**
     * Encapsulation type of this termination point.
     *
     *
     *
     * @return <code>java.lang.Class</code> <code>encapsulation</code>, or <code>null</code> if not present
     */
    java.lang.Class<? extends ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.EncapsulationType> getEncapsulation();

}

