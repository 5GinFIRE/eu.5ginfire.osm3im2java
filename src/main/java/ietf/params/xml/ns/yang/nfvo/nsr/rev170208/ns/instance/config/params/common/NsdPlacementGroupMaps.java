package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Mapping from mano-placement groups construct from NSD to cloudplatform 
 * group construct
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list nsd-placement-group-maps {
 *     key "placement-group-ref";
 *     leaf placement-group-ref {
 *         type string;
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
 *     uses placement-group-input;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/ns-instance-config-params-common/nsd-placement-group-maps</i>
 * 
 * <p>To create instances of this class use {@link NsdPlacementGroupMapsBuilder}.
 * @see NsdPlacementGroupMapsBuilder
 * @see NsdPlacementGroupMapsKey
 *
 */
public interface NsdPlacementGroupMaps
    extends
    ChildOf<NsInstanceConfigParamsCommon>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps>,
    PlacementGroupInput,
    Identifiable<NsdPlacementGroupMapsKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "nsd-placement-group-maps").intern();

    /**
     * Reference for NSD placement group
     *
     *
     *
     * @return <code>java.lang.String</code> <code>placementGroupRef</code>, or <code>null</code> if not present
     */
    java.lang.String getPlacementGroupRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMapsKey</code> <code>key</code>, or <code>null</code> if not present
     */
    NsdPlacementGroupMapsKey getKey();

}

