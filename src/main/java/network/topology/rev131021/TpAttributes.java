package network.topology.rev131021;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * The data objects needed to define a termination point.(This only includes a 
 * single leaf at this point, usedto identify the termination point.)Provided in a 
 * grouping so that in addition to the datastore,the data can also be included in 
 * notifications.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-network-topology</b>
 * <pre>
 * grouping tp-attributes {
 *     leaf tp-id {
 *         type tp-id;
 *     }
 *     leaf-list tp-ref {
 *         type tp-ref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-network-topology/tp-attributes</i>
 *
 */
public interface TpAttributes
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:TBD:params:xml:ns:yang:network-topology",
        "2013-10-21", "tp-attributes").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpId</code> <code>tpId</code>, or <code>null</code> if not present
     */
    TpId getTpId();
    
    /**
     * The leaf list identifies any termination points that thetermination point is 
     * dependent on, or maps onto.Those termination points will themselves be 
     * containedin a supporting node.This dependency information can be inferred 
     * fromthe dependencies between links. For this reason,this item is not separately 
     * configurable. Hence nocorresponding constraint needs to be articulated.The 
     * corresponding information is simply provided by theimplementing system.
     *
     *
     *
     * @return <code>java.util.List</code> <code>tpRef</code>, or <code>null</code> if not present
     */
    List<TpId> getTpRef();

}

