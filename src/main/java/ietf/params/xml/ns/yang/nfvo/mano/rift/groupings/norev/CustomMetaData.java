package ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * Grouping for instance-specific meta data
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-rift-groupings</b>
 * <pre>
 * grouping custom-meta-data {
 *     list custom-meta-data {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf data-type {
 *             type data-type;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *         leaf destination {
 *             type destination;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-rift-groupings/custom-meta-data</i>
 *
 */
public interface CustomMetaData
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-rift-groupings",
        "custom-meta-data").intern();

    /**
     * List of meta-data to be associated with the instance
     *
     *
     *
     * @return <code>java.util.List</code> <code>customMetaData</code>, or <code>null</code> if not present
     */
    List<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData> getCustomMetaData();

}

