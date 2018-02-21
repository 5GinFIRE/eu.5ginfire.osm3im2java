package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.openstack;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Name of the Availability Zone
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container availability-zone {
 *     leaf name {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/placement-group-input/cloud-provider/openstack/availability-zone</i>
 * 
 * <p>To create instances of this class use {@link AvailabilityZoneBuilder}.
 * @see AvailabilityZoneBuilder
 *
 */
public interface AvailabilityZone
    extends
    ChildOf<PlacementGroupInput>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.openstack.AvailabilityZone>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "availability-zone").intern();

    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();

}

