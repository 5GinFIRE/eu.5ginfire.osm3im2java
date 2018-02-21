package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.CloudProvider;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping placement-group-input {
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
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/placement-group-input</i>
 *
 */
public interface PlacementGroupInput
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "placement-group-input").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.CloudAccountType</code> <code>cloudType</code>, or <code>null</code> if not present
     */
    CloudAccountType getCloudType();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.CloudProvider</code> <code>cloudProvider</code>, or <code>null</code> if not present
     */
    CloudProvider getCloudProvider();

}

