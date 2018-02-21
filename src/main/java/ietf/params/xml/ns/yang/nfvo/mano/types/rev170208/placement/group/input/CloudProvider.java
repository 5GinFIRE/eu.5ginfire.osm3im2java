package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input;
import org.opendaylight.yangtools.yang.binding.DataContainer;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * choice cloud-provider {
 *     case aws {
 *         leaf aws-construct {
 *             type empty;
 *         }
 *     }
 *     case cloudsim {
 *         leaf cloudsim-construct {
 *             type empty;
 *         }
 *     }
 *     case mock {
 *         leaf mock-construct {
 *             type empty;
 *         }
 *     }
 *     case openmano {
 *         leaf openmano-construct {
 *             type empty;
 *         }
 *     }
 *     case openstack {
 *         container availability-zone {
 *             leaf name {
 *                 type string;
 *             }
 *         }
 *         container server-group {
 *             leaf name {
 *                 type string;
 *             }
 *         }
 *         list host-aggregate {
 *             key "metadata-key";
 *             leaf metadata-key {
 *                 type string;
 *             }
 *             leaf metadata-value {
 *                 type string;
 *             }
 *         }
 *     }
 *     case vsphere {
 *         leaf vsphere-construct {
 *             type empty;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/placement-group-input/cloud-provider</i>
 *
 */
public interface CloudProvider
    extends
    DataContainer
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "cloud-provider").intern();


}

