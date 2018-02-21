package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * trill encapsulation
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * identity trill {
 *     base "()IdentityEffectiveStatementImpl{qname=(urn:ietf:params:xml:ns:yang:ietf-l2-topology?revision=2015-06-23)eth-encapsulation-type, path=AbsoluteSchemaPath{path=[(urn:ietf:params:xml:ns:yang:ietf-l2-topology?revision=2015-06-23)eth-encapsulation-type]}}";
 *     description
 *         "trill encapsulation";
 *     status CURRENT;
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/trill</i>
 *
 */
public abstract class Trill extends EthEncapsulationType
 {
    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-l2-topology",
        "2015-06-23", "trill").intern();


    public Trill() {
    
    
    }
    






}

