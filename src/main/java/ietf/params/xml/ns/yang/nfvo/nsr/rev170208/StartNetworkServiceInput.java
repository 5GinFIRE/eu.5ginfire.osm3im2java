package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * container input {
 *     leaf name {
 *         type string;
 *     }
 *     leaf project-name {
 *         type project-name;
 *     }
 *     leaf nsd_id_ref {
 *         type leafref;
 *     }
 *     list scaling-group {
 *         key "scaling-group-name-ref";
 *         leaf scaling-group-name-ref {
 *             type string;
 *         }
 *         list instance {
 *             key "id";
 *             leaf id {
 *                 type uint16;
 *             }
 *         }
 *     }
 *     list nsd-placement-group-maps {
 *         key "placement-group-ref";
 *         leaf placement-group-ref {
 *             type string;
 *         }
 *         leaf cloud-type {
 *             type cloud-account-type;
 *         }
 *         choice cloud-provider {
 *             case aws {
 *                 leaf aws-construct {
 *                     type empty;
 *                 }
 *             }
 *             case cloudsim {
 *                 leaf cloudsim-construct {
 *                     type empty;
 *                 }
 *             }
 *             case mock {
 *                 leaf mock-construct {
 *                     type empty;
 *                 }
 *             }
 *             case openmano {
 *                 leaf openmano-construct {
 *                     type empty;
 *                 }
 *             }
 *             case openstack {
 *                 container availability-zone {
 *                     leaf name {
 *                         type string;
 *                     }
 *                 }
 *                 container server-group {
 *                     leaf name {
 *                         type string;
 *                     }
 *                 }
 *                 list host-aggregate {
 *                     key "metadata-key";
 *                     leaf metadata-key {
 *                         type string;
 *                     }
 *                     leaf metadata-value {
 *                         type string;
 *                     }
 *                 }
 *             }
 *             case vsphere {
 *                 leaf vsphere-construct {
 *                     type empty;
 *                 }
 *             }
 *         }
 *         uses placement-group-input;
 *     }
 *     list input-parameter {
 *         key "xpath";
 *         leaf xpath {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *     }
 *     list vnfd-placement-group-maps {
 *         key "placement-group-ref" "vnfd-id-ref";
 *         leaf vnfd-id-ref {
 *             type uuid;
 *         }
 *         leaf placement-group-ref {
 *             type leafref;
 *         }
 *         leaf cloud-type {
 *             type cloud-account-type;
 *         }
 *         choice cloud-provider {
 *             case aws {
 *                 leaf aws-construct {
 *                     type empty;
 *                 }
 *             }
 *             case cloudsim {
 *                 leaf cloudsim-construct {
 *                     type empty;
 *                 }
 *             }
 *             case mock {
 *                 leaf mock-construct {
 *                     type empty;
 *                 }
 *             }
 *             case openmano {
 *                 leaf openmano-construct {
 *                     type empty;
 *                 }
 *             }
 *             case openstack {
 *                 container availability-zone {
 *                     leaf name {
 *                         type string;
 *                     }
 *                 }
 *                 container server-group {
 *                     leaf name {
 *                         type string;
 *                     }
 *                 }
 *                 list host-aggregate {
 *                     key "metadata-key";
 *                     leaf metadata-key {
 *                         type string;
 *                     }
 *                     leaf metadata-value {
 *                         type string;
 *                     }
 *                 }
 *             }
 *             case vsphere {
 *                 leaf vsphere-construct {
 *                     type empty;
 *                 }
 *             }
 *         }
 *         list ssh-authorized-key {
 *             key "key-pair-ref";
 *             leaf key-pair-ref {
 *                 type leafref;
 *             }
 *         }
 *         list user {
 *             key "name";
 *             leaf name {
 *                 type string;
 *             }
 *             leaf user-info {
 *                 type string;
 *             }
 *             list ssh-authorized-key {
 *                 key "key-pair-ref";
 *                 leaf key-pair-ref {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *         uses placement-group-input;
 *     }
 *     uses rpc-project-name;
 *     uses ns-instance-config-params-common;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/start-network-service/input</i>
 * 
 * <p>To create instances of this class use {@link StartNetworkServiceInputBuilder}.
 * @see StartNetworkServiceInputBuilder
 *
 */
public interface StartNetworkServiceInput
    extends
    RpcProjectName,
    NsInstanceConfigParamsCommon,
    DataObject,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "input").intern();

    /**
     * Name of the Network Service
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Reference to NSD ID ref
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>nsdIdRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getNsdIdRef();
    
    /**
     * Mapping from mano-placement groups construct from VNFD to cloudplatform 
     * placement group construct
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfdPlacementGroupMaps</code>, or <code>null</code> if not present
     */
    List<VnfdPlacementGroupMaps> getVnfdPlacementGroupMaps();

}

