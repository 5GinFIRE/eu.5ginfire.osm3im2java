package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * vxlan encapsulation
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * identity vxlan {
 *     base "()IdentityEffectiveStatementImpl{qname=(urn:ietf:params:xml:ns:yang:ietf-l2-topology?revision=2015-06-23)eth-encapsulation-type, path=AbsoluteSchemaPath{path=[(urn:ietf:params:xml:ns:yang:ietf-l2-topology?revision=2015-06-23)eth-encapsulation-type]}}";
 *     description
 *         "vxlan encapsulation";
 *     status CURRENT;
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/vxlan</i>
 *
 */
public abstract class Vxlan extends EthEncapsulationType
 {
    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-l2-topology",
        "2015-06-23", "vxlan").intern();


    public Vxlan() {
    
    
    }
    






}

