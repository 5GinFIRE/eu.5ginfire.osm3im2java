package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping rpc-project-name {
 *     leaf project-name {
 *         type project-name;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/rpc-project-name</i>
 *
 */
public interface RpcProjectName
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "rpc-project-name").intern();

    /**
     * Project to which this belongs
     *
     *
     *
     * @return <code>java.lang.String</code> <code>projectName</code>, or <code>null</code> if not present
     */
    java.lang.String getProjectName();

}

