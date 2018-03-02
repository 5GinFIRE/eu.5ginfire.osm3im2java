package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * container output {
 *     leaf nsr-id {
 *         type uuid;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/start-network-service/output</i>
 * 
 * <p>To create instances of this class use {@link StartNetworkServiceOutputBuilder}.
 * @see StartNetworkServiceOutputBuilder
 *
 */
public interface StartNetworkServiceOutput
    extends
    DataObject,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "output").intern();

    /**
     * Automatically generated parameter
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>nsrId</code>, or <code>null</code> if not present
     */
    Uuid getNsrId();

}

