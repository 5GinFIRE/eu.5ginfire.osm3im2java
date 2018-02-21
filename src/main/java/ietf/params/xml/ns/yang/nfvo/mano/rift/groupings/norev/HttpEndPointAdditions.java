package ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-rift-groupings</b>
 * <pre>
 * grouping http-end-point-additions {
 *     leaf data {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-rift-groupings/http-end-point-additions</i>
 *
 */
public interface HttpEndPointAdditions
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-rift-groupings",
        "http-end-point-additions").intern();

    /**
     * This is the data to be sent with POST 
     *
     *
     *
     * @return <code>java.lang.String</code> <code>data</code>, or <code>null</code> if not present
     */
    java.lang.String getData();

}

