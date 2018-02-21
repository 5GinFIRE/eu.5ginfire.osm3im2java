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
 * container output {
 *     leaf instance-id {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/exec-scale-out/output</i>
 * 
 * <p>To create instances of this class use {@link ExecScaleOutOutputBuilder}.
 * @see ExecScaleOutOutputBuilder
 *
 */
public interface ExecScaleOutOutput
    extends
    DataObject,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "output").intern();

    /**
     * id of the scaling group
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>instanceId</code>, or <code>null</code> if not present
     */
    BigInteger getInstanceId();

}

