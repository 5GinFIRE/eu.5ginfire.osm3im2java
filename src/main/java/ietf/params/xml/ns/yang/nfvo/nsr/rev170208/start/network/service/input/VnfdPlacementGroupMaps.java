package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps.SshAuthorizedKey;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps.User;

import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Mapping from mano-placement groups construct from VNFD to cloudplatform 
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
 *     list ssh-authorized-key {
 *         key "key-pair-ref";
 *         leaf key-pair-ref {
 *             type leafref;
 *         }
 *     }
 *     list user {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf user-info {
 *             type string;
 *         }
 *         list ssh-authorized-key {
 *             key "key-pair-ref";
 *             leaf key-pair-ref {
 *                 type leafref;
 *             }
 *         }
 *     }
 *     uses placement-group-input;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/start-network-service/input/vnfd-placement-group-maps</i>
 * 
 * <p>To create instances of this class use {@link VnfdPlacementGroupMapsBuilder}.
 * @see VnfdPlacementGroupMapsBuilder
 * @see VnfdPlacementGroupMapsKey
 *
 */
public interface VnfdPlacementGroupMaps
    extends
    ChildOf<StartNetworkServiceInput>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps>,
    PlacementGroupInput,
    Identifiable<VnfdPlacementGroupMapsKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "vnfd-placement-group-maps").intern();

    /**
     * A reference to a vnfd. This is aleafref to 
     * path:../../../../project-nsd:constituent-vnfd+ [id = 
     * current()/../project-nsd:id-ref]+ /project-nsd:vnfd-id-refNOTE: An issue with 
     * confd is preventing theuse of xpath. Seems to be an issue with leafrefto 
     * leafref, whose target is in a different module.Once that is resovled this will 
     * switched to useleafref
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
     * List of authorized ssh keys as part of cloud-config
     *
     *
     *
     * @return <code>java.util.List</code> <code>sshAuthorizedKey</code>, or <code>null</code> if not present
     */
    List<SshAuthorizedKey> getSshAuthorizedKey();
    
    /**
     * List of users to be added through cloud-config
     *
     *
     *
     * @return <code>java.util.List</code> <code>user</code>, or <code>null</code> if not present
     */
    List<User> getUser();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMapsKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnfdPlacementGroupMapsKey getKey();

}

