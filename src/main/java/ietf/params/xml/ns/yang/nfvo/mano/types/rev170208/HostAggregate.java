package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping host-aggregate {
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
 * <i>mano-types/host-aggregate</i>
 *
 */
public interface HostAggregate
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "host-aggregate").intern();

    /**
     * Name of the Host Aggregate
     *
     *
     *
     * @return <code>java.util.List</code> <code>hostAggregate</code>, or <code>null</code> if not present
     */
    List<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate> getHostAggregate();

}

