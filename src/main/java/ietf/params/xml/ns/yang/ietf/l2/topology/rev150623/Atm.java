package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Base identity from which specific ATMencapsulation types are derived.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * identity atm {
 *     base "()IdentityEffectiveStatementImpl{qname=(urn:ietf:params:xml:ns:yang:ietf-l2-topology?revision=2015-06-23)encapsulation-type, path=AbsoluteSchemaPath{path=[(urn:ietf:params:xml:ns:yang:ietf-l2-topology?revision=2015-06-23)encapsulation-type]}}";
 *     description
 *         "Base identity from which specific ATM
 *         encapsulation types are derived.";
 *     status CURRENT;
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/atm</i>
 *
 */
public abstract class Atm extends EncapsulationType
 {
    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-l2-topology",
        "2015-06-23", "atm").intern();


    public Atm() {
    
    
    }
    






}

