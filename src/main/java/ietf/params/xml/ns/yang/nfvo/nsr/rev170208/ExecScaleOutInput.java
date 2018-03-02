package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * container input {
 *     leaf nsr_id_ref {
 *         type leafref;
 *     }
 *     leaf project-name {
 *         type project-name;
 *     }
 *     leaf scaling-group-name-ref {
 *         type leafref;
 *     }
 *     leaf instance-id {
 *         type uint64;
 *     }
 *     uses rpc-common;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/exec-scale-out/input</i>
 * 
 * <p>To create instances of this class use {@link ExecScaleOutInputBuilder}.
 * @see ExecScaleOutInputBuilder
 *
 */
public interface ExecScaleOutInput
    extends
    RpcCommon,
    DataObject,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "input").intern();

    /**
     * name of the scaling group
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>scalingGroupNameRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getScalingGroupNameRef();
    
    /**
     * id of the scaling group
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>instanceId</code>, or <code>null</code> if not present
     */
    BigInteger getInstanceId();

}

