package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Base identity from which specific ethernetencapsulation types are derived.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * identity eth-encapsulation-type {
 *     base "()IdentityEffectiveStatementImpl{qname=(urn:ietf:params:xml:ns:yang:ietf-l2-topology?revision=2015-06-23)encapsulation-type, path=AbsoluteSchemaPath{path=[(urn:ietf:params:xml:ns:yang:ietf-l2-topology?revision=2015-06-23)encapsulation-type]}}";
 *     description
 *         "Base identity from which specific ethernet
 *         encapsulation types are derived.";
 *     status CURRENT;
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/eth-encapsulation-type</i>
 *
 */
public abstract class EthEncapsulationType extends EncapsulationType
 {
    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-l2-topology",
        "2015-06-23", "eth-encapsulation-type").intern();


    public EthEncapsulationType() {
    
    
    }
    






}

