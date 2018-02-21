package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.PlacementGroupInfo;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Placement groups to which this VDU belongs and itscloud construct
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * list placement-groups-info {
 *     key "name";
 *     leaf name {
 *         type string;
 *     }
 *     leaf requirement {
 *         type string;
 *     }
 *     leaf strategy {
 *         type strategy;
 *     }
 *     leaf cloud-type {
 *         type cloud-account-type;
 *     }
 *     choice cloud-provider {
 *         case aws {
 *             leaf aws-construct {
 *                 type empty;
 *             }
 *         }
 *         case cloudsim {
 *             leaf cloudsim-construct {
 *                 type empty;
 *             }
 *         }
 *         case mock {
 *             leaf mock-construct {
 *                 type empty;
 *             }
 *         }
 *         case openmano {
 *             leaf openmano-construct {
 *                 type empty;
 *             }
 *         }
 *         case openstack {
 *             container availability-zone {
 *                 leaf name {
 *                     type string;
 *                 }
 *             }
 *             container server-group {
 *                 leaf name {
 *                     type string;
 *                 }
 *             }
 *             list host-aggregate {
 *                 key "metadata-key";
 *                 leaf metadata-key {
 *                     type string;
 *                 }
 *                 leaf metadata-value {
 *                     type string;
 *                 }
 *             }
 *         }
 *         case vsphere {
 *             leaf vsphere-construct {
 *                 type empty;
 *             }
 *         }
 *     }
 *     uses placement-group-info;
 *     uses placement-group-input;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/placement-group-info/placement-groups-info</i>
 * 
 * <p>To create instances of this class use {@link PlacementGroupsInfoBuilder}.
 * @see PlacementGroupsInfoBuilder
 * @see PlacementGroupsInfoKey
 *
 */
public interface PlacementGroupsInfo
    extends
    ChildOf<PlacementGroupInfo>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo>,
    ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo,
    PlacementGroupInput,
    Identifiable<PlacementGroupsInfoKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfr",
        "2017-02-28", "placement-groups-info").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfoKey</code> <code>key</code>, or <code>null</code> if not present
     */
    PlacementGroupsInfoKey getKey();

}

