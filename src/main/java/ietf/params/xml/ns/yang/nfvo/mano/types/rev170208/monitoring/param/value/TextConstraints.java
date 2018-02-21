package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.MonitoringParamValue;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container text-constraints {
 *     leaf min-length {
 *         type uint8;
 *     }
 *     leaf max-length {
 *         type uint8;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/monitoring-param-value/text-constraints</i>
 * 
 * <p>To create instances of this class use {@link TextConstraintsBuilder}.
 * @see TextConstraintsBuilder
 *
 */
public interface TextConstraints
    extends
    ChildOf<MonitoringParamValue>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.TextConstraints>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "text-constraints").intern();

    /**
     * Minimum string length for the parameter
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>minLength</code>, or <code>null</code> if not present
     */
    java.lang.Short getMinLength();
    
    /**
     * Maximum string length for the parameter
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>maxLength</code>, or <code>null</code> if not present
     */
    java.lang.Short getMaxLength();

}

