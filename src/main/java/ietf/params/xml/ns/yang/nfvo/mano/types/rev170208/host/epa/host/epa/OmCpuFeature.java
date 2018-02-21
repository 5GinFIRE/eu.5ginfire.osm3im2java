package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of OpenMANO CPU features
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list om-cpu-feature {
 *     key "feature";
 *     leaf feature {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/host-epa/host-epa/om-cpu-feature</i>
 * 
 * <p>To create instances of this class use {@link OmCpuFeatureBuilder}.
 * @see OmCpuFeatureBuilder
 * @see OmCpuFeatureKey
 *
 */
public interface OmCpuFeature
    extends
    ChildOf<HostEpa>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.OmCpuFeature>,
    Identifiable<OmCpuFeatureKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "om-cpu-feature").intern();

    /**
     * CPU feature
     *
     *
     *
     * @return <code>java.lang.String</code> <code>feature</code>, or <code>null</code> if not present
     */
    java.lang.String getFeature();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.OmCpuFeatureKey</code> <code>key</code>, or <code>null</code> if not present
     */
    OmCpuFeatureKey getKey();

}

