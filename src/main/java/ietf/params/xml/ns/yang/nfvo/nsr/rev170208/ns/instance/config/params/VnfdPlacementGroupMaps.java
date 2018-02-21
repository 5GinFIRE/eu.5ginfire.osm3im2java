package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParams;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Mapping from mano-placement groups construct from VNFD to cloud platform 
 * placement group construct
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list vnfd-placement-group-maps {
 *     key "placement-group-ref" "vnfd-id-ref";
 *     leaf vnfd-id-ref {
 *         type uuid;
 *     }
 *     leaf placement-group-ref {
 *         type leafref;
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
 * <i>nsr/ns-instance-config-params/vnfd-placement-group-maps</i>
 * 
 * <p>To create instances of this class use {@link VnfdPlacementGroupMapsBuilder}.
 * @see VnfdPlacementGroupMapsBuilder
 * @see VnfdPlacementGroupMapsKey
 *
 */
public interface VnfdPlacementGroupMaps
    extends
    ChildOf<NsInstanceConfigParams>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.VnfdPlacementGroupMaps>,
    PlacementGroupInput,
    Identifiable<VnfdPlacementGroupMapsKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "vnfd-placement-group-maps").intern();

    /**
     * A reference to a vnfd. This is aleafref to 
     * path:../../../../project-nsd:constituent-vnfd+ [id = current()/../id-ref]+ 
     * /project-nsd:vnfd-id-refNOTE: An issue with confd is preventing theuse of xpath.
     * Seems to be an issue with leafrefto leafref, whose target is in a different 
     * module.Once that is resolved this will switched to useleafref
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    Uuid getVnfdIdRef();
    
    /**
     * A reference to VNFD placement group
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>placementGroupRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getPlacementGroupRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.VnfdPlacementGroupMapsKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnfdPlacementGroupMapsKey getKey();

}

