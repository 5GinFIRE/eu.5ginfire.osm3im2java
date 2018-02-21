package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * grouping rpc-common {
 *     leaf project-name {
 *         type project-name;
 *     }
 *     leaf nsr_id_ref {
 *         type leafref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/rpc-common</i>
 *
 */
public interface RpcCommon
    extends
    DataObject,
    RpcProjectName
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "rpc-common").intern();

    /**
     * Reference to NSR ID ref
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>nsrIdRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getNsrIdRef();

}

