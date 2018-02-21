package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * container input {
 *     leaf name {
 *         type string;
 *     }
 *     leaf nsr_id_ref {
 *         type leafref;
 *     }
 *     leaf project-name {
 *         type project-name;
 *     }
 *     uses rpc-common;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/get-ns-service-primitive-values/input</i>
 * 
 * <p>To create instances of this class use {@link GetNsServicePrimitiveValuesInputBuilder}.
 * @see GetNsServicePrimitiveValuesInputBuilder
 *
 */
public interface GetNsServicePrimitiveValuesInput
    extends
    RpcCommon,
    DataObject,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "input").intern();

    /**
     * Name of the NS service primitive group
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();

}

