package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.InputParameter;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.ScalingGroup;

import java.util.List;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * grouping ns-instance-config-params-common {
 *     list input-parameter {
 *         key "xpath";
 *         leaf xpath {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
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
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/ns-instance-config-params-common</i>
 *
 */
public interface NsInstanceConfigParamsCommon
    extends
    DataObject,
    InputParameter
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "ns-instance-config-params-common").intern();

    /**
     * List of ns scaling group instances
     *
     *
     *
     * @return <code>java.util.List</code> <code>scalingGroup</code>, or <code>null</code> if not present
     */
    List<ScalingGroup> getScalingGroup();
    
    /**
     * Mapping from mano-placement groups construct from NSD to cloudplatform placement
     * group construct
     *
     *
     *
     * @return <code>java.util.List</code> <code>nsdPlacementGroupMaps</code>, or <code>null</code> if not present
     */
    List<NsdPlacementGroupMaps> getNsdPlacementGroupMaps();

}

