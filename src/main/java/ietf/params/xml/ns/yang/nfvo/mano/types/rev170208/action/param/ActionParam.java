package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HttpMethod;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of action parameters tocontrol VNF
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list action-param {
 *     key "id";
 *     leaf id {
 *         type string;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf description {
 *         type string;
 *     }
 *     leaf group-tag {
 *         type string;
 *     }
 *     leaf url {
 *         type uri;
 *     }
 *     leaf method {
 *         type method;
 *     }
 *     leaf payload {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/action-param/action-param</i>
 * 
 * <p>To create instances of this class use {@link ActionParamBuilder}.
 * @see ActionParamBuilder
 * @see ActionParamKey
 *
 */
public interface ActionParam
    extends
    ChildOf<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ActionParam>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam>,
    Identifiable<ActionParamKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "action-param").intern();

    /**
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    java.lang.String getId();
    
    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    java.lang.String getDescription();
    
    /**
     * A tag to group monitoring parameter
     *
     *
     *
     * @return <code>java.lang.String</code> <code>groupTag</code>, or <code>null</code> if not present
     */
    java.lang.String getGroupTag();
    
    /**
     * This is the URL where to perform the operation
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri</code> <code>url</code>, or <code>null</code> if not present
     */
    Uri getUrl();
    
    /**
     * This is the method to be performed at the uri.POST by default for action
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HttpMethod</code> <code>method</code>, or <code>null</code> if not present
     */
    HttpMethod getMethod();
    
    /**
     * This is the operation payload or payload template to be sent inthe data for this
     * operation call
     *
     *
     *
     * @return <code>java.lang.String</code> <code>payload</code>, or <code>null</code> if not present
     */
    java.lang.String getPayload();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParamKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ActionParamKey getKey();

}

