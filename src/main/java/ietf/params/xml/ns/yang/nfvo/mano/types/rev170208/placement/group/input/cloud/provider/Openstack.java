package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HostAggregate;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.CloudProvider;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.openstack.AvailabilityZone;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.openstack.ServerGroup;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case openstack {
 *     container availability-zone {
 *         leaf name {
 *             type string;
 *         }
 *     }
 *     container server-group {
 *         leaf name {
 *             type string;
 *         }
 *     }
 *     list host-aggregate {
 *         key "metadata-key";
 *         leaf metadata-key {
 *             type string;
 *         }
 *         leaf metadata-value {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/placement-group-input/cloud-provider/openstack</i>
 *
 */
public interface Openstack
    extends
    DataObject,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Openstack>,
    HostAggregate,
    CloudProvider
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "openstack").intern();

    /**
     * Name of the Availability Zone
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.openstack.AvailabilityZone</code> <code>availabilityZone</code>, or <code>null</code> if not present
     */
    AvailabilityZone getAvailabilityZone();
    
    /**
     * Name of the Affinity/Anti-Affinity Server Group
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.openstack.ServerGroup</code> <code>serverGroup</code>, or <code>null</code> if not present
     */
    ServerGroup getServerGroup();

}

