package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.NfviMetrics;

import java.math.BigInteger;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.math.BigDecimal;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container vcpu {
 *     leaf label {
 *         type label;
 *     }
 *     leaf total {
 *         type uint64;
 *     }
 *     leaf utilization {
 *         type decimal64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/nfvi-metrics/vcpu</i>
 * 
 * <p>To create instances of this class use {@link VcpuBuilder}.
 * @see VcpuBuilder
 *
 */
public interface Vcpu
    extends
    ChildOf<NfviMetrics>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "vcpu").intern();

    /**
     * Label to show in UI
     *
     *
     *
     * @return <code>java.lang.String</code> <code>label</code>, or <code>null</code> if not present
     */
    java.lang.String getLabel();
    
    /**
     * The total number of VCPUs available.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>total</code>, or <code>null</code> if not present
     */
    BigInteger getTotal();
    
    /**
     * The VCPU utilization (percentage).
     *
     *
     *
     * @return <code>java.math.BigDecimal</code> <code>utilization</code>, or <code>null</code> if not present
     */
    BigDecimal getUtilization();

}

